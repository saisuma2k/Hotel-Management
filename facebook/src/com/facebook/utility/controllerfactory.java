package com.facebook.utility;

import com.facebook.controller.facebookcontroller;
import com.facebook.controller.facebookcontrollerinterface;

public class controllerfactory {

	public static facebookcontrollerinterface createobject() {
		
		return new facebookcontroller();
	}

}
