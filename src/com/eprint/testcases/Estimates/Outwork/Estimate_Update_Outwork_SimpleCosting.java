// Script for Estimate Update -> Estimate Type : Outwork -> Costing type : Simple Costing

package com.eprint.testcases.Estimates.Outwork;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Estimates.Outwork.Estimate_Add_OW_AddPage;

public class Estimate_Update_Outwork_SimpleCosting extends SuperTestNG
{
	@Test
	public static void testEstimate_Update_Outwork_SimpleCosting()
	{
		EprintSpecificLinks.login();
		
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "View All Quotes","View All Quotes");
		}
		
		String xlpath = "./src/com/eprint/testData/Estimates/Outwork Simple Costing.xls";
		String sheetName = "Estimate-Outwork-Simple";
		
		String EstimateTitle = Generic.getXlCellValue(xlpath, sheetName, 14, 1);
		driver.findElement(By.xpath("//div/div/table/tbody/tr/td[text()='"+EstimateTitle+"']")).click();
		
		driver.findElement(By.xpath("//div/div/a/input[@value='Action']")).click();
		driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']")).click();
		
//		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
//		Generic.BlindWait(2);
//		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Autocomplete).perform();
//		actions.click().perform();
//		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
//		
//		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 21, "Estimate Title", Estimate_Add_OW_AddPage.txtbx_EstimateTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 21, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Quantity1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 22, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Quantity2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 23, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Quantity3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 24, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Quantity4());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 29, 20, "Item Title checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 21, "Item Title", Estimate_Add_OW_AddPage.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 22, "Item Title Description", Estimate_Add_OW_AddPage.txtbx_ItemTitle_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 29, 23, "Item title Save", Estimate_Add_OW_AddPage.chkbx_ItemTitle_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 30, 20, "Item Description checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemDescription());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 21, "Item Description", Estimate_Add_OW_AddPage.txtbx_ItemDescription());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 22, "Item Description Description", Estimate_Add_OW_AddPage.txtbx_ItemDescription_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 30, 23, "Item Description Save", Estimate_Add_OW_AddPage.chkbx_ItemDescription_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 31, 20, "Item Artwork checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemArtwork());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 21, "Item Artwork", Estimate_Add_OW_AddPage.txtbx_ItemArtwork());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 22, "Item Artwork Description", Estimate_Add_OW_AddPage.txtbx_ItemArtwork_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 31, 23, "Item Artwork Save", Estimate_Add_OW_AddPage.chkbx_ItemArtwork_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 32, 20, "Item Colour ", Estimate_Add_OW_AddPage.chkbx_ItemColour());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 21, "Item Colour", Estimate_Add_OW_AddPage.txtbx_ItemColour());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 22, "Item Colour Description", Estimate_Add_OW_AddPage.txtbx_ItemColour_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 32, 23, "Item Colour Save", Estimate_Add_OW_AddPage.chkbx_ItemColour_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 33, 20, "Item Size checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemSize());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 21, "Item Size", Estimate_Add_OW_AddPage.txtbx_ItemSize());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 22, "Item Size Description", Estimate_Add_OW_AddPage.txtbx_ItemSize_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 33, 23, "Item Size Save", Estimate_Add_OW_AddPage.chkbx_ItemSize_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 34, 20, "Item Material checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemMaterial());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 21, "Item Material", Estimate_Add_OW_AddPage.txtbx_ItemMaterial());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 22, "Item Material Description", Estimate_Add_OW_AddPage.txtbx_ItemMaterial_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 34, 23, "Item Material Save", Estimate_Add_OW_AddPage.chkbx_ItemMaterial_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 35, 20, "Item Delivery checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemDelivery());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 21, "Item Delivery", Estimate_Add_OW_AddPage.txtbx_ItemDelivery());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 22, "Item Delivery Description", Estimate_Add_OW_AddPage.txtbx_ItemDelivery_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 35, 23, "Item Delivery Save", Estimate_Add_OW_AddPage.chkbx_ItemDelivery_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 20, "Item Finishing checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemFinishing());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 21, "Item Finishing", Estimate_Add_OW_AddPage.txtbx_ItemFinishing());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 22, "Item Finishing Description", Estimate_Add_OW_AddPage.txtbx_ItemFinishing_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 23, "Item Finishing Save", Estimate_Add_OW_AddPage.chkbx_ItemFinishing_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 20, "Item Proofs checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemProofs());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 21, "Item Proofs", Estimate_Add_OW_AddPage.txtbx_ItemProofs());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 22, "Item Proofs Description", Estimate_Add_OW_AddPage.txtbx_ItemProofs_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 23, "Item Proofs Save", Estimate_Add_OW_AddPage.chkbx_ItemProofs_SaveToPhrase());

		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 38, 20, "Item Packing checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemPacking());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 21, "Item Packing", Estimate_Add_OW_AddPage.txtbx_ItemPacking());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 22, "Item Packing Description", Estimate_Add_OW_AddPage.txtbx_ItemPacking_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 38, 23, "Item Packing Save", Estimate_Add_OW_AddPage.chkbx_ItemPacking_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 39, 20, "Item Notes checkbox ", Estimate_Add_OW_AddPage.chkbx_ItemNotes());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 21, "Item Notes", Estimate_Add_OW_AddPage.txtbx_ItemNotes());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 22, "Item Notes Description", Estimate_Add_OW_AddPage.txtbx_ItemNotes_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 39, 23, "Item Notes Save", Estimate_Add_OW_AddPage.chkbx_ItemNotes_SaveToPhrase());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 40, 20, "Terms/Instructions checkbox ", Estimate_Add_OW_AddPage.chkbx_TermsInstructions());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 21, "Terms/Instructions", Estimate_Add_OW_AddPage.txtbx_TermsInstructions());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 22, "Terms/Instructions Description", Estimate_Add_OW_AddPage.txtbx_TermsInstructions_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 40, 23, "Terms/Instructions Save", Estimate_Add_OW_AddPage.chkbx_TermsInstructions_SaveToPhrase());
		
		ProjectLibrary.CompareStringDropDownText(xlpath, sheetName, 41, 21, " Costing Type", Estimate_Add_OW_AddPage.drpdn_CostingType());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 1, "RFQ Return Date", Estimate_Add_OW_AddPage.txtbx_RFQReturnDate());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 2, "RFQ Return Time", Estimate_Add_OW_AddPage.txtbx_RFQReturnTime());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 1, "Job Completion Date", Estimate_Add_OW_AddPage.txtbx_JobCompletionDate());
		
		ProjectLibrary.CompareStringDropDownText(xlpath, sheetName, 48, 21, "Supplier1 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier1_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 49, 1, "Supplier1 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier1_Contact());
		
		ProjectLibrary.CompareStringDropDownText(xlpath, sheetName, 51, 21, "Supplier2 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier2_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 52, 1, Estimate_Add_OW_AddPage.drpdn_Supplier2_Contact());
		
		ProjectLibrary.CompareStringDropDownText(xlpath, sheetName, 54, 21, "Supplier3 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier3_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 55, 1, "Supplier3 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier3_Contact());
		
//		ProjectLibrary.ClickOnLinkByID("Add More", "link_more");
		
		ProjectLibrary.CompareStringDropDownText(xlpath, sheetName, 57, 21, "Supplier4 - Name", Estimate_Add_OW_AddPage.drpdn_Supplier4_Name());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 58, 1, "Supplier4 - Contact", Estimate_Add_OW_AddPage.drpdn_Supplier4_Contact());
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 42, 21, "Copy The Item Description fields above to customer estimate item description field", "ctl00_ContentPlaceHolder1_divprintbroker_Chk_CopytoCustomr");

		ProjectLibrary.ClickOnButton("Next", Estimate_Add_OW_AddPage.btn_Next());

