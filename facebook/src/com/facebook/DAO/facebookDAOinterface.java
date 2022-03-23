package com.facebook.DAO;

import java.util.List;

import com.facebook.entity.facebookuser;

public interface facebookDAOinterface {


	int deleteprofileDAO(facebookuser fu);

	facebookuser viewprofileDAO(facebookuser fu);

	int searchprofileDAO(facebookuser fu);

	int editprofileDAO(facebookuser fu);

	List<facebookuser> viewallprofileDAO();

	int signupprofileDAO(facebookuser fu);

	facebookuser signinprofileDAO(facebookuser fu);

}
