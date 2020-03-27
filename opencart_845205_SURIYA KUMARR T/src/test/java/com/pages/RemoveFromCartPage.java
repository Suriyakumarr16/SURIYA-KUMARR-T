package com.pages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClass.Baseclass;

public class RemoveFromCartPage extends Baseclass 
{
	//Defining Webelements
	By Myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By cancel=By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[4]/div/span/button[2]");
	By cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");

	//loading the URL
	public void url() throws IOException 
	{ 
		//To Launch Chrome Browser
	    launchBrowser("chrome");
		driver.get("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());

	}

	//logging into the account
	public void login() 
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		//To hover the cursor to the Webelement Myaccount
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@class='small-link']")).click();
		driver.findElement(Email).sendKeys("tsuriyakumarr@gmail.com");
		driver.findElement(password).sendKeys("suriya123");
		driver.findElement(loginbtn).click();
	}

	//clicking the cart
	public void cartoption() 
	{
		driver.findElement(cart).click();
	}

	//removing the item from the cart
	public void remove() throws NullPointerException, IOException, InterruptedException
	{
		//To remove the item from the cart
		driver.findElement(cancel).click();
		//to wait for the webpage to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To Take Screenshot
		Screenshot("src/test/resources/Screenshot/removecart.png");
		Thread.sleep(3000);
		//To close the Browser
		driver.close();
	}

}
