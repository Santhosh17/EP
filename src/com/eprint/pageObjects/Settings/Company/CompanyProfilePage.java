package com.eprint.pageObjects.Settings.Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CompanyProfilePage extends SuperTestNG
{
	public static WebElement txtbx_CompanyName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyName"));
		return element;
	}
	public static WebElement txtbx_CompanyAddressLine1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyAddress1"));
		return element;
	}
	public static WebElement txtbx_CompanyAddressLine2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyAddress2"));
		return element;
	}
	public static WebElement txtbx_CompanyAddressLine3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyAddress3"));
		return element;
	}
	public static WebElement txtbx_CompanyAddressLine4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyPostalCode"));
		return element;
	}
	public static WebElement drpdn_CompanyCountry()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCompanyCountry"));
		return element;
	}
	public static WebElement txtbx_CompanyTelephone()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyPhone"));
		return element;
	}
	public static WebElement txtbx_CompanyFax()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyFax"));
		return element;
	}
	public static WebElement txtbx_CompanyEmail()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyEmail"));
		return element;
	}
	public static WebElement txtbx_CompanyURL()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyurl"));
		return element;
	}
	public static WebElement txtbx_CompanyNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyNumber"));
		return element;
	}
	public static WebElement txtbx_TaxNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTaxNumber"));
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
