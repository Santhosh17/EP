package com.eprint.pageObjects.Settings.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class PaperStockSizesPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement txtbx_Name()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_txtPaperSizeName_text"));
		return element;
	}
	public static WebElement txtbx_Width()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_tbTaxRate_text"));
		return element;
	}
	public static WebElement txtbx_Height()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl03_RadNumericTextBox1_text"));
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
