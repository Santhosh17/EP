package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class AddressLabelsPage extends SuperTestNG
{
	public static WebElement txtbx_Address1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl04_txtAddressValue"));
		return element;
	}
	public static WebElement chkbx_Address1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl04_chkRequired"));
		return element;
	}
	public static WebElement txtbx_Address2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl06_txtAddressValue"));
		return element;
	}
	public static WebElement chkbx_Address2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl06_chkRequired"));
		return element;
	}
	public static WebElement txtbx_Address3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl08_txtAddressValue"));
		return element;
	}
	public static WebElement chkbx_Address3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl08_chkRequired"));
		return element;
	}
	public static WebElement txtbx_Address4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl10_txtAddressValue"));
		return element;
	}
	public static WebElement chkbx_Address4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl10_chkRequired"));
		return element;
	}
	public static WebElement txtbx_Address5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl12_txtAddressValue"));
		return element;
	}
	public static WebElement chkbx_Address5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridAddressLabel_ctl00_ctl12_chkRequired"));
		return element;
	}
	public static WebElement btn_Update()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnUpdate"));
		return element;
	}
}
