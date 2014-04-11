// Script for Estimate Update -> Estimate Type : Outwork -> Costing type : Simple Costing

package com.eprint.testcases.Estimates;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

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
		
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
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
	
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 21, "Estimate Title", "ctl00_ContentPlaceHolder1_divprintbroker_txtjobtitle");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 21, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 22, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 23, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 24, "Quantity - 1", "ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty4");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 29, 20, "Item Title checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutItemTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 21, "Item Title", "ctl00_ContentPlaceHolder1_divprintbroker_txtTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 22, "Item Title Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtTitleDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 29, 23, "Item title Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Title");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 30, 20, "Item Description checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutDescription");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 21, "Item Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtOrigination");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 22, "Item Description Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtOriginationDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 30, 23, "Item Description Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Design");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 31, 20, "Item Artwork checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutArtwork");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 21, "Item Artwork", "ctl00_ContentPlaceHolder1_divprintbroker_txtArtwork");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 22, "Item Artwork Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtArtworkDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 31, 23, "Item Artwork Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Artwork");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 32, 20, "Item Colour ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutColour");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 21, "Item Colour", "ctl00_ContentPlaceHolder1_divprintbroker_txtColor");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 22, "Item Colour Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtColorDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 32, 23, "Item Colour Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Color");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 33, 20, "Item Size checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutSize");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 21, "Item Size", "ctl00_ContentPlaceHolder1_divprintbroker_txtSize");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 22, "Item Size Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtSizeDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 33, 23, "Item Size Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Size");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 34, 20, "Item Material checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutMaterial");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 21, "Item Material", "ctl00_ContentPlaceHolder1_divprintbroker_txtMaterial");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 22, "Item Material Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtMaterialDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 34, 23, "Item Material Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Material");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 35, 20, "Item Delivery checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutDelivery");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 21, "Item Delivery", "ctl00_ContentPlaceHolder1_divprintbroker_txtDelivery");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 22, "Item Delivery Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtDeliveryDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 35, 23, "Item Delivery Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Delivery");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 36, 20, "Item Finishing checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutFinishing");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 21, "Item Finishing", "ctl00_ContentPlaceHolder1_divprintbroker_txtFinishing");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 22, "Item Finishing Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtFinishingDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 36, 23, "Item Finishing Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Finishing");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 37, 20, "Item Proofs checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutProofs");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 21, "Item Proofs", "ctl00_ContentPlaceHolder1_divprintbroker_txtProofs");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 22, "Item Proofs Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtProofsDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 37, 23, "Item Proofs Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Proofs");

		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 38, 20, "Item Packing checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutPacking");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 21, "Item Packing", "ctl00_ContentPlaceHolder1_divprintbroker_txtPacking");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 22, "Item Packing Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtPackingDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 38, 23, "Item Packing Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Packing");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 39, 20, "Item Notes checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutNotes");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 21, "Item Notes", "ctl00_ContentPlaceHolder1_divprintbroker_txtNotes");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 22, "Item Notes Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtNotesDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 39, 23, "Item Notes Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Notes");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 40, 20, "Terms/Instructions checkbox ", "ctl00_ContentPlaceHolder1_divprintbroker_chkOutInstructions");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 21, "Terms/Instructions", "ctl00_ContentPlaceHolder1_divprintbroker_txtTerms");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 22, "Terms/Instructions Description", "ctl00_ContentPlaceHolder1_divprintbroker_txtTermsDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 40, 23, "Terms/Instructions Save", "ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Terms");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 41, 21, " Costing Type", "ctl00_ContentPlaceHolder1_divprintbroker_ddlCostingType");
		
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 1, "RFQ Return Date", "ctl00_ContentPlaceHolder1_divprintbroker_txtRFQReturnDate");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "RFQ Return Time", "ctl00_ContentPlaceHolder1_divprintbroker_RadTimePicker1_dateInput_text");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 43, 1, "Job Completion Date", "ctl00_ContentPlaceHolder1_divprintbroker_txtJobCompletionDate");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 48, 21, "Supplier1 - Name", "ddlSupplier_1");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 49, 1, "Supplier1 - Contact", "ddlSupplierContact_1");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 51, 21, "Supplier2 - Name", "ddlSupplier_2");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 52, 1, "Supplier2 - Contact", "ddlSupplierContact_2");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 54, 21, "Supplier3 - Name", "ddlSupplier_3");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 55, 1, "Supplier3 - Contact", "ddlSupplierContact_3");
		
