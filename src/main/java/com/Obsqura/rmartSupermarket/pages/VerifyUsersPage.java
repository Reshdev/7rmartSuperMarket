package com.Obsqura.rmartSupermarket.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUsersPage {

	public WebDriver driver;
	public  VerifyUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	
    @FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") private WebElement searchButton;
    @FindBy(xpath = "//input[@id='un']") private  WebElement nameTextField;
    @FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']") private  WebElement searchButtonInSearchUsersList;
    @FindBy(xpath = "//table[contains(@class,'bordered table-hover table-sm')]//td") private WebElement tableData;
    @FindAll(@FindBy(xpath = "//table[contains(@class,'bordered table-hover table-sm')]//td")) private List<WebElement> tableValue;
   
   public VerifyUsersPage clickOnSearchButtonInVerifyUserPage()
    {
    	searchButton.click();
    	return this;
    }
    public VerifyUsersPage enterNameOnNameTextField(String name)
    {
    	nameTextField.sendKeys(name);
    	return this;
    }
    public VerifyUsersPage clickOnsearchButtonInSearchUsersList()
    {
    	searchButtonInSearchUsersList.click();
    	return this;
    }
    public void isEnteredNameExistInTheTable(String name,boolean flag)
    {
    	 List<String> namelist = new ArrayList<>();
    
    	 for(WebElement rowValue:tableValue)
         {
      	   String getData=rowValue.getText();
      	   namelist.add(getData);
      	   if(namelist.contains(name))
      	   {
      		   flag=true;
      		   break;
      	   }
        }
    }
   public String isEnterdNmaeExistInTheVerifyUserList()
   {
	   return tableData.getText();
   }
  

}                           
    
    