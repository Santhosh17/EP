package com.eprint.testcases.Products;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Products_AddCategory extends SuperTestNG
{
	@Test
	public static void testProducts_AddCategory()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged In Continuing with testing Process",true);
		}
		String xlpath="./Excel Files/Products/Products.xls";
		String sheetName = "Category";
		try
		{
			driver.findElement(By.xpath("//span[text()='PRODUCTS']")).isDisplayed();
			ProjectLibrary.HoverDropdownControlByXpath("Products", "//span[text()='PRODUCTS']", "View/Add Category","View/Add Category");

		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Products", "//span[text()='Products']", "View/Add Category","View/Add Category");
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 1, "Name", "ctl00_ContentPlaceHolder1_txtCategoryName");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 2, 1, "Parent Category Name", "ctl00_ContentPlaceHolder1_ddlCategoryList");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 3, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 4, 1, "Category Visible to Customer/Public Accounts", "ctl00_ContentPlaceHolder1_chkvisibletocustomer");
		String RadioOption = Generic.getXlCellValue(xlpath, sheetName, 5, 1);
		if (RadioOption.equals("None"))
		{
			ProjectLibrary.ClickOnButtonByXpath("Customers - None", "ctl00_ContentPlaceHolder1_rdCustomerNone");
		}
		else if (RadioOption.equals("Specific to customers"))
		{
			ProjectLibrary.ClickOnButtonByID("Customers - Specific to customers", "ctl00_ContentPlaceHolder1_rdSelectedCustomer");
		}
		else if (RadioOption.equals("All"))
		{
			ProjectLibrary.ClickOnButtonByID("Customers - All", "ctl00_ContentPlaceHolder1_rdSelectedAll");
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Product category saved successfully", "ctl00_ContentPlaceHolder1_ctl03_lblMessage");
	}
}
