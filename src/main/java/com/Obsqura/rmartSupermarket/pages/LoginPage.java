package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//input[@type='text']") private WebElement userNameField;
	@FindBy(xpath="//input[@type='password']") private WebElement passwordField;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']") private WebElement signInButton;
	@FindBy(xpath = "//li[@class='breadcrumb-item active']") private WebElement homePage;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]") private WebElement alertMessage;
	public LoginPage enterUserNameOnUserNameField(String userName)
	{
		userNameField.sendKeys(userName);
		return this;
		
	}
	public LoginPage enterPassWordOnPassWordField(String passWord)
	{
		passwordField.sendKeys(passWord);
		return this;
	}
	public LoginPage clickOnSignInButton()
	{
		signInButton.click();
		return this;
	}
	public boolean isHomePgeIsDisplayed()
	{
		return homePage.isDisplayed();
	}
	public boolean alertMessageIsDisplayed()
	{
		return alertMessage.isDisplayed();
	}
	
} 
