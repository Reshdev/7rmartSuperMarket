package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtility;
import utilities.PageUtility;
import utilities.UpLoadFileUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//ul[@style='display: block;'][1]") private WebElement category;
	@FindBy(xpath ="//h1[text()='List Categories']" ) private WebElement categoryList;
	@FindBy(xpath ="//a[@onclick='click_button(1)']" ) private WebElement newButton;
	@FindBy(xpath = "//input[@id='category']") private WebElement categoryText;
	@FindBy(xpath = "//input[@id='main_img']") private WebElement chooseFile;
	@FindBy(xpath="//p[text()='Sub Category']") private WebElement subCategory;
	@FindBy(xpath = "//div[contains(@class,'dismissible')]") private WebElement alertMessage;
	@FindBy(xpath = "//select[contains(@class,'selectpicker')]") private WebElement categoryDropDown;
	@FindBy(xpath = "//input[@class='form-control']") private WebElement subCategoryField;
	@FindBy(xpath = "//button[@class='btn btn-danger']") private WebElement saveButton;
	public ManageCategoryPage clickOnCategory()
	{
		category.click();
		return this;
	}
	public boolean CategoryListWindowDisplayed()
	{
		return categoryList.isDisplayed();
	}
	public ManageCategoryPage clickOnNewButton()
	{
		newButton.click();
		return this;
	}
	
	public ManageCategoryPage clickOnchooseFileButton()
	{
		chooseFile.click();
		return this;
	}
	public ManageCategoryPage uploadFileByClickOnChooseFileButton()
	{
		UpLoadFileUtility uploadFileUtility=new UpLoadFileUtility();
		uploadFileUtility.fileUploadUsingSendKeys(chooseFile,GeneralUtility.IMAGEFILEFORMANAGECATEGORYCATEGORYPAGE);
		
		return this;
	}
	public ManageCategoryPage clickOnSubcategoryInManageCategoryPage()
	{
		subCategory.click();
		return this;
	}
	public ManageCategoryPage cilckOnCategoryDropDown()
	{
		categoryDropDown.click();
		return this;
	}
	public ManageCategoryPage selectValueFromCategoryDropDown()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectDropdownbyIndex(categoryDropDown, 4);
		return this;
		
	}
	public ManageCategoryPage enterSubCategory(String subCategoryName )
	{
		subCategoryField.sendKeys(subCategoryName);
		return this;
	}
	public ManageCategoryPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
	}
	public boolean isSuccessAlertDisplayed()
	{
		return alertMessage.isDisplayed();
	}
}
