package com.facebook.service;

import java.util.ArrayList;
import java.util.List;

import com.facebook.entity.facebookuser;

public interface facebookserviceinterface {


	int deleteprofileservice(facebookuser fu);

	facebookuser viewprofileservice(facebookuser fu);

	ArrayList<facebookuser> searchprofileservice(facebookuser fu);

	int editprofileservice(facebookuser fu, facebookuser fu1);

	ArrayList<facebookuser> viewallprofieservice();

	int signupprofileservice(facebookuser fu);

	facebookuser signinprofileservice(facebookuser fu);

}
