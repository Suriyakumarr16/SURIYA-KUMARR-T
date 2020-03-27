package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)//to run with Cucumber Class
@CucumberOptions(
		features = "Feature\\myTest.Feature",//Feature File location
		plugin = {"pretty", "html:reports/cucumber-html-reports","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/extent-report/report.html"},//To generate Reports
		tags = {"@TC01_ValidLogin,@TC02_InvalidLogin,@TC03_AddtoCart,@TC04_CheckCart,@TC05_RemovefromCart"},//To refer Testcases
		glue = {"com.stepDefinition"},//name of stepdefinition
		monochrome = true
		)
public class AddToCart_TestRunner {	

}
