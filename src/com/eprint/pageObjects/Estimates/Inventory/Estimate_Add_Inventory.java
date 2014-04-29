package com.eprint.pageObjects.Estimates.Inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_Inventory extends SuperTestNG
{
	public static WebElement btn_AddNewInventory() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_GridViewInv_ctl00_ctl02_ctl00_btnAddNewRecord"));
		return element;
	}
	public static WebElement lnk_ClickOnInventoryRecord(String RecordName) 
	{
		WebElement element = driver.findElement(By.xpath("//tbody/tr/td/div/a[text()='"+RecordName+"']"));
		return element;
	}
	public static WebElement txtbx_QtyRequired()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_txtWarehouseQuantity"));
		return element;
	}
	public static WebElement chkbx_UpdateItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_Chk_ItemDescn"));
		return element;
	}
	public static WebElement btn_Add()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_Button6"));
		return element;
	}
	public static WebElement btn_PopupClose()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_ImageButton2"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_btnprevious"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_Button3"));
		return element;
	}
	public static WebElement lnk_ShowWareHouseItems()
	{
		WebElement element = driver.findElement(By.id("href_showware_MainItem"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCWare_GridViewInv_ctl00_ctl02_ctl00_btnclrFilters"));
		return element;
	}
}
