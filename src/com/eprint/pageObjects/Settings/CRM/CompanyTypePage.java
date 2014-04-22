package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CompanyTypePage extends SuperTestNG
{ 
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGridCompanyType_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement txtbx_CompanyType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGridCompanyType_ctl00_ctl02_ctl03_txtcompanyType"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGridCompanyType_ctl00_ctl02_ctl03_btnCancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGridCompanyType_ctl00_ctl02_ctl03_btnSave"));
		return element;
	}
}
