package com.eprint.pageObjects.Estimates.ProductCatalogue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_PC_AddPage extends SuperTestNG
{
	public static WebElement drpdn_ShowProducts()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_ddlCategoryBind"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_btnclrFilters"));
		return element;
	}
	public static WebElement txtbx_CategoryName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_PriceCatalogueCategoryName"));
		return element;
	}
	public static WebElement btn_CategoryFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_PriceCatalogueCategoryName"));
		return element;
	}
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_CatalogueName"));
		return element;
	}
	public static WebElement btn_ItemTitleFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_CatalogueName"));
		return element;
	}
	public static WebElement txtbx_ItemCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_ItemCode"));
		return element;
	}
	public static WebElement btn_ItemCodeFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_ItemCode"));
		return element;
	}
}