package com.apple.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apple.qa.Pages.HomePage;
import com.apple.qa.Pages.MacPage;

import TestBase.Testbase;

public class HomePageTest extends Testbase {
	
	HomePage homepage;
	MacPage macpage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}
	
	@Test(priority = 1)
	public void titleTest() {
		String title = homepage.getTitle();
		Assert.assertEquals(title, "Apple", "Titles don't match");
	}
	
	@Test(priority = 2)
	public void clickAppleTest() {
		String icon = homepage.clickAppleIcon();
		Assert.assertEquals(icon, "Apple", "Titles don't match");
	}
	
	@Test(priority = 3)
	public void clickMacLinkTest() {
		macpage = homepage.clickMacLink();
		Assert.assertEquals(macpage.powerLabel(), "Power to the pro.", "Power Pro texts don't match");
	}
	
	@Test(priority = 4)
	public void verifyiPhoneXTextTest() {
		String text = homepage.iPhoneXText();
		Assert.assertEquals(text, "iPhone X. Say hello to the future.", "Texts don't match");
	}
	
	@Test(priority = 5)
	public void verifyAppleIconDisplayedTest() {
		boolean disp = homepage.macIcon();
		Assert.assertTrue(disp, "Mac Icon is not displayed");
	}
	
	@Test(priority = 6)
	public void verifyAccountDisplayedTest() {
		boolean disp = homepage.accountLabelDisplayed();
		Assert.assertTrue(disp, "Account Label is not displayed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
