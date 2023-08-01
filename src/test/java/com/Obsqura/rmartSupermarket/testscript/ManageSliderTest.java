package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.ManageSliderPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;
import retry.Retry;
import utilities.ExcelUtility;

public class ManageSliderTest extends Base {
	@Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to Upload file in manageslider page" ,groups= {"regression"})
	public void verifyWhetherUploadingFilesInManageSliderPage()
	{
		 LoginPage loginPage=new LoginPage(driver);
 	     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
 	     MenuOptions menuoptions=new MenuOptions(driver);
 	     menuoptions.clickOnManageSlider();
 	     ManageSliderPage manageSliderPage=new ManageSliderPage(driver);
	     manageSliderPage.clickOnNewButtonInManageSliderPage().uploadFileByClickOnChooseFileButton().sendLinkToTheLinkText(ExcelUtility.getString(1, 0, "ManageSlider")).clickOnSaveButton();
 	     boolean isSucessAlertDisplayed=manageSliderPage.isSucessAlertDisplayed();
 	     assertTrue(isSucessAlertDisplayed,"user fail to upload file in manageslider page");
	}   
 	     
}	     
 	     
 	     
 	     
 	     
 	     
 	     
 	    