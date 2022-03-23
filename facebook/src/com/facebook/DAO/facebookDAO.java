package com.facebook.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.facebook.entity.facebookuser;

public class facebookDAO implements facebookDAOinterface {
	Connection con =null;
	public facebookDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Suma123");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
 

	@Override
	public int deleteprofileDAO(facebookuser fu) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement(" delete from facebookuser where name=?");
		    ps.setString(1,fu.getName());
		    i=ps.executeUpdate();
		  		}
		  		catch(Exception e) {
		  			e.printStackTrace();
		  		}
		  		return i;
		  	}

	@Override
	public facebookuser viewprofileDAO(facebookuser fu) {
		facebookuser s1=null;
		try {
			
			PreparedStatement ps=con.prepareStatement("select*from facebookuser where address=?");
			 ps.setString(1,fu.getAddress());
			 
			 ResultSet res=ps.executeQuery();
			 if(res.next()) {
				 String n=res.getString(1);
				 String p=res.getString(2);
				 String e=res.getString(3);
				 String a=res.getString(4);
				 s1=new facebookuser();				 

				 s1.setName(n);
				 s1.setPassword(p);
				 s1.setEmail(e);
				 s1.setAddress(a);
				 
				 
			 }
			 
  		}
  		catch(Exception e) {
  			e.printStackTrace();
  		}
  		return s1;
	}

	@Override
	public int searchprofileDAO(facebookuser fu) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement(" select*from facebookuser where name=?");
		    ps.setString(1,fu.getName());
		    i=ps.executeUpdate();
		  		}
		  		catch(Exception e) {
		  			e.printStackTrace();
		  		}
		  		return i;
		  	}

	@Override
	public int editprofileDAO(facebookuser fu) {
		
		
		
		return 0;
	}

	@Override
	public List<facebookuser> viewallprofileDAO() {
		List<facebookuser> ll=new ArrayList<facebookuser>();
		try {
			PreparedStatement ps=con.prepareStatement("select*from facebookuser");
			
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				facebookuser s1=new facebookuser();
				s1.setName(n);
				s1.setPassword(p);
				s1.setEmail(e);
				s1.setAddress(a);
				ll.add(s1);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public int signupprofileDAO(facebookuser fu) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		    ps.setString(1,fu.getName());
		    ps.setString(2,fu.getPassword());
		    ps.setString(3,fu.getEmail());
		    ps.setString(4,fu.getAddress());
		    
		    i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}


	@Override
	public facebookuser signinprofileDAO(facebookuser fu) {
		facebookuser data = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from facebookuser where email=?");
			ps.setString(1,fu.getEmail());
			
			ResultSet s1 =ps.executeQuery();
			if(s1.next()) {
				String p=s1.getString(2);
				String e=s1.getString(3);
				
				data=new facebookuser();
				
				data.setPassword(p);
				data.setEmail(e);			
			}
		}
		catch(Exception e)  {
			e.printStackTrace();
			
		}
		return data;
	}
	}


