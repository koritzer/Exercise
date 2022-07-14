package com.qa.steps;

import com.koritzer.qa.utils.CommonUI;
import com.koritzer.qa.utils.Constants;
import com.koritzer.qa.utils.ObjInitialize;
import com.koritzer.qa.utils.ReadJsonFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		CommonUI.openBrowser("chrome");
		Constants.jsonPath = ReadJsonFile.loadJsonFile("Region");
		ObjInitialize.initializeClassObj();
	}

	@After
	public void tearDown() {
		CommonUI.quitBrowser();
	}

}
