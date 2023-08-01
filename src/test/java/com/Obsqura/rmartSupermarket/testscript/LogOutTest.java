package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LogOutPage;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;

import retry.Retry;
import utilities.ExcelUtility;
public class LogOutTest extends Base {
	@Test(retryAnalyzer = Retry.class,description="Verify whether user is able to logout successfully",groups= {"regression"})
	public void toVerifySucessfullyLogOutFromHomePageUsingSettingsMenu()
	{
		 LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	     MenuOptions menuOptions=new MenuOptions(driver);
	     menuOptions.clickOnSettings();
	     LogOutPage logOutPage=new LogOutPage(driver);
	     logOutPage.clickOnLogOutButton();
	     boolean isSignInPageDisplayed=logOutPage.isSignInPageIsDisplayed();
	     assertTrue(isSignInPageDisplayed, " user cannot able to logout from home page");
	 }
}
