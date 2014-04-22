package com.eprint.pageObjects.Settings.Appearance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CustomizeTabDisplayPage extends SuperTestNG
{
	public static WebElement chkbx_CRM()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl06_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Estimates()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl08_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Jobs()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Purchases()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl12_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_DeliveryNote()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl14_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Invoices()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl16_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Inventory()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl18_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Reports()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl20_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_Settings()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl22_chkDisplay"));
		return element;
	}
	public static WebElement chkbx_ProductCatalogue()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl24_chkDisplay"));
		return element;
	}
	public static WebElement txtbx_CRM()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl06_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Estimates()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl08_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Jobs()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Purchases()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl12_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_DeliveryNote()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl14_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Invoices()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl16_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Inventory()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl18_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Reports()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl20_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_Settings()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl22_txtScreenName"));
		return element;
	}
	public static WebElement txtbx_ProductCatalogue()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl24_txtScreenName"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnsave"));
		return element;
	}
}
