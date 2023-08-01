package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.Obsqura.rmartSupermarket.pages.AdminUserPage;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;

import retry.Retry;
import utilities.ExcelUtility;
@Test
public class AdminUserTest extends Base {
	@Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to add new user in user admin page")
	public void verifyUserAbleToAddNewUserInAdminUserPage()
	{
		 
	     LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	     MenuOptions menuOptions=new MenuOptions(driver);
	     menuOptions.clickOnAdminUser();
	     AdminUserPage adminUserPage=new AdminUserPage(driver);
	     adminUserPage.clickOnNewButton().enterUserNameOnTextField(ExcelUtility.getString(1, 0, "AdminUser")).enterPassWordOnTextField(ExcelUtility.getString(1, 1, "AdminUser")).selectValueFromUserType().clickOnSaveButton();
	     boolean issuccessMessageDisplayed=adminUserPage.isAlertMessageIsGenerated();
	     assertTrue(issuccessMessageDisplayed, "User unable to add new user in admin user page");
	  }

}
