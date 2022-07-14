package com.koritzer.qa.utils;

import com.qa.pages.CommonElementPage;
import com.qa.pages.JobTitlesPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MenuPage;
import com.qa.pages.SalaryComponentsPage;
import com.qa.pages.SkillsPage;

/**
 * The purpose of this class is to initialize the PAGE CLASS Objects
 * 
 *
 */
public class ObjInitialize extends Constants {
	
	//initialize class objects 
	public static void initializeClassObj() {
		loginObj = new LoginPage();
		menuObj = new MenuPage();
		jobTitlesObj = new JobTitlesPage();
		commonObj = new CommonElementPage();
		salCompObj = new SalaryComponentsPage();
		
		skillsObj = new SkillsPage();
	}

}
