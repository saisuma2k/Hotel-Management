package com.facebook.service;

import java.util.ArrayList;
import java.util.List;

import com.facebook.DAO.facebookDAOinterface;
import com.facebook.entity.facebookuser;
import com.facebook.utility.DAOfactory;

public class facebookservice implements facebookserviceinterface {

	

	@Override
	public int deleteprofileservice(facebookuser fu) {
        facebookDAOinterface fi= DAOfactory.createobject();
        
		return fi.deleteprofileDAO(fu);
	}

	@Override
	public facebookuser viewprofileservice(facebookuser fu) {
		facebookDAOinterface fi= DAOfactory.createobject();
		return fi.viewprofileDAO(fu);
	}

	@Override
	public ArrayList<facebookuser> searchprofileservice(facebookuser fu) {
		facebookDAOinterface fi= DAOfactory.createobject();
		
		return fi.searchprofileDAO(fu);
	}

	@Override
	public int editprofileservice(facebookuser fu, facebookuser fu1) {
		facebookDAOinterface fi= DAOfactory.createobject();
		
		return fi.editprofileDAO(fu, fu1);
	}

	@Override
	public ArrayList<facebookuser> viewallprofieservice() {
		facebookDAOinterface fi= DAOfactory.createobject();
		return fi.viewallprofileDAO();
		
	}

	@Override
	public int signupprofileservice(facebookuser fu) {
facebookDAOinterface fi= DAOfactory.createobject();
		
		
		return fi.signupprofileDAO(fu);
		
	
	}

	@Override
	public facebookuser signinprofileservice(facebookuser fu) {
		facebookDAOinterface fi= DAOfactory.createobject();
		return fi.viewprofileDAO(fu);
		
	}

}
