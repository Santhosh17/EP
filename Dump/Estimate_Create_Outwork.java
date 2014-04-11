package com.eprint.testcases.Estimates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Estimate_Create_Outwork extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_Outwork()
	{
		EprintSpecificLinks.login();
		
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
		String sheetName = "Estimate Add - Outwork";
		
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
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
				
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 1, "Estimate Title", "ctl00_ContentPlaceHolder1_divprintbroker_txtjobtitle");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 1, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 2, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 3, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 4, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty4");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 29, 0, "Item Title checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutItemTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 1, "Item Title", "ctl00_ContentPlaceHolder1_divprintbroker_txtTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 2, "Item Title Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtTitleDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 29, 3, "Item title Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Title");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 30, 0, "Item Description checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutDescription");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 1, "Item Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtOrigination");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 2, "Item Description Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtOriginationDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 30, 3, "Item Description Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Design");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 31, 0, "Item Artwork checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutArtwork");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 1, "Item Artwork", "ctl00_ContentPlaceHolder1_divprintbroker_txtArtwork");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "Item Artwork Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtArtworkDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 31, 3, "Item Artwork Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Artwork");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 32, 0, "Item Colour ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutColour");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 1, "Item Colour", "ctl00_ContentPlaceHolder1_divprintbroker_txtColor");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 2, "Item Colour Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtColorDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 32, 3, "Item Colour Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Color");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 33, 0, "Item Size checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutSize");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 1, "Item Size", "ctl00_ContentPlaceHolder1_divprintbroker_txtSize");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 2, "Item Size Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtSizeDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 33, 3, "Item Size Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Size");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 34, 0, "Item Material checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutMaterial");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 1, "Item Material", "ctl00_ContentPlaceHolder1_divprintbroker_txtMaterial");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 2, "Item Material Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtMaterialDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 34, 3, "Item Material Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Material");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 35, 0, "Item Delivery checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutDelivery");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 1, "Item Delivery", "ctl00_ContentPlaceHolder1_divprintbroker_txtDelivery");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 2, "Item Delivery Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtDeliveryDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 35, 3, "Item Delivery Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Delivery");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 36, 0, "Item Finishing checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutFinishing");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 1, "Item Finishing", "ctl00_ContentPlaceHolder1_divprintbroker_txtFinishing");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 2, "Item Finishing Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtFinishingDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 36, 3, "Item Finishing Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Finishing");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 37, 0, "Item Proofs checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutProofs");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 1, "Item Proofs", "ctl00_ContentPlaceHolder1_divprintbroker_txtProofs");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 2, "Item Proofs Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtProofsDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 37, 3, "Item Proofs Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Proofs");

		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 38, 0, "Item Packing checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutPacking");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 1, "Item Packing", "ctl00_ContentPlaceHolder1_divprintbroker_txtPacking");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 2, "Item Packing Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtPackingDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 38, 3, "Item Packing Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Packing");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 39, 0, "Item Notes checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutNotes");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 1, "Item Notes", "ctl00_ContentPlaceHolder1_divprintbroker_txtNotes");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 2, "Item Notes Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtNotesDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 39, 3, "Item Notes Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Notes");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 40, 0, "Terms/Instructions checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutInstructions");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 1, "Terms/Instructions", "ctl00_ContentPlaceHolder1_divprintbroker_txtTerms");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 2, "Terms/Instructions Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtTermsDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 40, 3, "Terms/Instructions Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Terms");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 41, 1, " Costing Type", "ctl00_ContentPlaceHolder1_divprintbroker_ddlCostingType");
		
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 1, "RFQ Return Date", "ctl00_ContentPlaceHolder1_divprintbroker_txtRFQReturnDate");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "RFQ Return Time", "ctl00_ContentPlaceHolder1_divprintbroker_RadTimePicker1_dateInput_text");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 43, 1, "Job Completion Date", "ctl00_ContentPlaceHolder1_divprintbroker_txtJobCompletionDate");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 48, 1, "Supplier1 - Name", "ddlSupplier_1");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 49, 1, "Supplier1 - Contact", "ddlSupplierContact_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 51, 1, "Supplier2 - Name", "ddlSupplier_2");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 52, 1, "Supplier2 - Contact", "ddlSupplierContact_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 54, 1, "Supplier3 - Name", "ddlSupplier_3");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 55, 1, "Supplier3 - Contact", "ddlSupplierContact_3");
		
		ProjectLibrary.ClickOnLinkByID("Add More", "link_more");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 57, 1, "Supplier4 - Name", "ddlSupplier_4");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 58, 1, "Supplier4 - Contact", "ddlSupplierContact_4");
		

		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_divprintbroker_btnSave");

	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------",true);

		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 0, "Supplier Quote -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[1]/input[1]");
	
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 48, 1, "Supplier-1 Name", "//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[2]");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[3]/input[1]");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 62, 3, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 63, 3, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 64, 3, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[4]/input[1]");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 61, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 62, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 63, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 64, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[5]/select");
		
