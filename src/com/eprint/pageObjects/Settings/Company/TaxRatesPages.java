package com.eprint.pageObjects.Settings.Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class TaxRatesPages extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.linkText("Add New Record"));
		return element;
	}
	public static WebElement drpdn_DropDown_Delete()
	{
		WebElement element = driver.findElement(By.id("img_actionsShow"));
		return element;
	}
	public static WebElement lnk_Delete()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkDeleteTax"));
		return element;
	}
	public static WebElement chkbx_CheckAll()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl02_checkAll"));
		return element;
	}
	public static WebElement txtbx_TaxName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_txtTaxName_text"));
		return element;
	}
	public static WebElement txtbx_TaxRate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_tbTaxRate_text"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_btnCancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_RadButton1"));
		return element;
	}
	public static WebElement txt_SuccessMsg()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_lblMessage"));
		return element;
	}
}
