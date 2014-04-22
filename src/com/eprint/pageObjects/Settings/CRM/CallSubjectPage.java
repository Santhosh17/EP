package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CallSubjectPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl00_btnclrFilters"));
		return element;
	}
	public static WebElement txtbx_CallSubject()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_txtStautsTitle"));
		return element;
	}
	public static WebElement chkbx_Default()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_chkDefault"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_RadButton8"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_RadButton1"));
		return element;
	}
	
}
