package com.facebook.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.facebook.entity.facebookuser;
import com.facebook.service.facebookserviceinterface;
import com.facebook.utility.servicefactory;

public class facebookcontroller implements facebookcontrollerinterface {

	
	@Override
	public int editprofilecntroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your email tht you want to edit");
		String email=sc.next();
		
		facebookuser fu=new facebookuser();
		fu.setEmail(email);;
		
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your password");
		String password=sc.next();
		
		System.out.println("enter your address");
		String address=sc.next();
		
		facebookuser fu1=new facebookuser();
		fu1.setName(name);
		fu1.setPassword(password);
		fu1.setAddress(address);
		facebookserviceinterface fi= servicefactory.createobject();
		int i= fi.editprofileservice(fu,fu1);
		
		if (i>0) {
			System.out.println("profile edited");
		}
		else 
		{
			System.out.println("profile not deleted");
			
		}
		return i;
	}
		
		

	@Override
	public int deleteprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the email you want to delete");
		String email=sc.next();
		facebookuser fu=new facebookuser();
		
		fu.setEmail(email);
		
		facebookserviceinterface fi= servicefactory.createobject();
		int i= fi.deleteprofileservice(fu);
		
		if (i>0) {
			System.out.println("profile deleted");
		}
		else 
		{
			System.out.println("profile not deleted");
			
		}
		return i;
	}

	@Override
	public facebookuser viewprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your email");
		String email=sc.next();
		facebookuser fu=new facebookuser();
		fu.setEmail(email);
		facebookserviceinterface fi= servicefactory.createobject();
		facebookuser f1= fi.viewprofileservice(fu);
		if(f1 !=null) {
			System.out.println("name is "+f1.getName());
			System.out.println("password is "+f1.getPassword());
			System.out.println("email is "+f1.getEmail());
			System.out.println("address is "+f1.getAddress());
			
			
			
		}
		return f1;
		
	}

	@Override
	public ArrayList<facebookuser> searchprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
        facebookuser fu=new facebookuser();
        fu.setName(name);
        
        facebookserviceinterface fi= servicefactory.createobject();
		ArrayList<facebookuser> f1= fi.searchprofileservice(fu);
		return f1;
	}

	@Override
	public ArrayList<facebookuser> viewallprofilecontroller() {
		facebookserviceinterface fi= servicefactory.createobject();
		
		ArrayList<facebookuser> ll=new ArrayList<facebookuser>();
		
		ll=fi.viewallprofieservice();
		
		ll.forEach( j -> {
			System.out.println("name is"+j.getName());
			System.out.println("password is"+j.getPassword());
			System.out.println("email is"+j.getEmail());
			System.out.println("address is"+j.getAddress());});
		return ll;
		}

	@Override
	public int signupcontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your password");
		String password=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your address");
		String address=sc.next();
		
		facebookuser fu=new facebookuser();
		
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		facebookserviceinterface fi= servicefactory.createobject();
		int i= fi.signupprofileservice(fu);
		
		if (i>0) {
			System.out.println("signed");
		}
		else 
		{
			System.out.println("notsigned");
			
		}
		return i;
		
		
		
	}

	@Override
	public facebookuser signincontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your email");
		String email=sc.next();
		
		System.out.println("enter your password");
		String password=sc.next();
		
		facebookuser fu=new facebookuser();
		fu.setEmail(email);
		fu.setPassword(password);
		
		facebookserviceinterface fi= servicefactory.createobject();
		
		facebookuser s2=fi.signinprofileservice(fu);
		
        return s2;
	}




		
	}
	


