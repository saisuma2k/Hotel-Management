package com.facebook;

import java.util.Scanner;

import com.facebook.controller.facebookcontrollerinterface;
import com.facebook.entity.facebookuser;
import com.facebook.utility.controllerfactory;

public class Facebookview {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		String s= "y";
		Scanner sc=new Scanner(System.in);
		facebookuser fu;
		facebookcontrollerinterface fi= controllerfactory.createobject();
		
		while(s.equals("y")) {
			System.out.println("*****MAIN MENU*****");
			System.out.println("press 1 to sign up");
			System.out.println("press 2 to sign in");
			
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1: fi.signupcontroller();
			     break;
			case 2:fi.signincontroller();
			     if(fi!=null) {
			     String s2="y";
			     while(s2.equals("y"))
			     {
				
		
		System.out.println("    press 1 to edit profile");
		System.out.println("    press 2to delete profile");
		System.out.println("    press 3 to view profile");
		System.out.println("    press 4 to search profile");
		System.out.println("    press 5 to viewall profile");
		System.out.println("enter your choice");
		
		int i= sc.nextInt();
		
		
		
		switch(i) {
		
		
		case 1:  fi.editprofilecntroller();
	        break;	
		case 2:  fi.deleteprofilecontroller();
		    break;
		case 3:  fi.viewprofilecontroller();
			break;
		case 4:  fi.searchprofilecontroller();
		    break;
		case 5: fi.viewallprofilecontroller();
            break;
            
		}
			     }
		
	}
		System.out.println("Do you want to continue");
		s=sc.next();
		}
	}
}}
	
