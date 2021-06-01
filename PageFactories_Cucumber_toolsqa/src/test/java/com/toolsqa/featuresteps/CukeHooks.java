package com.toolsqa.featuresteps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.toolsqa.base.BasePageInit;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class CukeHooks {

	/*
	 * 
	 * Runs before every scenario
	 * 
	 */

	@Before
	public static void setUp() {
		// ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		System.out.println("Before");
		if (BasePageInit.driver == null) {
			//BasePageInit.initWebDriverConfiguration(System.getProperty("usebrowserpom"));
			System.out.println("driver null");
			BasePageInit.initConfiguration(System.getProperty("usebrowserpom"));
			
		} else {
			
			if (BasePageInit.driver.toString().contains("null")) {
				System.out.println("driver returns null");
				BasePageInit.initConfiguration(System.getProperty("usebrowserpom"));
			}
			
		}
	}

	/*
	 * Runs after every scenario
	 */

	@After
	public static void tearDown() {
		

		if (BasePageInit.driver != null) {
			BasePageInit.quitBrowser();
		}
	

	}

	/*
	 * Executes after each step
	 */

	@AfterStep
	public void addScreenshot(Scenario scenario) {

		// validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BasePageInit.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
		}
		
		scenario.attach("teststep", "text/plain", "");
		

	}

}
