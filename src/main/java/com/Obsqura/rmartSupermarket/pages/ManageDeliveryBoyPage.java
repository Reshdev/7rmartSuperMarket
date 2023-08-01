package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtility;

public class ManageDeliveryBoyPage {
	public WebDriver driver;
	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
    @FindBy(xpath = "//input[@id='name']") private WebElement nameText;
    @FindBy(xpath = "//input[@id='email']") private WebElement emailText;
    @FindBy(xpath = "//input[@id='phone']") private WebElement phoneNumberText;
    @FindBy(xpath = "//textarea[@id='address']") private WebElement addressText;
    @FindBy(xpath = "//input[@id='username']") private WebElement userNameText;
    @FindBy(xpath = "//input[@id='password']") private WebElement passWordText;
    @FindBy(xpath = "//button[@class='btn btn-danger']") private WebElement savebutton;
    @FindBy(xpath = "//div[contains(@class,'alert alert-success')]") private WebElement successAlert;
    public ManageDeliveryBoyPage clickOnNewButton()
    {
    	newButton.click();
    	return this;
    }
	public ManageDeliveryBoyPage enterNameOnNameTextField(String name)
	{
		nameText.sendKeys(name);
		return this;
	}
	public ManageDeliveryBoyPage enterEmailOnTextField(String email)
	{
		emailText.sendKeys(email);
		return this;
	}
	public ManageDeliveryBoyPage enterPhoneNumberOnTextField(String phoneNumber)
	{
		phoneNumberText.sendKeys(phoneNumber);
		return this;
	}
	public ManageDeliveryBoyPage enterAddressOnTextField(String address)
	{
		addressText.sendKeys(address);
		return this;
	}
	public ManageDeliveryBoyPage enterUserNameOnTextField(String userNameOfDelivery)
	{
		userNameText.sendKeys(userNameOfDelivery);
		return this;
	}
	public ManageDeliveryBoyPage enterPassWordOnTextField(String passWordOfDelivery)
	{
		passWordText.sendKeys(passWordOfDelivery);
		return this;
	}
	public ManageDeliveryBoyPage clickOnSave()
	{
		WaitUtility waitutility=new WaitUtility();
		waitutility.waitForElementClickable(driver, savebutton);
		savebutton.click();
		return this;
	}
	public boolean issuccessMessageDisplayed()
	{
		return successAlert.isDisplayed();
	}
	
}
