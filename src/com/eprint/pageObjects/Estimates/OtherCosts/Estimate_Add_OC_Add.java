package com.eprint.pageObjects.Estimates.OtherCosts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_OC_Add extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txt_ItemTitle"));
		return element;
	}
	public static WebElement txtbx_FinishedQty1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity1"));
		return element;
	}
	public static WebElement txtbx_FinishedQty2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity2"));
		return element;
	}
	public static WebElement txtbx_FinishedQty3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity3"));
		return element;
	}
	public static WebElement txtbx_FinishedQty4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity4"));
		return element;
	}
	public static WebElement tab_BusCard()
	{
		WebElement element = driver.findElement(By.id("spncost_0"));
		return element;
	}
	public static WebElement tab_All()
	{
		WebElement element = driver.findElement(By.id("spncost_1"));
		return element;
	}
	public static WebElement lnk_ClickOnRecord(String OtherCostRecordName)
	{
		WebElement element = driver.findElement(By.xpath("//div[1]/a[contains(text(),'"+OtherCostRecordName+"')]"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btncostcentrePrevious"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btncostcentre"));
		return element;
	}
	need to continue from here

}
