package com.abc.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void ChromeTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
