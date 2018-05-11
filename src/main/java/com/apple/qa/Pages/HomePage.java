package com.apple.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Testbase;

public class HomePage extends Testbase {
	
	@FindBy(css = "a#ac-gn-firstfocus")
	WebElement home;
	
	@FindBy(xpath = "//a[@class='ac-gn-link ac-gn-link-mac']")
	WebElement mac;
	
	@FindBy(xpath = "//span[text()='iPhone X. Say hello to the future. ']")
	WebElement iPhoneXText;
	
	@FindBy(xpath = "//h3[text()='Account']")
	WebElement account;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String clickAppleIcon() {
		home.click();
		String title = getTitle();
		return title;
	}
	
	public MacPage clickMacLink() {
		mac.click();
		return new MacPage();
	}
	
	public String iPhoneXText() {
		String text = iPhoneXText.getText();
		return text;
	}
	
	public boolean macIcon() {
		boolean disp = mac.isDisplayed();
		return disp;
	}
	
	public boolean accountLabelDisplayed() {
		boolean acc = account.isDisplayed();
		return acc;
	}

}
