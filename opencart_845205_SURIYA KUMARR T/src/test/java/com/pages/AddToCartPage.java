package com.pages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClass.Baseclass;

public class AddToCartPage extends Baseclass 
{
	
	//Defining Web Elements
	By Myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By phones=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a");
	By addtocart=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/span");

	// loading the URL 
	public void url() throws IOException  
	{   
		//To Launch Chrome Browser
		launchBrowser("chrome");
		//To go to the site
		driver.get("http://opencart.abstracta.us/");
		//To print the Title
		System.out.println(driver.getTitle());

	}

	//logging in to the account
	public void login() throws InterruptedException 
	{
       
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		//To Hover the cursor over the Webelement Myaccount
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@class='small-link']")).click();
		//Entering the Details
		driver.findElement(Email).sendKeys("tsuriyakumarr@gmail.com");
		driver.findElement(password).sendKeys("suriya123");
		//To provide Delay
		Thread.sleep(5000);
		driver.findElement(loginbtn).click();
		Thread.sleep(5000);
	}

	//selecting the product
	public void selectingproduct() throws InterruptedException 
	{

		driver.findElement(phones).click();
		//To Scroll down the Window
		JavascriptExecutor js =(JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,5000)");

	}

	//adding to the cart
	public void addingtocart() throws InterruptedException, NullPointerException, IOException 
	{
		driver.findElement(addtocart).click();
		//To wait for the Webpage to Load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To Take Screenshot
		Screenshot("src\\test\\resources\\Screenshot\\addcart.png");
		Thread.sleep(3000);
		//To Close the Browser
		driver.close();
	}



}
