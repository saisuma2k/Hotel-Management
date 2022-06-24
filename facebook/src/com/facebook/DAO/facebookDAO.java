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
			
			PreparedStatement ps=con.prepareStatement(" delete from facebookuser where email=?");
		    ps.setString(1,fu.getEmail());
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
			
			PreparedStatement ps=con.prepareStatement("select*from facebookuser where email=?");
			 ps.setString(1,fu.getEmail());
			 
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
	public ArrayList<facebookuser> searchprofileDAO(facebookuser fu) {
		ArrayList<facebookuser> ll = new ArrayList<facebookuser>();
		facebookuser user= null;
		try {
			
			PreparedStatement ps=con.prepareStatement(" select*from facebookuser where name=?");
		    ps.setString(1,fu.getName());
		    ResultSet res = ps.executeQuery();
		    while (res.next()) {
		    	String n = res.getString(1);
		    	String p = res.getString(2);
		    	String e = res.getString(3);
		    	String a = res.getString(4);
		    	
		    	user = new facebookuser();
		    	user.setName(n);
		    	user.setPassword(p);
		    	user.setEmail(e);
		    	user.setAddress(a);
		    	
		    	ll.add(user);
		    }
		  	}
		catch(Exception e) {
  			e.printStackTrace();
  			}
		return ll;
	}

	@Override
	public int editprofileDAO(facebookuser fu, facebookuser fu1) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("update facebookuser set name=?,password=?,address=? where email = ?");
		    ps.setString(1,fu1.getName());
		    ps.setString(2,fu1.getPassword());
		    ps.setString(3,fu1.getAddress());
		    ps.setString(4,fu.getEmail());
		    
		    i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public ArrayList<facebookuser> viewallprofileDAO() {
		ArrayList<facebookuser> ll=new ArrayList<facebookuser>();
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
		facebookuser user = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from facebookuser where email=?");
			ps.setString(1,fu.getEmail());
			
			ResultSet s =ps.executeQuery();
			if(s.next()) {
				String n=s.getString(1);
				String p=s.getString(2);
				String e=s.getString(3);
				String a=s.getString(4);
				user=new facebookuser();
				user.setName(n);
				user.setPassword(p);
				user.setEmail(e);
				user.setAddress(a);			
			}
		}
		catch(Exception e)  {
			e.printStackTrace();
			
		}
		return user;
	}
	}


