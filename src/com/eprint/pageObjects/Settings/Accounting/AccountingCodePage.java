package com.eprint.pageObjects.Settings.Accounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class AccountingCodePage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl00_btnclrFilters"));
		return element;
	}
	public static WebElement txtbx_AccountingCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_txtAccountingCode"));
		return element;
	}
	public static WebElement txtbx_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_txtDescription"));
		return element;
	}
	public static WebElement chkbx_RevenueCodes()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_chkRevenuCode"));
		return element;
	}
	public static WebElement chkbx_RevenueCodesDefault()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_chkDefault"));
		return element;
	}
	public static WebElement chkbx_PurchaseCodes()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_chkPurchaseCode"));
		return element;
	}
	public static WebElement chkbx_PurchaseCodesDefault()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_chkPurchaseDefault"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_btnCancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_gridAccountingCodes_ctl00_ctl02_ctl04_btnSave"));
		return element;
	}
}
