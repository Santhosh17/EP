package com.eprint.pageObjects.Settings.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class NumberingSystemPage extends SuperTestNG
{
	public static WebElement rb_Auto()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rbauto"));
		return element;
	}
	public static WebElement rb_Custom()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButton1"));
		return element;
	}
	public static WebElement rb_SetThisAsStringvalueforEstimateJobsPurchasesInvoicesAndDelivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButton2"));
		return element;
	}
	public static WebElement txtbx_SetThisAsStringvalueforEstimateJobsPurchasesInvoicesAndDelivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox1"));
		return element;
	}
	public static WebElement rb_SetTheStartingValueForIndividuals()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButton3"));
		return element;
	}
	public static WebElement txtbx_Estimates()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtestimate"));
		return element;
	}
	public static WebElement txtbx_Jobs()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtjobs"));
		return element;
	}
	public static WebElement txtbx_Purchases()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtpurchases"));
		return element;
	}
	public static WebElement txtbx_Invoices()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtinvoices"));
		return element;
	}
	public static WebElement txtbx_Delivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtdelivery"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_cancel"));
		return element;
	}
	public static WebElement btn_SaveAndLock()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_save"));
		return element;
	}
	
}