//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------",true);

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 20, "Supplier Quote -1", Estimate_Add_OW_AddPage.txtbx_SupplierQuote1());
	
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 21, "Supplier-1 Name", Estimate_Add_OW_AddPage.txt_Supplier1Name());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 21, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_Qty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 23, "Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 3, "Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 3, "Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 3, "Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_Cost4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 61, 25, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 62, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 64, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier1_DeliveryIncl4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 6, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 6, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 6, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 6, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBoxBy(xlpath, sheetName, 61, 7, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBoxBy(xlpath, sheetName, 62, 7, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBoxBy(xlpath, sheetName, 63, 7, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBoxBy(xlpath, sheetName, 64, 7, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_DeliveryCost4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 61, 28, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 62, 8, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 8, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 64, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier1_MarkupType4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 29, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier1_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 30, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 63, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 64, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier1_TotalPrice4());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 61, 31, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty1());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 62, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty2());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 63, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty3());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 64, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier1_SelectSupplierAndQty4());
		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 20, "Supplier Quote -2", Estimate_Add_OW_AddPage.txtbx_SupplierQuote2());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 21, "Supplier-2 Name", Estimate_Add_OW_AddPage.txt_Supplier2Name());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 22, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_Qty4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 3, "Unit Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 23, "Unit Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 3, "Unit Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 3, "Unit Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_Cost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 66, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl2());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 67, 25, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 68, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 69, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier2_DeliveryIncl2());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 5, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 5, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 5, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 5, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 65, 6, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 6, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 6, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 6, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_DeliveryCost4());
