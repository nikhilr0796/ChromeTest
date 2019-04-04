package com.abc.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowser {
	WebDriver driver ;
	
	@BeforeTest
	@Parameters("browser")
	public void startUpCode(String browser1)
	{
		if(browser1.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser1.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Invalid browser");
		}
	}
	
	

}
