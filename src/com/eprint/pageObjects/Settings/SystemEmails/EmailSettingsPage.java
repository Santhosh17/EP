package com.eprint.pageObjects.Settings.SystemEmails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class EmailSettingsPage extends SuperTestNG
{
	public static WebElement txtbx_FromEmailName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_fromemail"));
		return element;
	}
	public static WebElement rb_SendAllEmailsFromEprint()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdbFromEprint"));
		return element;
	}
	public static WebElement chkbx_CC()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_cc"));
		return element;
	}
	public static WebElement txtbx_CC()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_cc"));
		return element;
	}
	public static WebElement chkbx_BCC()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_bcc"));
		return element;
	}
	public static WebElement txtbx_BCC()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_bcc"));
		return element;
	}
	public static WebElement chkbx_AttachAsAttachment_Supplier()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_SupplierRFQ"));
		return element;
	}
	public static WebElement chkbx_AttachAsLink_Supplier()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_SuplrAttachLink"));
		return element;
	}
	public static WebElement chkbx_AttachAsAttachment_Purchase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_Purchase"));
		return element;
	}
	public static WebElement chkbx_AttachAsLink_Purchase()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_POAttachLink"));
		return element;
	}
	public static WebElement chkbx_AttachDeliveryNote()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Chk_AttachDeliveryNote"));
		return element;
	}
	public static WebElement rb_SendAllEmailsViaYourPreferredLocalEmailClient()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdbFromOthers"));
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
}
