package com.eprint.pageObjects.Settings.Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class SystemMarkupPage extends SuperTestNG
{
	public static WebElement txtbx_PaperStock()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPaper"));
		return element;
	}
	public static WebElement txtbx_Outwork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPrintBroker"));
		return element;
	}
	public static WebElement txtbx_Inks()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInks"));
		return element;
	}
	public static WebElement txtbx_InventoryItems()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInventoryItems"));
		return element;
	}
	public static WebElement txtbx_OtherCosts()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtOtherCosts"));
		return element;
	}
	public static WebElement btn_DefaultProfitMargin()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgShowMarkup"));
		return element;
	}
	public static WebElement drpdn_DefaultProfitMargin()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMarkup"));
		return element;
	}
	public static WebElement drpdn_DefaultTaxCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlTax"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnsave"));
		return element;
	}
}
