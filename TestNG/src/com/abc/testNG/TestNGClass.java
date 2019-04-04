package com.abc.testNG;

import org.testng.annotations.Test;

public class TestNGClass {

	
		@Test
		public void c()
		{
			System.out.println("executing inside c()");
		}
		
		@Test
		public void b()
		{
			System.out.println("executing inside b()");
		}

}
