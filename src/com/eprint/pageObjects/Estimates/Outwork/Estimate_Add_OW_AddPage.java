package com.eprint.pageObjects.Estimates.Outwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_OW_AddPage extends SuperTestNG
{
	public static WebElement txtbx_EstimateTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtjobtitle"));
		return element;
	}
	public static WebElement txtbx_Quantity1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty1"));
		return element;
	}
	public static WebElement txtbx_Quantity2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty2"));
		return element;
	}
	public static WebElement txtbx_Quantity3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty3"));
		return element;
	}
	public static WebElement txtbx_Quantity4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtMultiQty4"));
		return element;
	}
	public static WebElement chkbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutItemTitle"));
		return element;
	}
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtTitle"));
		return element;
	}
	public static WebElement btn_ItemTitleAdd()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[2][input[@id='ctl00_ContentPlaceHolder1_divprintbroker_txtTitle']]]/div[3]/input"));
		return element;
	}
	public static WebElement txtbx_ItemTitle_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtTitleDescription"));
		return element;
	}
	public static WebElement chkbx_ItemTitle_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chk_broker_Phrase_Title"));
		return element;
	}
	
	
	
	
	public static WebElement chkbx_ItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_chkOutDescription"));
		return element;
	}
	public static WebElement txtbx_ItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_divprintbroker_txtOrigination"));
		return element;
	}
	
}
