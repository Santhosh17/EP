package com.eprint.testcases.Products;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Products_Add extends SuperTestNG
{
	@Test
	public static void testProducts_Add()
	{
		String xlpath="./Excel Files/Products/Products.xls";
		String sheetName = "Product";
		try
		{
			EprintSpecificLinks.login();
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with testing",true);
		}
		try
		{
			driver.findElement(By.xpath("//span[text()='PRODUCTS']")).isDisplayed();
			ProjectLibrary.HoverDropdownControlByXpath("Products", "//span[text()='PRODUCTS']", "Add New Product","Add New Product");

		}
		catch (org.openqa.selenium.NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Products", "//span[text()='Products']", "Add New Product","Add New Product");

		}
		
		ProjectLibrary.ClickOnButtonByID("General", "ctl00_ContentPlaceHolder1_lblGeneral");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 1, 1, "Category Name", "ctl00_ContentPlaceHolder1_ddlPriceCatalogueCategory");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 1, "Item Title", "ctl00_ContentPlaceHolder1_txtCatalogueName");
		String RadioButton = Generic.getXlCellValue(xlpath, sheetName, 3, 1);
		if (RadioButton.equals("Non Editable"))
		{
			ProjectLibrary.ClickOnButtonByID("Product Type - Non Editable", "ctl00_ContentPlaceHolder1_rdbnoneditable");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 4, 1, " This is a Stock Item ", "ctl00_ContentPlaceHolder1_chkstockitem");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 5, 1, "Allow Back Orders", "ctl00_ContentPlaceHolder1_chkbackorders");
		}
		else if (RadioButton.equals(" Editable "))
		{
			ProjectLibrary.ClickOnButtonByID("Product Type - Editable", "ctl00_ContentPlaceHolder1_ChkEditableProduct");
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 1, "B Item Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 1, "C Item Artwork", "ctl00_ContentPlaceHolder1_txtArtwork");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 1, "D Item Colour", "ctl00_ContentPlaceHolder1_txtColour");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 9, 1, "E Item Size", "ctl00_ContentPlaceHolder1_txtSize");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 1, "F Item Material", "ctl00_ContentPlaceHolder1_txtMaterial");
		String RadioOption = Generic.getXlCellValue(xlpath, sheetName, 11, 1);
		if (RadioOption.equals("None"))
		{
			ProjectLibrary.ClickOnButtonByID("Customers - None", "ctl00_ContentPlaceHolder1_rdCustomerNone");
		}
		else if (RadioOption.equals("Specific to customers"))
		{
			ProjectLibrary.ClickOnButtonByID("Customers - Specific to customers", "ctl00_ContentPlaceHolder1_rdSelectedCustomer");
		}
		else if (RadioOption.equals("All"))
		{
			ProjectLibrary.ClickOnButtonByID("Customers - All", "ctl00_ContentPlaceHolder1_rdSelectedAll");
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 1, "Item Code", "ctl00_ContentPlaceHolder1_txtitemcode");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 1, "Customer Code", "ctl00_ContentPlaceHolder1_txtcustomercode");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 14, 1, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, "G Item Delivery", "ctl00_ContentPlaceHolder1_txtDelivery");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 1, "H Item Finishing", "ctl00_ContentPlaceHolder1_txtFinishing");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 1, "I Item Proofs", "ctl00_ContentPlaceHolder1_txtProofs");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 1, "J Item Packing", "ctl00_ContentPlaceHolder1_txtPacking");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 19, 1, "K Item Notes", "ctl00_ContentPlaceHolder1_txtNotes");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 1, "L Terms/Instructions", "ctl00_ContentPlaceHolder1_txtInstructions");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_btnNext1");
		ProjectLibrary.ClickOnButtonByID("Pricing", "ctl00_ContentPlaceHolder1_lblPriceing");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 23, 1, "Price Matrix Type ", "ctl00_ContentPlaceHolder1_ddlMatrixType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 1, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 25, 1, "Sold in Packs of", "ctl00_ContentPlaceHolder1_txt_SoldinPack");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 1, "Quantity 1", "txtQty_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 1, "Quantity 2", "txtQty_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 1, "Quantity 3", "txtQty_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 1, "Quantity 4", "txtQty_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 1, "Quantity 5", "txtQty_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 1, "Quantity 6", "txtQty_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 1, "Quantity 7", "txtQty_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 1, "Quantity 8", "txtQty_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 1, "Quantity 9", "txtQty_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 1, "Quantity 10", "txtQty_9");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 2, "Cost ($) 1", "txtCost_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 2, "Cost ($) 2", "txtCost_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 2, "Cost ($) 3", "txtCost_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 2, "Cost ($) 4", "txtCost_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "Cost ($) 5", "txtCost_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 2, "Cost ($) 6", "txtCost_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 2, "Cost ($) 7", "txtCost_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 2, "Cost ($) 8", "txtCost_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 2, "Cost ($) 9", "txtCost_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 2, "Cost ($) 10", "txtCost_9");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 3, "Markup (%) 1", "txtMarkup_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 3, "Markup (%) 2", "txtMarkup_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 3, "Markup (%) 3", "txtMarkup_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 3, "Markup (%) 4", "txtMarkup_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 3, "Markup (%) 5", "txtMarkup_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 3, "Markup (%) 6", "txtMarkup_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 3, "Markup (%) 7", "txtMarkup_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 3, "Markup (%) 8", "txtMarkup_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 3, "Markup (%) 9", "txtMarkup_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 3, "Markup (%) 10", "txtMarkup_9");
		
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 4, "Selling Price ($) 1", "txtSellingPrice_0");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 4, "Selling Price ($) 2", "txtSellingPrice_1");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 4, "Selling Price ($) 3", "txtSellingPrice_2");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 4, "Selling Price ($) 4", "txtSellingPrice_3");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 4, "Selling Price ($) 5", "txtSellingPrice_4");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 4, "Selling Price ($) 6", "txtSellingPrice_5");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 4, "Selling Price ($) 7", "txtSellingPrice_6");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 4, "Selling Price ($) 8", "txtSellingPrice_7");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 4, "Selling Price ($) 9", "txtSellingPrice_8");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 4, "Selling Price ($) 10", "txtSellingPrice_9");
		
		try
		{
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 5, "Weight 1", "txtWeight_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 5, "Weight 2", "txtWeight_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 5, "Weight 3", "txtWeight_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 5, "Weight 4", "txtWeight_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 5, "Weight 5", "txtWeight_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 5, "Weight 6", "txtWeight_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 5, "Weight 7", "txtWeight_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 5, "Weight 8", "txtWeight_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 5, "Weight 9", "txtWeight_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 5, "Weight 10", "txtWeight_9");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 6, "Width 1", "txtWidth_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 6, "Width 2", "txtWidth_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 6, "Width 3", "txtWidth_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 6, "Width 4", "txtWidth_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 6, "Width 5", "txtWidth_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 6, "Width 6", "txtWidth_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 6, "Width 7", "txtWidth_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 6, "Width 8", "txtWidth_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 6, "Width 9", "txtWidth_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 6, "Width 10", "txtWidth_9");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 7, "Height 1", "txtHeight_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 7, "Height 2", "txtHeight_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 7, "Height 3", "txtHeight_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 7, "Height 4", "txtHeight_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 7, "Height 5", "txtHeight_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 7, "Height 6", "txtHeight_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 7, "Height 7", "txtHeight_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 7, "Height 8", "txtHeight_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 7, "Height 9", "txtHeight_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 7, "Height 10", "txtHeight_9");

		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 8, "Length 1", "txtLength_0");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 8, "Length 2", "txtLength_1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 8, "Length 3", "txtLength_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 8, "Length 4", "txtLength_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 8, "Length 5", "txtLength_4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 8, "Length 6", "txtLength_5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 8, "Length 7", "txtLength_6");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 8, "Length 8", "txtLength_7");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 8, "Length 9", "txtLength_8");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 8, "Length 10", "txtLength_9");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_btnNext2");
		ProjectLibrary.ClickOnButtonByID("eStore Settings", "ctl00_ContentPlaceHolder1_lbleStoreSettingsPanel");

		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 50, 1, "Short Description", "ctl00_ContentPlaceHolder1_txtShortdescriprion");
		
