package com.facebook.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.facebook.entity.facebookuser;

public class ControllerTest {
	facebookcontrollerinterface fi=null;

	@Before
	public void setUp() throws Exception {
		fi=new facebookcontroller();		
	}

	@After
	public void tearDown() throws Exception {
		fi=null;
	}

	@Test
	public void testEditprofilecntroller() {
		 int i=fi.editprofilecntroller();
	     assert i>0:"test case fail to edit profile";
	}

	@Test
	public void testDeleteprofilecontroller() {
	     int i=fi.deleteprofilecontroller();
	     assert i>0:"test case fail to delete profile";
	     
	}

	@Test
	public void testViewprofilecontroller() {
		 int i=fi.viewprofilecontroller();
	     assert i>0:"test case fail to view profile";
	}

	@Test
	public void testSearchprofilecontroller() {
		 int i=fi.searchprofilecontroller();
	     assert i>0:"test case fail to search profile";
	}

	@Test
	public void testViewallprofilecontroller() {
		 int i=fi.viewallprofilecontroller();
	     assert i>0:"test case fail to viewall profile";
	}

	@Test
	public void testSignupcontroller() {
		 int i=fi.signupcontroller();
	     assert i>0:"test case fail to signup profile";
	}

	@Test
	public void testSignincontroller() {
		 facebookuser i=fi.signincontroller();
	     assert i!=null:"test case fail to signin profile";
	}

}
