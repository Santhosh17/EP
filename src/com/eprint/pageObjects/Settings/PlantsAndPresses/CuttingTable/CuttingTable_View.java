package com.eprint.pageObjects.Settings.PlantsAndPresses.CuttingTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CuttingTable_View extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord() 
	{
		WebElement element = driver.findElement(By.linkText("Add New Record"));
		return element;
	}
	public static WebElement txtbx_Description() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtDescription"));
		return element;
	}
	public static WebElement txt_SuccessMsg() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_lblMessage"));
		return element;
	}
}