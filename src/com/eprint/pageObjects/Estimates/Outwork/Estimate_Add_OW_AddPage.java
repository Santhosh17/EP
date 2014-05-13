package com.eprint.pageObjects.Estimates.Outwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_OW_AddPage extends SuperTestNG
{
	public static WebElement txtbx_EstimateTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtjobtitle"));
		return element;
	}
	public static WebElement txtbx_Quantity1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty1"));
		return element;
	}
	public static WebElement txtbx_Quantity2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty2"));
		return element;
	}
	public static WebElement txtbx_Quantity3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty3"));
		return element;
	}
	public static WebElement txtbx_Quantity4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty4"));
		return element;
	}
	public static WebElement chkbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutItemTitle"));
		return element;
	}
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtTitle"));
		return element;
	}
	public static WebElement btn_ItemTitle_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[2][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtTitle']]]/div[3]/input"));
		return element;
	}
	public static WebElement txtbx_ItemTitle_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtTitleDescription"));
		return element;
	}
	public static WebElement chkbx_ItemTitle_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Title"));
		return element;
	}
	public static WebElement chkbx_ItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutDescription"));
		return element;
	}
	public static WebElement txtbx_ItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtOrigination"));
		return element;
	}
	public static WebElement btn_ItemDescription_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtOrigination']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemDescription_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtOriginationDescription"));
		return element;
	}
	public static WebElement chkbx_ItemDescription_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Design"));
		return element;
	}
	public static WebElement chkbx_ItemArtwork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutArtwork"));
		return element;
	}
	public static WebElement txtbx_ItemArtwork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtArtwork"));
		return element;
	}
	public static WebElement btn_ItemArtwork_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtArtwork']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemArtwork_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtArtworkDescription"));
		return element;
	}
	public static WebElement chkbx_ItemArtwork_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Artwork"));
		return element;
	}
	public static WebElement chkbx_ItemColour()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutColour"));
		return element;
	}
	public static WebElement txtbx_ItemColour()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtColor"));
		return element;
	}
	public static WebElement btn_ItemColour_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtColor']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemColour_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtColorDescription"));
		return element;
	}
	public static WebElement chkbx_ItemColour_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Color"));
		return element;
	}
	public static WebElement chkbx_ItemSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutSize"));
		return element;
	}
	public static WebElement txtbx_ItemSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtSize"));
		return element;
	}
	public static WebElement btn_ItemSize_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtSize']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemSize_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtSizeDescription"));
		return element;
	}
	public static WebElement chkbx_ItemSize_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Size"));
		return element;
	}
	public static WebElement chkbx_ItemMaterial()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutMaterial"));
		return element;
	}
	public static WebElement txtbx_ItemMaterial()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMaterial"));
		return element;
	}
	public static WebElement btn_ItemMaterial_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtMaterial']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemMaterial_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMaterialDescription"));
		return element;
	}
	public static WebElement chkbx_ItemMaterial_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Material"));
		return element;
	}
	public static WebElement chkbx_ItemDelivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtDelivery"));
		return element;
	}
	public static WebElement txtbx_ItemDelivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtDelivery"));
		return element;
	}
	public static WebElement btn_ItemDelivery_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtDelivery']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemDelivery_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtDeliveryDescription"));
		return element;
	}
	public static WebElement chkbx_ItemDelivery_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Delivery"));
		return element;
	}
	public static WebElement chkbx_ItemFinishing()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutFinishing"));
		return element;
	}
	public static WebElement txtbx_ItemFinishing()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtFinishing"));
		return element;
	}
	public static WebElement btn_ItemFinishing_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtFinishing']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemFinishing_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtFinishingDescription"));
		return element;
	}
	public static WebElement chkbx_ItemFinishing_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Finishing"));
		return element;
	}
	public static WebElement chkbx_ItemProofs()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutProofs"));
		return element;
	}
	public static WebElement txtbx_ItemProofs()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtProofs"));
		return element;
	}
	public static WebElement btn_ItemProofs_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtProofs']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemProofs_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtProofsDescription"));
		return element;
	}
	public static WebElement chkbx_ItemProofs_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Proofs"));
		return element;
	}
	public static WebElement chkbx_ItemPacking()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutPacking"));
		return element;
	}
	public static WebElement txtbx_ItemPacking()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtPacking"));
		return element;
	}
	public static WebElement btn_ItemPacking_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtPacking']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemPacking_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtPackingDescription"));
		return element;
	}
	public static WebElement chkbx_ItemPacking_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Packing"));
		return element;
	}
	public static WebElement chkbx_ItemNotes()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutNotes"));
		return element;
	}
	public static WebElement txtbx_ItemNotes()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtNotes"));
		return element;
	}
	public static WebElement btn_ItemNotes_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtNotes']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_ItemNotes_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtNotesDescription"));
		return element;
	}
	public static WebElement chkbx_ItemNotes_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Notes"));
		return element;
	}
	
	public static WebElement chkbx_TermsInstructions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutInstructions"));
		return element;
	}
	public static WebElement txtbx_TermsInstructions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtTerms"));
		return element;
	}
	public static WebElement btn_TermsInstructions_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtTerms']]]/div[2]/input"));
		return element;
	}
	public static WebElement txtbx_TermsInstructions_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtTermsDescription"));
		return element;
	}
	public static WebElement chkbx_TermsInstructions_SaveToPhrase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Terms"));
		return element;
	}
	public static WebElement drpdn_CostingType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_ddlCostingType"));
		return element;
	}
	public static WebElement txtbx_RFQReturnDate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtRFQReturnDate"));
		return element;
	}
	public static WebElement txtbx_RFQReturnTime()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_RadTimePicker1_dateInput_text"));
		return element;
	}
	public static WebElement txtbx_JobCompletionDate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtJobCompletionDate"));
		return element;
	}
	public static WebElement btn_Header_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1]/span[contains(text(),'Header')]]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_Footer_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1]/span[contains(text(),'Footer')]]/div[2]/a/img"));
		return element;
	}
	public static WebElement lnk_ArtworkUpload()
	{
		WebElement element = driver.findElement(By.linkText("Upload"));
		return element;
	}
	public static WebElement btn_Supplier1_Name_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier1']]]/div[2]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier1_Name()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier1']]]/div[2]/div/select"));
		return element;
	}
	public static WebElement btn_Supplier1_Contact_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier1']]]/div[3]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier1_Contact()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier1']]]/div[3]/div[2]/select"));
		return element;
	}
	public static WebElement btn_Supplier1_Delete()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier1']]]/div[3]/div[2]/div/img"));
		return element;
	}
	//----------------------------------------------------------------------------------------------------------------------//
	public static WebElement btn_Supplier2_Name_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier2']]]/div[2]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier2_Name()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier2']]]/div[2]/div/select"));
		return element;
	}
	public static WebElement btn_Supplier2_Contact_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier2']]]/div[3]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier2_Contact()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier2']]]/div[3]/div[2]/select"));
		return element;
	}
	public static WebElement btn_Supplier2_Delete()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier2']]]/div[3]/div[2]/div/img"));
		return element;
	}
	//----------------------------------------------------------------------------------------------------------------------//
	public static WebElement btn_Supplier3_Name_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier3']]]/div[2]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier3_Name()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier3']]]/div[2]/div/select"));
		return element;
	}
	public static WebElement btn_Supplier3_Contact_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier3']]]/div[3]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier3_Contact()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier3']]]/div[3]/div[2]/select"));
		return element;
	}
	public static WebElement btn_Supplier3_Delete()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier3']]]/div[3]/div[2]/div/img"));
		return element;
	}
	//----------------------------------------------------------------------------------------------------------------------//
	public static WebElement btn_Supplier4_Name_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier4']]]/div[2]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier4_Name()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier4']]]/div[2]/div/select"));
		return element;
	}
	public static WebElement btn_Supplier4_Contact_Add()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier4']]]/div[3]/div/img"));
		return element;
	}
	public static WebElement drpdn_Supplier4_Contact()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier4']]]/div[3]/div[2]/select"));
		return element;
	}
	public static WebElement btn_Supplier4_Delete()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Supplier4']]]/div[3]/div[2]/div/img"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_Button1"));
		return element;
	}
	public static WebElement btn_Next()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_btnSave"));
		return element;
	}
	public static WebElement btn_Print_Email()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_btn_Outwork_PrintEmail"));
		return element;
	}
	public static WebElement txtbx_SupplierQuote1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[1]/input[1]"));
		return element;
	}
	public static WebElement txtbx_SupplierQuote2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[1]/input[1]"));
		return element;
	}
	public static WebElement txtbx_SupplierQuote3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[1]/input[1]"));
		return element;
	}
	public static WebElement txtbx_SupplierQuote4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[1]/input[1]"));
		return element;
	}
	public static WebElement txt_Supplier1Name()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[2]"));
		return element;
	}
	public static WebElement txt_Supplier2Name()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[2]"));
		return element;
	}
	public static WebElement txt_Supplier3Name()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[2]"));
		return element;
	}
	public static WebElement txt_Supplier4Name()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[2]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Qty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Qty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Qty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Qty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Qty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Qty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Qty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Qty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Qty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Qty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Qty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Qty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Qty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Qty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Qty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Qty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[3]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Cost1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Cost2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Cost3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_Cost4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Cost1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Cost2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Cost3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_Cost4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Cost1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Cost2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Cost3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_Cost4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Cost1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Cost2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Cost3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[4]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_Cost4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[4]/input[1]"));
		return element;
	}
	public static WebElement drpdn_Supplier1_DeliveryIncl1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier1_DeliveryIncl2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier1_DeliveryIncl3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier1_DeliveryIncl4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_DeliveryIncl1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_DeliveryIncl2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_DeliveryIncl3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_DeliveryIncl4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_DeliveryIncl1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_DeliveryIncl2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_DeliveryIncl3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_DeliveryIncl4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_DeliveryIncl1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_DeliveryIncl2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_DeliveryIncl3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[5]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_DeliveryIncl4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[5]/select"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryDate1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryDate2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryDate3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryDate4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryDate1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryDate2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryDate3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryDate4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryDate1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryDate2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryDate3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryDate4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryDate1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryDate2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryDate3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryDate4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[6]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryCost1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryCost2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryCost3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_DeliveryCost4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryCost1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryCost2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryCost3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_DeliveryCost4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryCost1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryCost2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryCost3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_DeliveryCost4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryCost1()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryCost2()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryCost3()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[7]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_DeliveryCost4()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[7]/input"));
		return element;
	}
	public static WebElement drpdn_Supplier1_MarkupType1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier1_MarkupType2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier1_MarkupType3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier1_MarkupType4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_MarkupType1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_MarkupType2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_MarkupType3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier2_MarkupType4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_MarkupType1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_MarkupType2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_MarkupType3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier3_MarkupType4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_MarkupType1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_MarkupType2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_MarkupType3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[8]/select"));
		return element;
	}
	public static WebElement drpdn_Supplier4_MarkupType4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[8]/select"));
		return element;
	}
	public static WebElement txtbx_Supplier1_MarkupValue1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_MarkupValue2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_MarkupValue3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_MarkupValue4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_MarkupValue1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_MarkupValue2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_MarkupValue3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier2_MarkupValue4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_MarkupValue1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_MarkupValue2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_MarkupValue3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier3_MarkupValue4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_MarkupValue1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_MarkupValue2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_MarkupValue3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier4_MarkupValue4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[9]/input"));
		return element;
	}
	public static WebElement txtbx_Supplier1_TotalPrice1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_TotalPrice2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_TotalPrice3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier1_TotalPrice4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_TotalPrice1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_TotalPrice2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_TotalPrice3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier2_TotalPrice4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_TotalPrice1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_TotalPrice2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_TotalPrice3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier3_TotalPrice4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_TotalPrice1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_TotalPrice2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_TotalPrice3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[10]/input[1]"));
		return element;
	}
	public static WebElement txtbx_Supplier4_TotalPrice4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[10]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier1_SelectSupplierAndQty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[2]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier1_SelectSupplierAndQty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[5]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier1_SelectSupplierAndQty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[8]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier1_SelectSupplierAndQty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_1']/div[11]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier2_SelectSupplierAndQty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[2]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier2_SelectSupplierAndQty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[5]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier2_SelectSupplierAndQty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[8]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier2_SelectSupplierAndQty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_2']/div[11]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier3_SelectSupplierAndQty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[2]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier3_SelectSupplierAndQty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[5]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier3_SelectSupplierAndQty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[8]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier3_SelectSupplierAndQty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_3']/div[11]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier4_SelectSupplierAndQty1()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[2]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier4_SelectSupplierAndQty2()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[5]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier4_SelectSupplierAndQty3()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[8]/div[11]/input[1]"));
		return element;
	}
	public static WebElement chkbx_Supplier4_SelectSupplierAndQty4()
	{
		WebElement element = driver.findElement(By.xpath("//td/div[@id='divPriceComparision_ddlSupplier_4']/div[11]/div[11]/input[1]"));
		return element;
	}
	public static WebElement btn_Previous2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_Button11"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_Button12"));
		return element;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public static class EstimateSummary
	{
		public static WebElement txt_EstimateNumber()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
			return element;
		}
		public static WebElement btn_AddSubItem()
		{
			WebElement element = driver.findElement(By.xpath("//div/a/input[@value='Add Sub Item']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Sheet Fed Digital']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital_SingleItem()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[1]/div/ul/li/a/span[contains(text(),'Single Item')]"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital_Pads()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[1]/div/ul/li/a/span[contains(text(),'Pads')]"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Sheet Fed Offset']"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset_SingleItem()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[2]/div/ul/li/a/span[contains(text(),'Single Item')]"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset_Pads()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[2]/div/ul/li/a/span[contains(text(),'Pads')]"));
			return element;
		}
		public static WebElement lnk_LargeFormat()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Large Format']"));
			return element;
		}
		public static WebElement lnk_LargeFormat_Linear()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[3]/div/ul/li/a/span[contains(text(),'Linear')]"));
			return element;
		}
		public static WebElement lnk_LargeFormat_SquareMeter()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[3]/div/ul/li/a/span[contains(text(),'Square Meter')]"));
			return element;
		}
		public static WebElement lnk_ProductCatalogue()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Product Catalogue']"));
			return element;
		}
		public static WebElement lnk_Outwork()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Outwork']"));
			return element;
		}
		public static WebElement lnk_OtherCosts()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Other Costs']"));
			return element;
		}
		public static WebElement btn_Action()
		{
			WebElement element = driver.findElement(By.xpath("//div/div/a/input[@value='Action']"));
			return element;
		}
		public static WebElement lnk_ReRun_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']"));
			return element;
		}
		public static WebElement lnk_Copy_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Copy Item']"));
			return element;
		}
		public static WebElement lnk_Delete_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Delete Item']"));
			return element;
		}
		public static WebElement txt_ItemTitle()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'Item Title')]]]/td/div/label"));
			return element;
		}
		
		private static String SupplierName="Supplier Name";
		public static WebElement txt_SupplierName1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SupplierName+"')]]]/td[2]/span/b"));
			return element;
		}
		public static WebElement txt_SupplierName2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SupplierName+"')]]]/td[3]/span/b"));
			return element;
		}
		public static WebElement txt_SupplierName3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SupplierName+"')]]]/td[4]/span/b"));
			return element;
		}
		public static WebElement txt_SupplierName4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SupplierName+"')]]]/td[5]/span/b"));
			return element;
		}
		
		private static String SuppQuote="Supp. Quote#";
		public static WebElement txt_SupplierQuote1() // NO_UCD (unused code)
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SuppQuote+"')]]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_SupplierQuote2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SuppQuote+"')]]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_SupplierQuote3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SuppQuote+"')]]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_SupplierQuote4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+SuppQuote+"')]]]/td[5]/span"));
			return element;
		}
		
		private static String Qty = "Quantity";
		public static WebElement txt_SupplierQty1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+Qty+"')]]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_SupplierQty2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+Qty+"')]]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_SupplierQty3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+Qty+"')]]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_SupplierQty4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'"+Qty+"')]]]/td[5]/span"));
			return element;
		}
		
		private static String Price="Price";
		public static WebElement txt_Price1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Price+"']]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_Price2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Price+"']]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_Price3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Price+"']]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_Price4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Price+"']]]/td[5]/span"));
			return element;
		}
		
		private static String CostPriceExcMarkup = "Cost Price (ex. Markup)";
		public static WebElement txt_CostPriceExcMarkup1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceExcMarkup+"']]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_CostPriceExcMarkup2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceExcMarkup+"']]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_CostPriceExcMarkup3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceExcMarkup+"']]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_CostPriceExcMarkup4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceExcMarkup+"']]]/td[5]/span"));
			return element;
		}
	
		private static String Markup = "Markup";
		public static WebElement txt_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Markup+"']]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Markup+"']]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Markup+"']]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+Markup+"']]]/td[5]/span"));
			return element;
		}
		
		private static String CostPriceIncMarkup = "Cost Price (inc. Markup)";
		public static WebElement txt_CostPriceIncMarkup1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceIncMarkup+"']]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceIncMarkup+"']]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceIncMarkup+"']]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+CostPriceIncMarkup+"']]]/td[5]/span"));
			return element;
		}
		
		private static String ProfitMarginPercentage  = "Profit Margin (%) ";
		public static WebElement txtbx_ProfitMarginPercentage1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPercentage+"']]]/td[2]/input"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPercentage+"']]]/td[3]/input"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPercentage+"']]]/td[4]/input"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPercentage+"']]]/td[5]/input"));
			return element;
		}
	
		private static String ProfitMarginPrice  = "Profit Margin ($)";
		public static WebElement txtbx_ProfitMarginPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPrice+"']]]/td[2]/input"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPrice+"']]]/td[3]/input"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPrice+"']]]/td[4]/input"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+ProfitMarginPrice+"']]]/td[5]/input"));
			return element;
		}
		
		private static String SubTotal  = "Sub Total";
		public static WebElement txtbx_SubTotal1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[b[text()='"+SubTotal+"']]]]/td[2]/input"));
			return element;
		}
		public static WebElement txtbx_SubTotal2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[b[text()='"+SubTotal+"']]]]/td[3]/input"));
			return element;
		}
		public static WebElement txtbx_SubTotal3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[b[text()='"+SubTotal+"']]]]/td[4]/input"));
			return element;
		}
		public static WebElement txtbx_SubTotal4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[b[text()='"+SubTotal+"']]]]/td[5]/input"));
			return element;
		}
		
		
		public static WebElement drpdn_Tax()
		{
			WebElement element = driver.findElement(By.xpath("//td[1][div[contains(text(),'Tax')]]/div/div/select"));
			return element;
		}
		public static WebElement txt_TaxValue1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[@id='trTax'][td[1][div[div[select]]]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_TaxValue2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[@id='trTax'][td[1][div[div[select]]]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_TaxValue3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[@id='trTax'][td[1][div[div[select]]]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_TaxValue4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[@id='trTax'][td[1][div[div[select]]]]/td[5]/span"));
			return element;
		}
		
		private static String SellingPriceIncTax = "Selling Price (inc. Tax)";
		public static WebElement txt_SellingPriceIncTax1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+SellingPriceIncTax+"']]]/td[2]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+SellingPriceIncTax+"']]]/td[3]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+SellingPriceIncTax+"']]]/td[4]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+SellingPriceIncTax+"']]]/td[5]/span"));
			return element;
		}
		
		private static String GrossProfit = "Gross Profit";
		public static WebElement txt_GrossProfitPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[2]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[3]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[4]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[5]/div[1]/span"));
			return element;
		}
		
		public static WebElement txt_GrossProfitPercentage1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[2]/div[3]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[3]/div[3]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage3()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[4]/div[3]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage4()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[text()='"+GrossProfit+"']]]/td[5]/div[3]/span"));
			return element;
		}
		
		
		
		
		
	}
//	need to continue from here for estimate summary page
}
