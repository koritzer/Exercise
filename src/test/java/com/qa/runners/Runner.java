package com.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/OrangeHRM/SkillsPage.feature", 
		glue = { "com.noorteck.qa.steps" }, 
		plugin = { "pretty", "html:target/cucumber.html",
				"json:target/cucumber.json" }, 
		//tags ="@scrum",
		monochrome = true

)
public class Runner {

}
//commit...