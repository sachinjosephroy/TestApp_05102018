package com.apple.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apple.qa.Pages.HomePage;
import com.apple.qa.Pages.MacPage;

import TestBase.Testbase;

public class MacPageTest extends Testbase {
	
	MacPage macpage;
	HomePage homepage;
	
	public MacPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		macpage = new MacPage();
		homepage = new HomePage();
		macpage = homepage.clickMacLink();
	}

	@Test(priority = 1)
	public void titleTest() {
		String title = macpage.getTitle();
		Assert.assertEquals(title, "Mac - Apple", "Titles don't match");
	}
	
	@Test(priority = 2)
	public void macPicDisplayedTest() {
		boolean disp = macpage.findMacPic();
		Assert.assertTrue(disp, "Pic is not displayed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}

}
