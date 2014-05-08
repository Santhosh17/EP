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
	need to continue from here
}
