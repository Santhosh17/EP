package com.eprint.pageObjects.Settings.Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class RegionalSettingsPage extends SuperTestNG
{
	public static WebElement drpdn_Language()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlLanguage"));
		return element;
	}
	public static WebElement drpdn_DateFormat()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlDateFormat"));
		return element;
	}
	public static WebElement txtbx_Colour()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColour"));
		return element;
	}
	public static WebElement txtbx_Organisation()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtOrganisation"));
		return element;
	}
	public static WebElement txtbx_State()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtState"));
		return element;
	}
	public static WebElement txtbx_Centre()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCentre"));
		return element;
	}
	public static WebElement txtbx_ZipCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPostcode"));
		return element;
	}
	public static WebElement txtbx_Metre()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMetre"));
		return element;
	}
	public static WebElement txtbx_PaperWeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWeight"));
		return element;
	}
	public static WebElement txtbx_GeneralWeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGeneralWeight"));
		return element;
	}
	public static WebElement drpdn_PaperStockMeasure()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPaperMeasure"));
		return element;
	}
	public static WebElement txtbx_PageTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPageTitle"));
		return element;
	}
	public static WebElement txtbx_CompanyTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompany"));
		return element;
	}
	public static WebElement drpdn_TimeZone()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlTimeZone"));
		return element;
	}
	public static WebElement chkbx_CostCentreEnabled()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkCostCentreDisplay"));
		return element;
	}
	public static WebElement drpdn_FiscalYearFrom()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlFromMonth"));
		return element;
	}
	public static WebElement drpdn_FiscalYearTo()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlToMonth"));
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
	public static WebElement txt_Success()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_lblMessage"));
		return element;
	}
}