//		WebElement frame = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadEdit_txtItemdescriprion_contentIframe"));
//		driver.switchTo().frame(frame);
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 51, 1, "Item Description", "html/body/br");
//		driver.switchTo().defaultContent();
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 53, 1, "Create Thumbnail", "ctl00_ContentPlaceHolder1_chksetPrAsProductimg");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 54, 1, "Force user to view and approve PDF before ordering", "ctl00_ContentPlaceHolder1_chkForceUser");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 57, 1, "Product visible to customer / public accounts", "ctl00_ContentPlaceHolder1_chkProductVisible");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 59, 1, "Short Description", "ctl00_ContentPlaceHolder1_ChkShortDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 60, 1, "Item Description", "ctl00_ContentPlaceHolder1_ChkItemDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 61, 1, "Price Start from", "ctl00_ContentPlaceHolder1_ChkPriceStart");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 62, 1, "Price List", "ctl00_ContentPlaceHolder1_ChkPriceList");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 63, 1, "Price/Subtotal/Tax", "ctl00_ContentPlaceHolder1_chkpricesubtotaltax");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 64, 1, "Print Ready File", "ctl00_ContentPlaceHolder1_ChkPrintReadyFile");
//		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 65, 1, "Allow user to upload artwork file", "ctl00_ContentPlaceHolder1_ChkArtworkFile");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 66, 1, "How Many Upload boxes", "ctl00_ContentPlaceHolder1_ddlArtCount");
//		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 67, 1, "Make the first file upload mandatory", "ctl00_ContentPlaceHolder1_ChkMandatoryArtworkFile");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 68, 1, "Show Stock", "ctl00_ContentPlaceHolder1_Chkshowstock");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 69, 1, "Show Sold in Packs of", "ctl00_ContentPlaceHolder1_chkShowSoldPack");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 70, 1, "Allow Group Run", "ctl00_ContentPlaceHolder1_chkAllowGroupRun");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 71, 1, "Customer Code", "ctl00_ContentPlaceHolder1_chkCustomerCode");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 72, 1, "Item Code", "ctl00_ContentPlaceHolder1_chkItemCode");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 73, 1, "Quick Item Add", "ctl00_ContentPlaceHolder1_chkQuickItemAdd");

		
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnArtworkSave");
		
		EprintSpecificLinks.SuccessMsgVerification("Product Catalogue(s) Saved successfully", "ctl00_ContentPlaceHolder1_ctl02_lblMessage");
	}
}
