package com.toolsqa.cukerunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		features = "src\\test\\resources\\featurefiles", glue = "com.toolsqa.featuresteps", tags = "@TC1 or @TC2",
		monochrome =true,
		publish = false)

public class AlertsTest extends AbstractTestNGCucumberTests {

}
