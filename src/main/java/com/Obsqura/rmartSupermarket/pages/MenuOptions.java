package com.Obsqura.rmartSupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuOptions {
	public WebDriver driver;
	public MenuOptions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-tasks']") private WebElement manageProduct;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/verify-users']") private WebElement verifyUsers;
	@FindBy(xpath="//i[@class='nav-icon fas fa-user']]") private WebElement manageUsers;
	@FindBy(xpath="//i[@class='nav-icon fas fa-window-minimize']") private WebElement moblieSlider;
	@FindBy(xpath="//i[@class='nav-icon fas fa-window-restore']") private WebElement manageSlider;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-list-alt']") private WebElement manageCategory;
	@FindBy(xpath = "//i[contains(@class,'item-icon fa fa-cog')]") private WebElement settings;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-users']") private WebElement adminUser;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-map-marker']") private WebElement manageLocation;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-user-plus']") private WebElement manageDeliveryBoy;
	
	public void clickOnManageUsers()
	{
		manageUsers.click();
	}
	public void clickOnMnageProduct()
	{
		manageProduct.click();
	}
	public void clickOnVerifyUsers()
	{
		verifyUsers.click();
	}
	public void clickOnMobileSlider()
	{
		moblieSlider.click();
	}
    public void clickOnManageSlider()
    {
    	manageSlider.click();
    }
    public void clickOnManageCategory()
    {
    	manageCategory.click();
    }
    public void clickOnSettings()
    {
    	settings.click();
    }
    public void clickOnAdminUser()
    {
    	adminUser.click();
    }
    public void clickOnManageLocation()
    {
    	manageLocation.click();
    }
    public void clickOnManageDeleiveryBoy()
    {
    	manageDeliveryBoy.click();
    }
}