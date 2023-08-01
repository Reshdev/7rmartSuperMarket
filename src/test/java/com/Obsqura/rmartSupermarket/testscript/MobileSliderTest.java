package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;
import com.Obsqura.rmartSupermarket.pages.MobileSliderPage;
import retry.Retry;
import utilities.ExcelUtility;

public class MobileSliderTest extends Base{
	@Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to seslect values from dropdown",groups= {"regression"} )
	public void verifyCheckingOfDropDownButtoninMobileSliderPage()
	{
	     LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 0, "LoginPage")).clickOnSignInButton();
         MenuOptions menuOptions=new MenuOptions(driver);
         menuOptions.clickOnMobileSlider();
         MobileSliderPage mobileSliderPage=new MobileSliderPage(driver);
         mobileSliderPage.clickOnNewButton().clickOnCtegoryDropDown().valueSelectedFromDropDown().clickOnSaveButton();
         boolean isSuccessMessageDisplayed=mobileSliderPage.isSuccesMessageDisplayed();
         assertTrue(isSuccessMessageDisplayed, "not saved successfully ");
	}  
         
}

