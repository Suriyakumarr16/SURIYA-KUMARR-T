package com.pages;



import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClass.Baseclass;

public class CartCheckingPage extends Baseclass 
{
	//Defining Web Elements
	By Myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By phones=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a");
	By addtocart=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/span");
	By cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	By item=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
	By product=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");

	// loading the url 
	public void url() throws IOException 
	{ 
		//To Launch Chrome Browser
	    launchBrowser("chrome");
	    //To go to the site
		driver.get("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());

	}

	//logging to the account
	public void login() 
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
		driver.findElement(Email).sendKeys("tsuriyakumarr@gmail.com");
		driver.findElement(password).sendKeys("suriya123");
		driver.findElement(loginbtn).click();

	}

	//clicking the cart
	public void clickingcart() 
	{
		driver.findElement(cart).click();
	}

	//checking the item added is available or not
	public void assert1() throws NullPointerException, IOException, InterruptedException 
	{

		String item1= driver.findElement(item).getText();
		driver.navigate().to("https://demo.opencart.com/index.php?route=product/category&path=24");
		String product1=driver.findElement(product).getText();
		//To check if the item added is available in cart 
		Assert.assertEquals(item1, product1);
		System.out.println("asserted");
		//To wait foe the webpage to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To take Screenshot
		Screenshot("src/test/resources/Screenshot/cartcheck.png");
		//To provide Delay
		Thread.sleep(3000);
		driver.close();

	}

}
