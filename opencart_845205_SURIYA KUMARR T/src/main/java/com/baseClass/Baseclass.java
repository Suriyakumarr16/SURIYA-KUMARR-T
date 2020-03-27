package com.baseClass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass {
	//defining the Webdriver
	public static WebDriver driver;

	//launching the Browser
	public void launchBrowser(String browserName) throws IOException
	{
		//launching Chrome
		if(browserName.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		//launching firefox
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
       //To maximize the window
		driver.manage().window().maximize();
		//to delete all the cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//To wait for the webpage to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	//launching the website
	public void website(String url)
	{

		driver.get(url);

	}

	//Taking Screenshot
	public static void Screenshot(String path) throws NullPointerException, IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
	}




}
