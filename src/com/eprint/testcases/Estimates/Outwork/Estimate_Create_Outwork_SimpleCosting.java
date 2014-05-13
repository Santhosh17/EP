// Script for Estimate Create -> Estimate Type : Outwork -> Costing type : Simple Costing
		
package com.eprint.testcases.Estimates.Outwork;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Estimates.Estimate_Add;
import com.eprint.pageObjects.Estimates.Outwork.Estimate_Add_OW_AddPage;

public class Estimate_Create_Outwork_SimpleCosting extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_Outwork_SimpleCosting()
	{
		EprintSpecificLinks.login();
		
		String xlpath = "./src/com/eprint/testData/Estimates/Outwork Simple Costing.xls";
		String sheetName = "Estimate-Outwork-Simple";
		
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "Add New","Add New");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "Add New","Add New");
		}
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
		Generic.BlindWait(2);
		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Autocomplete).perform();
		actions.click().perform();
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 16, 1, "Status", Estimate_Add.drpdn_Status());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 14, 1, "Estimate Title", Estimate_Add_OW_AddPage.txtbx_EstimateTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Quantity1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Quantity2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Quantity3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Quantity4());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 29, 0, "Item Title checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 1, "Item Title", Estimate_Add_OW_AddPage.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 2, "Item Title Description", Estimate_Add_OW_AddPage.txtbx_ItemTitle_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 29, 3, "Item title Save", Estimate_Add_OW_AddPage.chkbx_ItemTitle_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 30, 0, "Item Description checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemDescription());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 1, "Item Description", Estimate_Add_OW_AddPage.txtbx_ItemDescription());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Item Description Description", Estimate_Add_OW_AddPage.txtbx_ItemDescription_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 30, 3, "Item Description Save", Estimate_Add_OW_AddPage.chkbx_ItemDescription_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 31, 0, "Item Artwork checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemArtwork());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 1, "Item Artwork", Estimate_Add_OW_AddPage.txtbx_ItemArtwork());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "Item Artwork Description", Estimate_Add_OW_AddPage.txtbx_ItemArtwork_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 31, 3, "Item Artwork Save", Estimate_Add_OW_AddPage.chkbx_ItemArtwork_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 32, 0, "Item Colour ", Estimate_Add_OW_AddPage.chkbx_ItemColour());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 1, "Item Colour", Estimate_Add_OW_AddPage.txtbx_ItemColour());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "Item Colour Description", Estimate_Add_OW_AddPage.txtbx_ItemColour_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 32, 3, "Item Colour Save", Estimate_Add_OW_AddPage.chkbx_ItemColour_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 33, 0, "Item Size checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemSize());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 1, "Item Size", Estimate_Add_OW_AddPage.txtbx_ItemSize());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 2, "Item Size Description", Estimate_Add_OW_AddPage.txtbx_ItemSize_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 33, 3, "Item Size Save", Estimate_Add_OW_AddPage.chkbx_ItemSize_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 34, 0, "Item Material checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemMaterial());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 1, "Item Material", Estimate_Add_OW_AddPage.txtbx_ItemMaterial());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 2, "Item Material Description", Estimate_Add_OW_AddPage.txtbx_ItemMaterial_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 34, 3, "Item Material Save", Estimate_Add_OW_AddPage.chkbx_ItemMaterial_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 35, 0, "Item Delivery checkbox ",Estimate_Add_OW_AddPage.chkbx_ItemDelivery());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 1, "Item Delivery", Estimate_Add_OW_AddPage.txtbx_ItemDelivery());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 2, "Item Delivery Description", Estimate_Add_OW_AddPage.txtbx_ItemDelivery_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 35, 3, "Item Delivery Save", Estimate_Add_OW_AddPage.chkbx_ItemDelivery_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 0, "Item Finishing checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemFinishing());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 1, "Item Finishing", Estimate_Add_OW_AddPage.txtbx_ItemFinishing());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 2, "Item Finishing Description", Estimate_Add_OW_AddPage.txtbx_ItemFinishing_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 3, "Item Finishing Save", Estimate_Add_OW_AddPage.chkbx_ItemFinishing_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 0, "Item Proofs checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemProofs());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 1, "Item Proofs", Estimate_Add_OW_AddPage.txtbx_ItemProofs());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 2, "Item Proofs Description", Estimate_Add_OW_AddPage.txtbx_ItemProofs_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 3, "Item Proofs Save", Estimate_Add_OW_AddPage.chkbx_ItemProofs_SaveToPhrase());

		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 38, 0, "Item Packing checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemPacking());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 1, "Item Packing", Estimate_Add_OW_AddPage.txtbx_ItemPacking());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 2, "Item Packing Description", Estimate_Add_OW_AddPage.txtbx_ItemPacking_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 38, 3, "Item Packing Save", Estimate_Add_OW_AddPage.chkbx_ItemPacking_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 39, 0, "Item Notes checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemNotes());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 1, "Item Notes", Estimate_Add_OW_AddPage.txtbx_ItemNotes());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 2, "Item Notes Description", Estimate_Add_OW_AddPage.txtbx_ItemNotes_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 39, 3, "Item Notes Save", Estimate_Add_OW_AddPage.chkbx_ItemNotes_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 40, 0, "Terms/Instructions checkbox ", Estimate_Add_OW_AddPage.chkbx_TermsInstructions());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 1, "Terms/Instructions", Estimate_Add_OW_AddPage.txtbx_TermsInstructions());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 2, "Terms/Instructions Description", Estimate_Add_OW_AddPage.txtbx_TermsInstructions_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 40, 3, "Terms/Instructions Save", Estimate_Add_OW_AddPage.chkbx_TermsInstructions_SaveToPhrase());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 1, " Costing Type", Estimate_Add_OW_AddPage.drpdn_CostingType());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 1, "RFQ Return Date", Estimate_Add_OW_AddPage.txtbx_RFQReturnDate());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 2, "RFQ Return Time", Estimate_Add_OW_AddPage.txtbx_RFQReturnTime());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 1, "Job Completion Date", Estimate_Add_OW_AddPage.txtbx_JobCompletionDate());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 48, 1, "Supplier1 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier1_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 49, 1, "Supplier1 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier1_Contact());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 51, 1, "Supplier2 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier2_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 52, 1, "Supplier2 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier2_Contact());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 54, 1, "Supplier3 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier3_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 55, 1, "Supplier3 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier3_Contact());
		
		ProjectLibrary.ClickOnLinkByID("Add More", "link_more");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 57, 1, "Supplier4 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier4_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 58, 1, "Supplier4 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier4_Contact());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add_OW_AddPage.btn_Next());

