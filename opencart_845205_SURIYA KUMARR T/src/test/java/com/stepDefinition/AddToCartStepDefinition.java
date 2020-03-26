package com.stepDefinition;



import com.pages.AddToCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDefinition 
{
	AddToCartPage cart= new AddToCartPage();

	@Given("^the url opens in Chrome application$")
	public void the_url_opens_in_Chrome_application() throws Throwable 
	{
		cart.url();
	}

	@When("^the user clicks on loginbutton$")
	public void the_user_clicks_on_loginbutton() throws Throwable 
	{
		cart.login();
	}

	@Then("^the user selects the product$")
	public void the_user_selects_the_product() throws Throwable 
	{
		cart.selectingproduct();
	}

	@Then("^clicks on add to cart$")
	public void clicks_on_add_to_cart() throws Throwable 
	{
		cart.addingtocart();
	}

}
