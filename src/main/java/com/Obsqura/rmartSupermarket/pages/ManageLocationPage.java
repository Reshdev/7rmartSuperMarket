package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageLocationPage {
	public WebDriver driver;
	public  ManageLocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newButton;
	@FindBy(xpath="//select[@id='country_id']")private WebElement countrySelectionField;
	@FindBy(xpath="//select[@name='state_id']")private WebElement stateSelectionField;
	@FindBy(xpath="//input[@id='location']")private WebElement location;
	@FindBy(xpath="//input[@id='delivery']")private WebElement delivery;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement saveButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")private WebElement alertMessage;
	
	public ManageLocationPage clickOnNewButton()
	{
		newButton.click();
		return this;
	}
    public ManageLocationPage clickOnCountryDropDown()
    {
    	countrySelectionField.click();
    	PageUtility pageUtility=new PageUtility();
	    pageUtility.selectDropdownbyIndex(countrySelectionField, 1);
	    return this;
	}
    public ManageLocationPage clickOnStateDropDown()
    {
    	stateSelectionField.click();
    	PageUtility pageUtility=new PageUtility();
	    pageUtility.selectDropdownbyIndex(stateSelectionField, 2);
	    return this;
    	
    }
    public ManageLocationPage enterLoactionOnTheTextField(String nameOfLocation)
    {
    	location.sendKeys(nameOfLocation);
    	return this;
    }
    public ManageLocationPage enterDeliveryChargesOnTheTextField(String deliveryCharge)
    {
    	delivery.sendKeys(deliveryCharge);
    	return this;
    }
    public ManageLocationPage clickOnSaveButton()
    {
    	saveButton.click();
    	return this;
    }
    public boolean isSuccessAlertMessageDisplayed()
    {
    	return alertMessage.isDisplayed();
    }
}
