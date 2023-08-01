package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtility;
import utilities.UpLoadFileUtility;

public class ManageSliderPage {
	
	public WebDriver driver;
	public ManageSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement newButton;
	@FindBy(xpath="//input[@id='main_img']") private WebElement chooseFile;
	@FindBy(xpath = "//input[@id='link']") private WebElement linkname;
	@FindBy(xpath="//button[@type='submit']") private WebElement saveButton;
	@FindBy(xpath="//div[contains(@class,'alert-success')]") private WebElement sucessAlert;
	
	
	public ManageSliderPage clickOnNewButtonInManageSliderPage()
	{
		newButton.click();
		return this;
	}
	public ManageSliderPage uploadFileByClickOnChooseFileButton()
	{
		UpLoadFileUtility uploadFileUtility=new UpLoadFileUtility();
		uploadFileUtility.fileUploadUsingSendKeys(chooseFile,GeneralUtility.IMAGEFILEFORMANAGECATEGORYCATEGORYPAGE);
		
		return this;
	}
	public ManageSliderPage sendLinkToTheLinkText(String link)
	{
		linkname.sendKeys(link);
		return this;
	}
	public ManageSliderPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
	}
	public boolean isSucessAlertDisplayed()
	{
		return sucessAlert.isDisplayed();
	}
	
}
