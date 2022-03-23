package com.facebook.utility;

import com.facebook.service.facebookservice;
import com.facebook.service.facebookserviceinterface;

public class servicefactory {

	public static facebookserviceinterface createobject() {
		
		return new facebookservice();
		
	}

}
