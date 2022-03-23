package com.facebook.utility;

import java.sql.DriverManager;

import com.facebook.DAO.facebookDAO;
import com.facebook.DAO.facebookDAOinterface;

public class DAOfactory {

	public static facebookDAOinterface createobject() {
		
		return new facebookDAO();

	}}