//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------",true);

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 0, "Supplier Quote -1", Estimate_Add_OW_AddPage.txtbx_SupplierQuote1());
	
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 1, "Supplier-1 Name", Estimate_Add_OW_AddPage.txt_Supplier1Name());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 3, "Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 3, "Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 3, "Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 3, "Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 61, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 62, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 64, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl4());
			
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 6, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 6, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 6, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 6, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 7, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 7, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 63, 7, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 64, 7, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 61, 8, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 62, 8, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 8, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 64, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 63, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 64, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 61, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty1());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 62, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty2());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 63, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty3());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 64, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty4());
//		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 0, "Supplier Quote -2", Estimate_Add_OW_AddPage.txtbx_SupplierQuote2());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 1, "Supplier-2 Name", Estimate_Add_OW_AddPage.txt_Supplier2Name());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 3, "Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 3, "Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 3, "Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 3, "Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost4());
//		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 66, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl1());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 67, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 68, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 69, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 5, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 5, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 5, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 5, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 65, 6, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 6, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 6, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 6, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 65, 8, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType1());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 66, 8, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 67, 8, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 68, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice2().click();
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 65, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice4());
		
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 65, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty1());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 66, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty2());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 67, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty3());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 68, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty4());
		
		Reporter.log("----------------------------------------------------------",true);

		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 0, "Supplier Quote -3", Estimate_Add_OW_AddPage.txtbx_SupplierQuote3());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 1, "Supplier-3 Name", Estimate_Add_OW_AddPage.txt_Supplier3Name());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 3, "Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 3, "Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 3, "Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 3, "Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 69, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 70, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl2());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 5, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 5, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 5, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 5, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 6, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 70, 6, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 71, 6, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 72, 6, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 69, 8, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 70, 8, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType2());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 8, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice3().click();
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 70, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 71, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 72, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice4());
		
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 69, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty1());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 70, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty2());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 71, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty3());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 72, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty4());
		
		Reporter.log("----------------------------------------------------------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 0, "Supplier Quote -4", Estimate_Add_OW_AddPage.txtbx_SupplierQuote4());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 1, "Supplier-4 Name", Estimate_Add_OW_AddPage.txt_Supplier4Name());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 3, "Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 3, "Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 3, "Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 3, "Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 73, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 74, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 75, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl3());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 76, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 5, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryDate1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 5, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryDate2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 5, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryDate3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 5, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 73, 6, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 74, 6, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 75, 6, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 76, 6, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_DeliveryCost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 73, 8, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier4_MarkupType1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 74, 8, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier4_MarkupType2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 75, 8, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier4_MarkupType3());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 76, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier4_MarkupType4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice4().click();
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 73, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 74, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 75, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 76, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice4());
		
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 73, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty1());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 74, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty2());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 75, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty3());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 76, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty4());
		
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_OW_AddPage.btn_Finish());
		Reporter.log("----------------------------------------------------------------------------------",true);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = Estimate_Add_OW_AddPage.EstimateSummary.txt_EstimateNumber().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 2, "Item Title", Estimate_Add_OW_AddPage.EstimateSummary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 1, "Supplier Name 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 1, "Supplier Name 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 1, "Supplier Name 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 1, "Supplier Name 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 0, "Supp. Quote - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 0, "Supp. Quote - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 69, 0, "Supp. Quote - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 0, "Supp. Quote - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 4, "Price - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 4, "Price - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 4, "Price - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 4, "Price - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 4, "Cost Price (ex. Markup) - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 4, "Cost Price (ex. Markup) - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 4, "Cost Price (ex. Markup) - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 4, "Cost Price (ex. Markup) - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 9, "Markup - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 9, "Markup - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 9, "Markup - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 9, "Markup - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 10, "Cost Price (inc. Markup) - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 10, "Cost Price (inc. Markup) - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 10, "Cost Price (inc. Markup) - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 10, "Cost Price (inc. Markup) - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup4());

		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 79, 12, "Profit Margin % -1", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 12, "Profit Margin % -2", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 12, "Profit Margin % -3", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 94, 12, "Profit Margin % -4", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 79, 13, "Profit Margin ($) -1", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 13, "Profit Margin ($) -2", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 13, "Profit Margin ($) -3", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 94, 13, "Profit Margin ($) -4", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice4());
	
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 79, 14, "Sub Total -1", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 14, "Sub Total -2", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 14, "Sub Total -3", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 94, 14, "Sub Total -4", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal4());
	
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 79, 15, "Tax", Estimate_Add_OW_AddPage.EstimateSummary.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 16, "Tax - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 16, "Tax - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 16, "Tax - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 16, "Tax - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 17, "Selling Price (inc. Tax) - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 17, "Selling Price (inc. Tax) - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 17, "Selling Price (inc. Tax) - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 17, "Selling Price (inc. Tax) - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 18, "Gross Profit $ -1", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 18, "Gross Profit $ -2", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 18, "Gross Profit $ -3", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 18, "Gross Profit $ -4", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 19, "Gross Profit % -1", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 19, "Gross Profit % -2", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 19, "Gross Profit % -3", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 19, "Gross Profit % -4", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
	}
}