package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.ManageDeliveryBoyPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;
import retry.Retry;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base {
    @Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to add DeliveryBoyInManageDeliveryBoyList",groups= {"regression"} )
    public void verifyToAddDeliveryBoyInManageDeliveryBoyList() 
    {
	  LoginPage loginPage=new LoginPage(driver);
      loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
      MenuOptions menuOptions=new MenuOptions(driver);
      menuOptions.clickOnManageDeleiveryBoy();
      ManageDeliveryBoyPage manageDeliveryBoyPage=new ManageDeliveryBoyPage(driver);
      manageDeliveryBoyPage.clickOnNewButton().enterNameOnNameTextField(ExcelUtility.getString(1, 0, "ManageDeliveryBoy")).enterEmailOnTextField(ExcelUtility.getString(1, 1, "ManageDeliveryBoy")).enterPhoneNumberOnTextField(ExcelUtility.getString(1, 2, "ManageDeliveryBoy")).enterAddressOnTextField(ExcelUtility.getString(1, 3, "ManageDeliveryBoy")).enterUserNameOnTextField(ExcelUtility.getString(1, 4, "ManageDeliveryBoy")).enterPassWordOnTextField(ExcelUtility.getString(1, 5, "ManageDeliveryBoy"));
      manageDeliveryBoyPage.clickOnSave();
      boolean isSuccessMessageGenerated=manageDeliveryBoyPage.issuccessMessageDisplayed();
      assertTrue(isSuccessMessageGenerated, "Not able to add new delivery boy");
 }
 
}
