package com.eprint.pageObjects.Settings.ProcessFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CustomizeJobViewColorPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdcolorSetting_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement drpdn_DeliveryDates() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdcolorSetting_ctl00_ctl02_ctl02_ddlDeliveryDate"));
		return element;
	}
	public static WebElement txtbx_Days() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdcolorSetting_ctl00_ctl02_ctl02_tbDays"));
		return element;
	}
	public static WebElement btn_Cancel() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdcolorSetting_ctl00_ctl02_ctl02_btnCancel"));
		return element;
	}
	public static WebElement btn_Save() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdcolorSetting_ctl00_ctl02_ctl02_btnSave"));
		return element;
	}
}
