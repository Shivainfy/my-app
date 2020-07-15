package com.qtpselenium.core.ddf.testcases;

import org.testng.annotations.Test;

public class DummyTestA 
{
	@Test(priority=1)
	public void testA1()
	{
		
	}
	@Test(priority=2,dependsOnMethods= {"testA1"})
	public void testA2()
	{
		
	}
	@Test(priority=3,dependsOnMethods= {"testA1","testA2"})
	public void testA3()
	{
		
	}
}
