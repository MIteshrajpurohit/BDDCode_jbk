package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/main/java/com/features",
		glue = "com.stepdef",
	//	format = "pretty:html"
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports"}
		//tags = "@M"
		
		)





public class TestRunner {

}
