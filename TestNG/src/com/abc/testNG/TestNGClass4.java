package com.abc.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNGClass4 {
	public WebDriver driver ;
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("executing before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("executing after test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("executing before class");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("executing after class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("executing before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("executing after method");
	}
}
