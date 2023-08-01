package com.Obsqura.rmartSupermarket.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.Obsqura.rmartSupermarket.pages.LoginPage;
import com.Obsqura.rmartSupermarket.pages.ManageCategoryPage;
import com.Obsqura.rmartSupermarket.pages.MenuOptions;
import retry.Retry;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	   @Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to navigate on categoeryList window",groups= {"regression"} )
	   public void verifyWhetherselectionOfManageCategorySubMenu()
	   {
		 LoginPage loginPage=new LoginPage(driver);
	     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	     MenuOptions menuOptions=new MenuOptions(driver);
	     menuOptions.clickOnManageCategory();
	     ManageCategoryPage manageCategoryPage=new ManageCategoryPage(driver);
	     manageCategoryPage.clickOnCategory();
	     boolean isCategoryWindowDisplayed=manageCategoryPage.CategoryListWindowDisplayed();
	     assertTrue(isCategoryWindowDisplayed, "CategoryList Window Not Displayed");
	  }  
	  @Test(retryAnalyzer = Retry.class,description = "Verify whether user is able to add new subcategory",groups= {"regression"} )
	   public void verifyWhetherUserAbleToAddNewSubCategory() 
	   {
		     LoginPage loginPage=new LoginPage(driver);
		     loginPage.enterUserNameOnUserNameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPassWordOnPassWordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		     MenuOptions menuOptions=new MenuOptions(driver);
		     menuOptions.clickOnManageCategory();
		     ManageCategoryPage manageCategoryPage=new ManageCategoryPage(driver);
		     manageCategoryPage.clickOnSubcategoryInManageCategoryPage().clickOnNewButton().cilckOnCategoryDropDown().selectValueFromCategoryDropDown().enterSubCategory(ExcelUtility.getString(1, 0, "ManageCategoryPage")).uploadFileByClickOnChooseFileButton().clickOnSaveButton();
		     boolean isSuccessMessageDisplayed= manageCategoryPage.isSuccessAlertDisplayed();
		     assertTrue(isSuccessMessageDisplayed, "User fail to add new subcategoey");
	    }
}	   
	   
	     
	     
	     
	     
	 
	
	
	
	
	


