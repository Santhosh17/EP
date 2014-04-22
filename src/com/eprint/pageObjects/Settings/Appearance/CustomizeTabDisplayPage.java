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
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Purchases()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl12_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
//	public static WebElement chkbx_Jobs()
//	{
//		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdScreenName_ctl00_ctl10_chkDisplay"));
//		return element;
//	}
}
