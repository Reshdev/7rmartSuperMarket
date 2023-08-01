package com.Obsqura.rmartSupermarket.testscript;

import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;
import com.Obsqura.rmartSupermarket.pages.VerifyUsersPage;
import retry.Retry;
import utilities.ExcelUtility;

public class VerifyUsersTest extends Base {
      @Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to find entered name in verify user list",groups= {"regression"})
       public void verifySearchButtonFynctionalityOfSearchButton()
       {
    	  LoginPage loginPage=new LoginPage(driver);
    	   loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
           MenuOptions menuOptions=new MenuOptions(driver);
           menuOptions.clickOnVerifyUsers();
           VerifyUsersPage verifyUserPage=new VerifyUsersPage(driver);
           verifyUserPage.clickOnSearchButtonInVerifyUserPage().enterNameOnNameTextField(ExcelUtility.getString(1, 0, "VerifyUser")).isEnteredNameExistInTheTable(ExcelUtility.getString(1, 0, "VerifyUser"), false);
    	   verifyUserPage.clickOnsearchButtonInSearchUsersList();
    	 }

}
