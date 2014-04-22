package com.eprint.pageObjects.Settings.Appearance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CustomizeTabColorPage extends SuperTestNG
{
	public static WebElement txtbx_HomeTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_HOME"));
		return element;
	}
	public static WebElement txtbx_HomeTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4907"));
		return element;
	}
	public static WebElement txtbx_CRMTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_CLIENTS"));
		return element;
	}
	public static WebElement txtbx_CRMTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4908"));
		return element;
	}
	public static WebElement txtbx_EstimatesTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ESTIMATES"));
		return element;
	}
	public static WebElement txtbx_EstimatesTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4909"));
		return element;
	}
	public static WebElement txtbx_JobsTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_JOBS"));
		return element;
	}
	public static WebElement txtbx_JobsTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4910"));
		return element;
	}
	public static WebElement txtbx_PurchasesTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PURCHASES"));
		return element;
	}
	public static WebElement txtbx_PurchasesTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4911"));
		return element;
	}
	public static WebElement txtbx_DeliveryNotesTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_DELIVERYNOTE"));
		return element;
	}
	public static WebElement txtbx_DeliveryNotesTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4917"));
		return element;
	}
	public static WebElement txtbx_InvoicesTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_INVOICES"));
		return element;
	}
	public static WebElement txtbx_InvoicesTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4912"));
		return element;
	}
	public static WebElement txtbx_InventoriesTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_WAREHOUSE"));
		return element;
	}
	public static WebElement txtbx_InventoriesTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4913"));
		return element;
	}
	public static WebElement txtbx_ReportsTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_REPORTS"));
		return element;
	}
	public static WebElement txtbx_ReportsTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4915"));
		return element;
	}
	public static WebElement txtbx_SettingsTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_SETTINGS"));
		return element;
	}
	public static WebElement txtbx_SettingsTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4916"));
		return element;
	}
	public static WebElement txtbx_ProductsTabColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PRODUCTCATALOGUE"));
		return element;
	}
	public static WebElement txtbx_ProductsTextColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_4919"));
		return element;
	}
	public static WebElement btn_RestoreDefault()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button3"));
		return element;
	}
	public static WebElement btn_Update()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button1"));
		return element;
	}
	
}
