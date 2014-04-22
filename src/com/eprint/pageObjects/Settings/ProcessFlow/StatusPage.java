package com.eprint.pageObjects.Settings.ProcessFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class StatusPage extends SuperTestNG
{
	public static WebElement btn_SaveOrder() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnUpDown"));
		return element;
	}
	public static WebElement lnk_AddNewRecord() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement txtbx_StatusTitle() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_txtStatus"));
		return element;
	}
	public static WebElement txtbx_FriendlyNameForEStore() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_txt_UserFriendlyName"));
		return element;
	}
	public static WebElement txtbx_ProbabilityPercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_txtProbability"));
		return element;
	}
	public static WebElement chkbx_Estimate() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_modname_0"));
		return element;
	}
	public static WebElement chkbx_EstimateDefault() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_default_0"));
		return element;
	}
	public static WebElement chkbx_Job() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_modname_1"));
		return element;
	}
	public static WebElement chkbx_JobDefault() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_default_1"));
		return element;
	}
	public static WebElement chkbx_Invoice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_modname_2"));
		return element;
	}
	public static WebElement chkbx_InvoiceDefault() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_default_2"));
		return element;
	}
	public static WebElement chkbx_Purchase() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_modname_3"));
		return element;
	}
	public static WebElement chkbx_PurchaseDefault() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_default_3"));
		return element;
	}
	public static WebElement chkbx_Delivery() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_modname_4"));
		return element;
	}
	public static WebElement chkbx_DeliveryDefault() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_chk_default_4"));
		return element;
	}
	public static WebElement btn_Cancel() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_RadButton8"));
		return element;
	}
	public static WebElement btn_Save() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridStatus_ctl00_ctl02_ctl03_RadButton1"));
		return element;
	}
	
}
