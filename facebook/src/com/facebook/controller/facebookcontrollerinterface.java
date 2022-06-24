package com.facebook.controller;

import java.util.ArrayList;

import com.facebook.entity.facebookuser;

public interface facebookcontrollerinterface {


	int editprofilecntroller();

	int deleteprofilecontroller();

	facebookuser viewprofilecontroller();

	ArrayList<facebookuser> searchprofilecontroller();

	ArrayList<facebookuser> viewallprofilecontroller();

	int signupcontroller();

	facebookuser signincontroller();

}