//		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 65, 8, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType1());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 66, 28, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 67, 8, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 68, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier2_MarkupType4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 29, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier2_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice2().click();
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 65, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 30, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier2_TotalPrice4());
		
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 65, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty1());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 66, 31, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty2());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 67, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty3());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 68, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier2_SelectSupplierAndQty4());
		
		Reporter.log("----------------------------------------------------------",true);

		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 20, "Supplier Quote -3", Estimate_Add_OW_AddPage.txtbx_SupplierQuote3());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 21, "Supplier-3 Name", Estimate_Add_OW_AddPage.txt_Supplier3Name());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 23, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 4, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_Qty4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 3, "Unit Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 3, "Unit Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 23, "Unit Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 3, "Unit Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_Cost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 69, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 70, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl2());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 25, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 5, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier3_DeliveryIncl4());
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 5, "Delivery Date -1", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate1());
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 5, "Delivery Date -2", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate2());
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 5, "Delivery Date -3", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate3());
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 5, "Delivery Date -4", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryDate4());
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 69, 6, "Delivery Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost1());
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 70, 6, "Delivery Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost2());
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 6, "Delivery Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost3());
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 72, 6, "Delivery Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_DeliveryCost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 69, 8, "Markup Type -1", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 70, 8, "Markup Type -2", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType2());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 28, "Markup Type -3", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType3());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 8, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier3_MarkupType4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 29, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 9, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier3_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice3().click();
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 70, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 71, 30, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice3());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 72, 10, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier3_TotalPrice4());
		
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 69, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty1());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 70, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty2());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 71, 31, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty3());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 72, 11, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier3_SelectSupplierAndQty4());
		
		Reporter.log("----------------------------------------------------------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 20, "Supplier Quote -4", Estimate_Add_OW_AddPage.txtbx_SupplierQuote4());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 21, "Supplier-4 Name", Estimate_Add_OW_AddPage.txt_Supplier4Name());
		
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 1, "Quantity - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 2, "Quantity - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 3, "Quantity - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 27, 24, "Quantity - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_Qty4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 3, "Unit Cost - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 3, "Unit Cost - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 3, "Unit Cost - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 23, "Unit Cost - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_Cost4());
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 73, 5, "Delivery Included -1", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl1());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 74, 5, "Delivery Included -2", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl2());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 75, 5, "Delivery Included -3", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl3());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 76, 25, "Delivery Included -4", Estimate_Add_OW_AddPage.drpdn_Supplier4_DeliveryIncl4());
		
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
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 76, 28, "Markup Type -4", Estimate_Add_OW_AddPage.drpdn_Supplier4_MarkupType4());
		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 9, "Markup Value -1", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 9, "Markup Value -2", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 9, "Markup Value -3", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 29, "Markup Value -4", Estimate_Add_OW_AddPage.txtbx_Supplier4_MarkupValue4());
		
		Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice4().click();
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 73, 10, "Total Price - 1", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice1());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 74, 10, "Total Price - 2", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice2());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 75, 10, "Total Price - 3", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 76, 30, "Total Price - 4", Estimate_Add_OW_AddPage.txtbx_Supplier4_TotalPrice4());
		
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 73, 11, "Select Supplier & Quantities -1", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty1());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 74, 11, "Select Supplier & Quantities -2", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty2());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 75, 11, "Select Supplier & Quantities -3", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty3());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 76, 31, "Select Supplier & Quantities -4", Estimate_Add_OW_AddPage.chkbx_Supplier4_SelectSupplierAndQty4());
		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.ClickOnButton("FINISH", Estimate_Add_OW_AddPage.btn_Finish());
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 22, "Item Title", Estimate_Add_OW_AddPage.EstimateSummary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 21, "Supplier Name 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 21, "Supplier Name 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 21, "Supplier Name 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 21, "Supplier Name 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierName4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 20, "Supp. Quote - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 20, "Supp. Quote - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 69, 20, "Supp. Quote - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 20, "Supp. Quote - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQuote4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 21, "Quantity - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 22, "Quantity - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 23, "Quantity - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 24, "Quantity - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SupplierQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 24, "Price - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 24, "Price - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 24, "Price - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 24, "Price - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_Price4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 24, "Cost Price (ex. Markup) - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 24, "Cost Price (ex. Markup) - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 24, "Cost Price (ex. Markup) - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 24, "Cost Price (ex. Markup) - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceExcMarkup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 29, "Markup - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 29, "Markup - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 29, "Markup - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 29, "Markup - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 30, "Cost Price (inc. Markup) - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 30, "Cost Price (inc. Markup) - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 30, "Cost Price (inc. Markup) - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 30, "Cost Price (inc. Markup) - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_CostPriceIncMarkup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 79, 32, "Profit Margin % -1", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 32, "Profit Margin % -2", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 32, "Profit Margin % -3", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 94, 32, "Profit Margin % -4", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 79, 33, "Profit Margin ($) -1", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 33, "Profit Margin ($) -2", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 33, "Profit Margin ($) -3", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 94, 33, "Profit Margin ($) -4", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_ProfitMarginPrice4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 79, 34, "Sub Total -1", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 34, "Sub Total -2", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 34, "Sub Total -3", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 94, 34, "Sub Total -4", Estimate_Add_OW_AddPage.EstimateSummary.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 79, 35, "Tax", Estimate_Add_OW_AddPage.EstimateSummary.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 36, "Tax - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 36, "Tax - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 36, "Tax - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 36, "Tax - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 37, "Selling Price (inc. Tax) - 1", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 37, "Selling Price (inc. Tax) - 2", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 37, "Selling Price (inc. Tax) - 3", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 37, "Selling Price (inc. Tax) - 4", Estimate_Add_OW_AddPage.EstimateSummary.txt_SellingPriceIncTax4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 38, "Gross Profit $ -1", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 38, "Gross Profit $ -2", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 38, "Gross Profit $ -3", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 38, "Gross Profit $ -4", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 39, "Gross Profit % -1", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 84, 39, "Gross Profit % -2", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 39, "Gross Profit % -3", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 39, "Gross Profit % -4", Estimate_Add_OW_AddPage.EstimateSummary.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
	}
}