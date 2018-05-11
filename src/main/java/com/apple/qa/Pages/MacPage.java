package com.apple.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Testbase;

public class MacPage extends Testbase {
	
	@FindBy(xpath = "//h3[text()='Power to the pro']")
	WebElement powerpro;
	
	@FindBy(xpath = "//div[@id='imac-promo-manager']//div//figure")
	WebElement macPic;
	
	@FindBy(xpath = "//a[contains(text(), 'Mac')]")
	WebElement mac;
	
	public MacPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickMacLink() {
		mac.click();
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String powerLabel() {
		String dispText = powerpro.getText();
		return dispText;
	}
	
	public boolean findMacPic() {
		boolean disp = macPic.isDisplayed();
		return disp;
	}
}
