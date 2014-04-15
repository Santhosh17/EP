package com.eprint.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class MainPage extends SuperTestNG
{
	public static WebElement icn_Reports()
	{
		WebElement element = driver.findElement(By.id("imgreports"));
		return element;
	}
	public static WebElement icn_Settings()
	{
		WebElement element = driver.findElement(By.id("settingimg"));
		return element;
	}
	public static WebElement icn_UserProfile()
	{
		WebElement element = driver.findElement(By.id("imgprofile"));
		return element;
	}
	public static WebElement lnk_EprintMIS() 
	{
		WebElement element = driver.findElement(By.partialLinkText("ePrint MIS"));
		return element;
	}
	public static WebElement lnk_Estore()
	{
		WebElement element = driver.findElement(By.partialLinkText("ePrint eStore"));
		return element;
	}
	public static WebElement lnk_Logout()
	{
		WebElement element = driver.findElement(By.id("ctl00_header1_btnSignput"));
		return element;
	}
	public static WebElement drpdn_CRM()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='CRM']"));
		return element;
	}
	public static WebElement drpdn_Estimates()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Estimates']"));
		return element;
	}
	public static WebElement drpdn_Quotes()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Quotes']"));
		return element;
	}
	public static WebElement drpdn_Jobs()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Jobs']"));
		return element;
	}
	public static WebElement drpdn_Purchases()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Purchases']"));
		return element;
	}
	public static WebElement drpdn_DeliveryNote()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Delivery Note']"));
		return element;
	}
	public static WebElement drpdn_Invoices()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Invoices']"));
		return element;
	}
	public static WebElement drpdn_Inventory()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Inventory']"));
		return element;
	}
	public static WebElement drpdn_Products()
	{
		WebElement element = driver.findElement(By.xpath("//span[text()='Products']"));
		return element;
	}
	public static WebElement btn_SaveCurrentLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSavesettings"));
		return element;
	}
	public static WebElement drpdn_Search()
	{
		WebElement element = driver.findElement(By.id("ctl00_header1_ddl_Search_Arrow"));
		return element;
	}
	
}
