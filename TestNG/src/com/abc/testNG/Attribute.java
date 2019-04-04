package com.abc.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attribute {
	@Test
	public void launch()
	{
		System.out.println("launch the browser");
	}
	
	@Test(dependsOnMethods="launch")
	public void navigate()
	{
		System.out.println("navigate the FB");
	}
	
	@Test(dependsOnMethods="navigate")
	public void entercredentials()
	{
		Assert.fail();
		System.out.println("Enter the credentials");
	}
	
	@Test(dependsOnMethods="entercredentials")
	public void logout()
	{
		System.out.println("Logout");
	}

}