//		ProjectLibrary.ClickOnLinkByID("Add More", "link_more");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 57, 21, "Supplier4 - Name", "ddlSupplier_4");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 58, 1, "Supplier4 - Contact", "ddlSupplierContact_4");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 42, 21, "Copy The Item Description fields above to customer estimate item description field", "ctl00_ContentPlaceHolder1_divprintbroker_Chk_CopytoCustomr");

		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_divprintbroker_btnSave");

//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------",true);

		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 20, "Supplier Quote -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[1]/input[1]");
	
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 48, 21, "Supplier-1 Name", "//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[2]");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 21, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[3]/input[1]");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 23, "Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 62, 3, "Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 63, 3, "Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 64, 3, "Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[4]/input[1]");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 61, 25, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 62, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 63, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 64, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[5]/select");
		
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
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 61, 28, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 62, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 63, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 64, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[8]/select");
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 61, 29, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 62, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 63, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 64, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[9]/input");
		
		driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[10]/input[1]")).click();
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 30, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 63, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 64, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[10]/input[1]");
		
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 61, 31, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 62, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 63, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 64, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 20, "Supplier Quote -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[1]/input[1]");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 51, 21, "Supplier-2 Name", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[2]");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 22, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[3]/input[1]");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 66, 23, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 67, 3, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 68, 3, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[4]/input[1]");
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 66, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 67, 25, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 68, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 69, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[5]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 5, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 66, 5, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 67, 5, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 68, 5, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 65, 6, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 6, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 67, 6, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 68, 6, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[7]/input");
//		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 65, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 66, 28, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 67, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 68, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[8]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 65, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 66, 29, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 67, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 68, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[9]/input");
		
		driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[10]/input[1]")).click();
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 65, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 66, 30, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 67, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 68, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[10]/input[1]");
		
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 65, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 66, 31, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 67, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 68, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);

		
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 20, "Supplier Quote -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[1]/input[1]");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 21, "Supplier-3 Name", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[2]");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 23, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 4, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[3]/input[1]");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 3, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 23, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 3, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[4]/input[1]");
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 69, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 70, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 71, 25, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 72, 5, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[5]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 5, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 5, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 5, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 5, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 69, 6, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 70, 6, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 6, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 72, 6, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[7]/input");
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 69, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 70, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 71, 28, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 72, 8, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[8]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 69, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 70, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 71, 29, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 72, 9, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[9]/input");
		
		driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[10]/input[1]")).click();
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 69, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 70, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 71, 30, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 72, 10, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[10]/input[1]");
		
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 69, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 70, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 71, 31, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 72, 11, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 20, "Supplier Quote -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[1]/input[1]");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 21, "Supplier-4 Name", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[2]");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 1, "Quantity - 1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 2, "Quantity - 2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[3]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 3, "Quantity - 3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 27, 24, "Quantity - 4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[3]/input[1]");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 3, "Unit Cost - 1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 74, 3, "Unit Cost - 2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[4]/input[1]");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 75, 3, "Unit Cost - 3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[4]/input[1]");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 76, 23, "Unit Cost - 4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[4]/input[1]");
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 73, 5, "Delivery Included -1", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 74, 5, "Delivery Included -2", "//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[5]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 75, 5, "Delivery Included -3", "//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[5]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 76, 25, "Delivery Included -4", "//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[5]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 5, "Delivery Date -1", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 74, 5, "Delivery Date -2", "//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 75, 5, "Delivery Date -3", "//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[6]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 76, 5, "Delivery Date -4", "//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[6]/input");
		
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 73, 6, "Delivery Cost - 1", "//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 74, 6, "Delivery Cost - 2", "//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 75, 6, "Delivery Cost - 3", "//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[7]/input");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 6, "Delivery Cost - 4", "//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[7]/input");
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 73, 8, "Markup Type -1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 74, 8, "Markup Type -2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[8]/select");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 75, 8, "Markup Type -3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[8]/select");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 76, 28, "Markup Type -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[8]/select");
		
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 73, 9, "Markup Value -1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 74, 9, "Markup Value -2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[9]/input");
//		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 75, 9, "Markup Value -3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[9]/input");
		ProjectLibrary.StringDDTextBoxXpath(xlpath, sheetName, 76, 29, "Markup Value -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[9]/input");
		
		driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[10]/input[1]")).click();
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 73, 10, "Total Price - 1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 74, 10, "Total Price - 2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[10]/input[1]");
//		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 75, 10, "Total Price - 3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[10]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 76, 30, "Total Price - 4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[10]/input[1]");
		
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 73, 11, "Select Supplier & Quantities -1", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 74, 11, "Select Supplier & Quantities -2", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[11]/input[1]");
//		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 75, 11, "Select Supplier & Quantities -3", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[11]/input[1]");
		ProjectLibrary.ChkBoxSelectionbyXpath(xlpath, sheetName, 76, 31, "Select Supplier & Quantities -4", "//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[11]/input[1]");
		
		Reporter.log("----------------------------------------------------------",true);
		
		ProjectLibrary.ClickOnButtonByID("FINISH", "ctl00_ContentPlaceHolder1_divprintbroker_Button12");
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 29, 22, "Item Title", "//table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/div/label");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 48, 21, "Supplier Name 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[2]/span/b");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 51, 21, "Supplier Name 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[3]/span/b");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 21, "Supplier Name 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[4]/span/b");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 21, "Supplier Name 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr/td[5]/span/b");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 61, 20, "Supp. Quote - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 65, 20, "Supp. Quote - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 69, 20, "Supp. Quote - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 73, 20, "Supp. Quote - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[5]/span");

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 21, "Quantity - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 22, "Quantity - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 23, "Quantity - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 24, "Quantity - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 24, "Price - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 24, "Price - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 24, "Price - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 24, "Price - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table[2]/tbody/tr[4]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 24, "Cost Price (ex. Markup) - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 24, "Cost Price (ex. Markup) - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 24, "Cost Price (ex. Markup) - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 24, "Cost Price (ex. Markup) - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 29, "Markup - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 29, "Markup - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 29, "Markup - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 29, "Markup - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 30, "Cost Price (inc. Markup) - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 30, "Cost Price (inc. Markup) - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 30, "Cost Price (inc. Markup) - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 30, "Cost Price (inc. Markup) - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 79, 32, "Profit Margin % -1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 84, 32, "Profit Margin % -2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 89, 32, "Profit Margin % -3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 94, 32, "Profit Margin % -4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 79, 33, "Profit Margin ($) -1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 84, 33, "Profit Margin ($) -2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 89, 33, "Profit Margin ($) -3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 94, 33, "Profit Margin ($) -4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 79, 34, "Sub Total -1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 84, 34, "Sub Total -2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 89, 34, "Sub Total -3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 94, 34, "Sub Total -4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 79, 35, "Tax", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[1]/div/div/select");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 36, "Tax - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 36, "Tax - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 36, "Tax - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 36, "Tax - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 37, "Selling Price (inc. Tax) - 1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 37, "Selling Price (inc. Tax) - 2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 37, "Selling Price (inc. Tax) - 3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 37, "Selling Price (inc. Tax) - 4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 38, "Gross Profit $ -1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 38, "Gross Profit $ -2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 38, "Gross Profit $ -3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 38, "Gross Profit $ -4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[1]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 79, 39, "Gross Profit % -1", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 84, 39, "Gross Profit % -2", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 89, 39, "Gross Profit % -3", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 94, 39, "Gross Profit % -4", "//table/tbody/tr/td/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[3]/span");
		
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
	}
}