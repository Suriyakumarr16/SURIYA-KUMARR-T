package com.stepDefinition;



import com.pages.InvalidLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLoginStepDefinition
{
	InvalidLoginPage ilg=new InvalidLoginPage();

	@Given("^the application will open in chrome browser$")
	public void the_application_will_open_in_chrome_browser() throws Throwable 
	{
		ilg.url();
	}

	@When("^the user clicks on login$")
	public void the_user_clicks_on_login() throws Throwable 
	{
		ilg.loginbutton();
	}

	@Then("^the user tries to login with invalid details$")
	public void the_user_tries_to_login_with_invalid_details() throws Throwable 
	{
		ilg.invalidLogin();
	}

	@Then("^the user clicks on login button$")
	public void the_user_clicks_on_login_button() throws Throwable 
	{
		ilg.clickLogin();
	}
}