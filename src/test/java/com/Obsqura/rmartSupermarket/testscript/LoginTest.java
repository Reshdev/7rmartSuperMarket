package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import utilities.ExcelUtility;
import retry.Retry;
public class LoginTest extends Base{
 
     @Test(retryAnalyzer = Retry.class,description="Verify whether user is able to login using valid username and password",groups= {"regression"})
      public void verifyThatUserAbleToLoginWithValidCredential()
      {
	     String userName=ExcelUtility.getString(1, 0, "LoginPage");                       
	     String password=ExcelUtility.getString(1, 1, "LoginPage");
	     LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(userName).enterPassWordOnPassWordField(password).clickOnSignInButton();
	     boolean isHomePageDisplayed=loginPage.isHomePgeIsDisplayed();
	     assertTrue(isHomePageDisplayed, "Home Page Not Displayed");
	  }
     @Test(retryAnalyzer = Retry.class,description = "Verify whether user is notable to login using valid username and invalid password",groups= {"smoke"} )
      public void verifyThatUserUnableToLoginWithValidUserNameAndInvalidPassword()
      {
    	 String userName=ExcelUtility.getString(1, 0, "LoginPage");
 	     String password=ExcelUtility.getString(2, 1, "LoginPage");
 	     LoginPage loginPage=new LoginPage(driver);
 	     loginPage.enterUserNameOnUserNameField(userName).enterPassWordOnPassWordField(password).clickOnSignInButton();
	     boolean isAlertDisplayed=loginPage.alertMessageIsDisplayed();
 	     assertTrue(isAlertDisplayed, "Home Page Displayed");
 	  }
     
     @Test(retryAnalyzer = Retry.class,description = "Verify whether user is notable to login using invalid username and validpassword",groups= {"regression,smoke"} )
      public void verifyThatUserUnableToLoginWithInvalidUserNameAndValidPassword()
      {
	     String userName=ExcelUtility.getString(2, 0, "LoginPage");
	     String password=ExcelUtility.getString(1, 1, "LoginPage");
	     LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(userName).enterPassWordOnPassWordField(password).clickOnSignInButton();
	     boolean isAlertDisplayed=loginPage.alertMessageIsDisplayed();
 	     assertTrue(isAlertDisplayed, "Home Page Displayed");
	  }

     @Test(retryAnalyzer = Retry.class,description = "Verify whether user is notable to login using invalid username and invalid password" )
     public void verifyThatUserUnableToLoginWithInvalidUserNameAndInvalidPassword()
      {
    	 String userName=ExcelUtility.getString(2, 0, "LoginPage");
 	     String password=ExcelUtility.getString(2, 1, "LoginPage");
 	     LoginPage loginPage=new LoginPage(driver);
 	     loginPage.enterUserNameOnUserNameField(userName).enterPassWordOnPassWordField(password).clickOnSignInButton();
	     boolean isAlertDisplayed=loginPage.alertMessageIsDisplayed();
	     assertTrue(isAlertDisplayed, "Home Page Displayed"); 
       }
}