//		driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[6]/input")).click();
//		driver.findElement(By.id(""))
		
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 6, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 62, 6, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 63, 6, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 64, 6, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 7, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 7, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 63, 7, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 64, 7, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[7]/input");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 61, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 62, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 63, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 64, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[8]/select");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 62, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 63, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 64, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[9]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 63, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 64, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[10]/input[1]");
		
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 61, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 62, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 63, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 64, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 0, "Supplier Quote -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[1]/input[1]");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 51, 1, "Supplier-2 Name", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[2]");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[3]/input[1]");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 66, 3, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 67, 3, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 68, 3, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[4]/input[1]");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 66, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 67, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 68, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 69, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[5]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 5, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 66, 5, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 67, 5, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 68, 5, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 65, 6, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 6, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 67, 6, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 68, 6, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[7]/input");
//		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 65, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 66, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 67, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 68, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[8]/select");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 66, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 67, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 68, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[9]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 65, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 67, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 68, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[10]/input[1]");
		
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 65, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 66, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 67, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 68, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);

		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 0, "Supplier Quote -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[1]/input[1]");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 1, "Supplier-3 Name", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[2]");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[3]/input[1]");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 3, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 3, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 3, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[4]/input[1]");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 69, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 70, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 71, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 72, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[5]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 5, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 5, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 5, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 5, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 69, 6, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 70, 6, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 6, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 72, 6, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[7]/input");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 69, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 70, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 71, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 72, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[8]/select");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[9]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 69, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 70, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 72, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[10]/input[1]");
		
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 69, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 70, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 71, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 72, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 0, "Supplier Quote -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[1]/input[1]");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 1, "Supplier-4 Name", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[2]");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[3]/input[1]");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 74, 3, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 75, 3, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 76, 3, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[4]/input[1]");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 73, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 74, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 75, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 76, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[5]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 5, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 74, 5, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 75, 5, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 76, 5, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 73, 6, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 74, 6, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 75, 6, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 6, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[7]/input");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 73, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 74, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 75, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 76, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[8]/select");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 74, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 75, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 76, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[9]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 73, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[10]/input[1]");
		driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[10]/input[1]")).click();
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 74, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 75, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[10]/input[1]");
		
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 73, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 74, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 75, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 76, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.ClickOnButtonByID("FINISH", "ctl00_ContentPlaceHolder1_divprintbroker_Button12");
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 29, 2, "Item Title", "//table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/div/label");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 48, 1, "Supplier Name 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[2]/span/b");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 51, 1, "Supplier Name 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[3]/span/b");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 1, "Supplier Name 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[4]/span/b");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 1, "Supplier Name 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[5]/span/b");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 61, 0, "Supp. Quote - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 65, 0, "Supp. Quote - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 69, 0, "Supp. Quote - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 73, 0, "Supp. Quote - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[5]/span");

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 61, 4, "Price - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[2]/span", 1, 4, 0, 3);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 66, 4, "Price - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[3]/span", 1, 4, 0, 3);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 71, 4, "Price - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[4]/span", 1, 4, 0, 3);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 76, 4, "Price - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[5]/span", 1, 4, 0, 3);
		
//		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 4, "Price - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[2]/span", 1);
//		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 4, "Price - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[3]/span", 1);
//		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 4, "Price - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[4]/span", 1);
//		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 4, "Price - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[5]/span", 1);
		
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 4, "Cost Price (ex. Markup) - 1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 4, "Cost Price (ex. Markup) - 2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 4, "Cost Price (ex. Markup) - 3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 4, "Cost Price (ex. Markup) - 4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span", 1);

		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 9, "Markup - 1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 9, "Markup - 2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 9, "Markup - 3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 9, "Markup - 4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span", 1);

		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 10, "Cost Price (inc. Markup) - 1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 10, "Cost Price (inc. Markup) - 2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 10, "Cost Price (inc. Markup) - 3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 10, "Cost Price (inc. Markup) - 4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span", 1);

		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 12, "Profit Margin % -1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 12, "Profit Margin % -2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 12, "Profit Margin % -3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 12, "Profit Margin % -4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 13, "Profit Margin ($) -1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 13, "Profit Margin ($) -2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 13, "Profit Margin ($) -3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 13, "Profit Margin ($) -4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input");
	
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 14, "Sub Total -1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 14, "Sub Total -2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 14, "Sub Total -3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 14, "Sub Total -4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input");
	
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 61, 15, "Tax", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[1]/div/div");
		
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 16, "Tax - 1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[2]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 16, "Tax - 2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[3]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 16, "Tax - 3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[4]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 16, "Tax - 4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[5]/span", 1);

		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 17, "Selling Price (inc. Tax) - 1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 17, "Selling Price (inc. Tax) - 2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 17, "Selling Price (inc. Tax) - 3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 17, "Selling Price (inc. Tax) - 4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span", 1);

		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 61, 18, "Gross Profit $ -1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[1]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 66, 18, "Gross Profit $ -2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[1]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 71, 18, "Gross Profit $ -3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[1]/span", 1);
		ProjectLibrary.CompareSubStringTextByXpath(xlpath, sheetName, 76, 18, "Gross Profit $ -4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[1]/span", 1);
		
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 61, 19, "Gross Profit % -1", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[3]/span", 1, 6, 0, 5);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 66, 19, "Gross Profit % -2", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[3]/span", 1, 6, 0, 5);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 71, 19, "Gross Profit % -3", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[3]/span", 1, 6, 0, 5);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 76, 19, "Gross Profit % -4", "//table/tbody/tr[3]/td/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[3]/span", 1, 6, 0, 5);
		
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_UCItemSummaryMain_UcItemTotal_117358_btnSave");
	}
}