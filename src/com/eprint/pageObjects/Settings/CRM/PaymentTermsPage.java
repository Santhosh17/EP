package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class PaymentTermsPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Rad_PaymentTerms_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement txtbx_PaymentName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Rad_PaymentTerms_ctl00_ctl02_ctl03_txt_PaymentName"));
		return element;
	}
	public static WebElement txtbx_PaymentDays()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Rad_PaymentTerms_ctl00_ctl02_ctl03_txt_PaymentDays"));
		return element;
	}
	public static WebElement chkbx_Default()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Rad_PaymentTerms_ctl00_ctl02_ctl03_chkDefault"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Rad_PaymentTerms_ctl00_ctl02_ctl03_btn_Cancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Rad_PaymentTerms_ctl00_ctl02_ctl03_btn_Save"));
		return element;
	}
}
