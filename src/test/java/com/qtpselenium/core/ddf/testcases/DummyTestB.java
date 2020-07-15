package com.qtpselenium.core.ddf.testcases;

import org.testng.annotations.Test;

import com.qtpselenium.core.base.BaseTest;

public class DummyTestB extends BaseTest
{
	@Test
	public void TestB()
	{
		//Openbrowser();
		Navigate();
		click();
		type();
		VerifyTitle();
	}
}
