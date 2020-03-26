package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature\\myTest.Feature",
		plugin = {"pretty", "html:reports/cucumber-html-reports","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/extent-report/report.html"},
		tags = {"@TC01_ValidLogin,@TC02_InvalidLogin,@TC03_AddtoCart,@TC04_CheckCart,@TC05_RemovefromCart"},
		glue = {"com.stepDefinition"},
		monochrome = true
		)
public class AddToCart_TestRunner {	

}
