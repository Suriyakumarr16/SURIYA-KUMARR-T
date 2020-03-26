package com.stepDefinition;



import com.pages.CartCheckingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartCheckingStepDefinition 
{
	CartCheckingPage check= new CartCheckingPage();

	@Given("^url opens in Chrome browser$")
	public void url_opens_in_Chrome_browser() throws Throwable 
	{
		check.url();
	}

	@When("^the user clicks on loginbutton and logs in$")
	public void the_user_clicks_on_loginbutton_and_logs_in() throws Throwable 
	{
		check.login();
	}

	@Then("^the user clicks the cart$")
	public void the_user_clicks_the_cart() throws Throwable 
	{
		check.clickingcart();
	}

	@Then("^confirms the product we added is present or not$")
	public void confirms_the_product_we_added_is_present_or_not() throws Throwable 
	{
		check.assert1();
	}


}
