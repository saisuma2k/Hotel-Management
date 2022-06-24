package com.facebook.DAO;

import java.util.ArrayList;
import java.util.List;

import com.facebook.entity.facebookuser;

public interface facebookDAOinterface {


	int deleteprofileDAO(facebookuser fu);

	facebookuser viewprofileDAO(facebookuser fu);

	ArrayList<facebookuser> searchprofileDAO(facebookuser fu);

	int editprofileDAO(facebookuser fu, facebookuser fu1);

	ArrayList<facebookuser> viewallprofileDAO();

	int signupprofileDAO(facebookuser fu);

	facebookuser signinprofileDAO(facebookuser fu);

}
