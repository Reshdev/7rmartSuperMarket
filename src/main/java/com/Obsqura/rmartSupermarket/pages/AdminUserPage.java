package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;

public class AdminUserPage {
	
		public WebDriver driver;
		public AdminUserPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		
		}
		@FindBy(xpath ="//a[@onclick='click_button(1)']") private WebElement newButton;
        @FindBy(xpath = "//input[@id='username']") private WebElement userNameText;
        @FindBy(xpath = "//input[@id='password']") private WebElement passWordText;
        @FindBy(xpath = "//select[@id='user_type']") private WebElement userType;
        @FindBy(xpath = "//button[@name='Create']") private WebElement saveButton;
        @FindBy(xpath = "//div[contains(@class,'alert-dismissible')]") private WebElement alertMessageGenerated;
      public AdminUserPage clickOnNewButton()
      {
    	  newButton.click(); 
    	  return this;
      }
      public AdminUserPage enterUserNameOnTextField(String userName)
      {
    	  userNameText.sendKeys(userName);
    	  return this;
      }
      public AdminUserPage enterPassWordOnTextField(String passWord)
      {
    	  passWordText.sendKeys(passWord);
    	  return this;
      }
      public AdminUserPage selectValueFromUserType()
      {
    	  userType.click();
    	  PageUtility pageUtility=new PageUtility();
    	  pageUtility.selectDropdownbyIndex(userType, 2);
    	  return this;
      }
      public  AdminUserPage clickOnSaveButton()
      {
    	  saveButton.click();
    	  return this;
      }
      public boolean isAlertMessageIsGenerated()
      {
    	  return alertMessageGenerated.isDisplayed();
      }
}
