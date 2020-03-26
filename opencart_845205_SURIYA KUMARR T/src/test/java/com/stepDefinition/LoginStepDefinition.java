package com.stepDefinition;


import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition
{
	LoginPage lg=new LoginPage();
	
	@Given("^the Opencart application opens in chrome browser$")
	public void the_Opencart_application_opens_in_chrome_browser() throws Throwable 
	{
		lg.url();
	}

	@When("^the user clicks on the login$")
	public void the_user_clicks_on_the_login() throws Throwable 
	{
		lg.loginbutton();  
	}

	@Then("^the user fills all the valid details$")
	public void the_user_fills_all_the_valid_details() throws Throwable 
	{
		lg.LoginDetails();
	}

	@Then("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() throws Throwable 
	{
		lg.clickLogin();
	}

}