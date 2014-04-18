package com.eprint.pageObjects.Settings.PlantsAndPresses.CuttingTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CuttingTable_Add extends SuperTestNG
{
	public static WebElement txtbx_Name() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName"));
		return element;
	}
	public static WebElement txtbx_Description() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtDescription"));
		return element;
	}
	public static WebElement txtbx_MinSheetSizeHeight() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight"));
		return element;
	}
	public static WebElement txtbx_MinSheetSizeWidth() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth"));
		return element;
	}
	public static WebElement txtbx_MaxSheetSizeHeight() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight"));
		return element;
	}
	public static WebElement txtbx_MaxSheetSizeWidth() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth"));
		return element;
	}
	public static WebElement txtbx_MaxSheetWeight() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight"));
		return element;
	}
	public static WebElement txtbx_SetupChargePrice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge"));
		return element;
	}
	public static WebElement txtbx_CostPerCutPrice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtCostperCut"));
		return element;
	}
	public static WebElement txtbx_MinRunningCharge() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge"));
		return element;
	}
	public static WebElement txtbx_MarkupPercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_txtMarkUp"));
		return element;
	}
	public static WebElement drpdn_NumOfCutsPerItem() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_ddlItemCut"));
		return element;
	}
	public static WebElement btn_Cancel() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_btnDigitalPressCancel"));
		return element;
	}
	public static WebElement btn_Save() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_btnGuillotineAdd"));
		return element;
	}
}
