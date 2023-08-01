package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	public WebDriver driver;
	public LogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath = "//p[text()='Logout']") private WebElement logOut;
	@FindBy(xpath = "//p[@class='login-box-msg']") private WebElement signInPage;
	
	public void clickOnLogOutButton()
	{
		logOut.click();
	}
    public boolean isSignInPageIsDisplayed()
    {
    	return signInPage.isDisplayed();
    }

}
