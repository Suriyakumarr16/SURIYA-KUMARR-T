package com.pages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClass.Baseclass;

public class InvalidLoginPage extends Baseclass 
{
    //Defining Webelements
	By Myaccount=By.xpath("//a[@class='dropdown-toggle']");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

	//loading the url
	public void url() throws InterruptedException, IOException
	{
		//To launch the Chrome Browser
		launchBrowser("chrome");
		//To Provide Delay
		Thread.sleep(5000);
		website("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());
	}

	//clicking the LoginButton
	public void loginbutton() throws InterruptedException
	{

		driver.findElement(Myaccount).click();
		driver.findElement(login).click();
		//To wait for the webpage to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	//entering the invalid details
	public void invalidLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@class='small-link']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering invalid Details
		driver.findElement(Email).sendKeys("tsuriyaku2marr@gmail.com");
		driver.findElement(password).sendKeys("suriya1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//logging in to the account
	public void clickLogin() throws IOException, InterruptedException
	{
		WebElement l5=driver.findElement(loginbtn);
		Actions a=new Actions(driver);
		//To move the cursor to the Webelement l5
		a.moveToElement(l5).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To Take Screenshot
		Screenshot("src\\test\\resources\\Screenshot\\invalid.png");
		Thread.sleep(3000);
		//To Close The Browser
		driver.close();
	}
}
