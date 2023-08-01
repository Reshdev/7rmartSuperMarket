package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class MobileSliderPage {
	public WebDriver driver;
	
	public  MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
	@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement CategoryDropDown;
	@FindBy(xpath="//button[@class='btn btn-danger']") private WebElement saveButton;
	@FindBy(xpath="//button[@class='close']") private WebElement message;
	
	public MobileSliderPage clickOnNewButton()
	{
		newButton.click();
		return this;
	}
	public MobileSliderPage clickOnCtegoryDropDown()
	{
		CategoryDropDown.click();
		return this;
	}
	public MobileSliderPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
	}
	public MobileSliderPage valueSelectedFromDropDown()
	{
		 PageUtility pageUtility=new PageUtility();
		 pageUtility.selectDropdownbyIndex(CategoryDropDown, 3);
		 return this;
	}
	public boolean isSuccesMessageDisplayed()
	{
		return message.isDisplayed();
	}
}