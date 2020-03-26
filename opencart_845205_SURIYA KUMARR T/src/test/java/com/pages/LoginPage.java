package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClass.Baseclass;

public class LoginPage extends Baseclass 
{
	By MyAccount= By.xpath("//a[@class='dropdown-toggle']");
	By Login=By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a");
	By Email=By.name("email");
	By Password=By.name("password");
	By Submit=By.xpath("//*[@type='submit']");

	//loading the URL
	public void url() throws InterruptedException, IOException
	{
		launchBrowser("chrome");
		Thread.sleep(5000);
		website("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());
	}

	//clicking the LoginButton
	public void loginbutton()
	{
		driver.findElement(MyAccount).click();
		driver.findElement(Login).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//entering the valid details
	public void LoginDetails() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@class='small-link']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Email).sendKeys("tsuriyakumarr@gmail.com");
		driver.findElement(Password).sendKeys("suriya123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//logging in to the opencart account
	public void clickLogin() throws IOException, InterruptedException
	{
		WebElement l5=driver.findElement(Submit);
		Actions a=new Actions(driver);
		a.moveToElement(l5).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Screenshot("src\\test\\resources\\Screenshot\\valid.png");
		Thread.sleep(3000);
		driver.close();
	}

}
