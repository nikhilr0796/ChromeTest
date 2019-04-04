package com.abc.testNG;

import org.testng.annotations.Test;

public class Attribute2 {
	@Test(invocationCount=3)
	public void launch()
	{
		System.out.println("launching the browser");
	}
	
	@Test(enabled=false)
	public void navigate()
	{
		System.out.println("navigating to FB");
	}

}
