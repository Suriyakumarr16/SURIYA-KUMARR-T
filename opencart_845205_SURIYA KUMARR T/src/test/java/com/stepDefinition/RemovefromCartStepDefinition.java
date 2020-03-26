package com.stepDefinition;


import com.pages.RemoveFromCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemovefromCartStepDefinition 
{
	RemoveFromCartPage rem=new RemoveFromCartPage();

	@Given("^the url opens in the chrome browser$")
	public void the_url_opens_in_the_chrome_browser() throws Throwable 
	{
		rem.url();
	}

	@When("^the user logs in to the opencart$")
	public void the_user_logs_in_to_the_opencart() throws Throwable 
	{
		rem.login();    
	}

	@Then("^user clicks the cart option$")
	public void user_clicks_the_cart_option() throws Throwable 
	{
		rem.cartoption();   
	}

	@Then("^clicks on remove$")
	public void clicks_on_remove() throws Throwable 
	{
		rem.remove();    
	}

}
