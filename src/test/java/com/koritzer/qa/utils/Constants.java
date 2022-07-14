package com.koritzer.qa.utils;

import org.openqa.selenium.WebDriver;

import com.qa.pages.CommonElementPage;
import com.qa.pages.JobTitlesPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MenuPage;
import com.qa.pages.SalaryComponentsPage;
import com.qa.pages.SkillsPage;

import io.restassured.path.json.JsonPath;



/**
 * In this class we declare our objects that will be shared among different classes
 *
 *
 */
public class Constants {
	
	
	public static WebDriver driver;
	public static JsonPath jsonPath;

	//declare class objects and common objects
	public static LoginPage loginObj;
	public static MenuPage menuObj;
	public static JobTitlesPage jobTitlesObj;
	public static CommonElementPage commonObj;
	public static SalaryComponentsPage salCompObj;
	public static SkillsPage skillsObj;
	
	public static String valueUpdated;

}
 