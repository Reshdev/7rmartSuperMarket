package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.ManageLocationPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;
import retry.Retry;
import utilities.ExcelUtility;

public class ManageLocationTest extends Base {
	@Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to add new location in list of location",groups= {"regression"} )
	public void verifyWhetherNewLocationCanBeAddedInListLocation() throws InterruptedException
	{
		 LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
 	     MenuOptions menuoptions=new MenuOptions(driver);
 	     menuoptions.clickOnManageLocation();
 	     ManageLocationPage manageLocationPage=new ManageLocationPage(driver);
 	     manageLocationPage.clickOnNewButton().clickOnCountryDropDown().clickOnStateDropDown().enterLoactionOnTheTextField(ExcelUtility.getString(1, 0, "ManageLocation")).enterDeliveryChargesOnTheTextField(ExcelUtility.getString(1, 1, "ManageLocation")).clickOnSaveButton();
 	     boolean successAlert= manageLocationPage.isSuccessAlertMessageDisplayed();
 	     assertTrue(successAlert,"Unable To Add New Location");
	}

}
