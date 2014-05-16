package com.eprint.pageObjects.Purchases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Purchase_Add_Page extends SuperTestNG
{
	public static WebElement btn_Supplier()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImgSupplierAdd"));
		return element;
	}
	public static WebElement txtbx_Supplier()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSupplier"));
		return element;
	}
	public static WebElement btn_Contact()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnContact"));
		return element;
	}
	public static WebElement drpdn_Contact()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlcontact"));
		return element;
	}
	public static WebElement btn_ContactAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ingbtnAddress"));
		return element;
	}
	public static WebElement btn_DeliveryTo()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton2"));
		return element;
	}
	public static WebElement btn_CommentDeliveryInstructions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnDelivery_Instructions"));
		return element;
	}
	public static WebElement txtbx_CommentDeliveryInstructions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtComments"));
		return element;
	}
	public static WebElement btn_Header()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnheader"));
		return element;
	}
	public static WebElement btn_Footer()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton6"));
		return element;
	}
	public static WebElement drpdn_Status()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlStatus"));
		return element;
	}
	public static WebElement drpdn_RaisedBy()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlRaisedBy"));
		return element;
	}
	public static WebElement txtbx_Date()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDate"));
		return element;
	}
	public static WebElement drpdn_CarrierInformation()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCourierInfo"));
		return element;
	}
	public static WebElement btn_CarrierInformation()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_img_CourierInfo"));
		return element;
	}
	public static WebElement txtbx_RefNo()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRefNo"));
		return element;
	}
	public static WebElement txtbx_SuppQuote()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSuppQuote"));
		return element;
	}
	public static WebElement txtbx_SupplierInvoice()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSuppInv"));
		return element;
	}
	public static WebElement txtbx_SupplierInvoiceDate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSuppInvDate"));
		return element;
	}
	public static WebElement txtbx_DeliveryDate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtReqDate"));
		return element;
	}
	public static WebElement chkbx_InvoiceReceived()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkInvoiceReceived"));
		return element;
	}
	public static WebElement chkbx_CreateAFollowUpTask()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chk_FollowupTask"));
		return element;
	}
	public static WebElement btn_Add()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button1"));
		return element;
	}
	public static WebElement btn_Delete()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button2"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
		return element;
	}
	public static WebElement btn_SaveAndStay()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button3"));
		return element;
	}
}
