package com.eprint.pageObjects.Settings.OtherCosts.Category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class OtherCostCategoryViewPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl00_btnclrFilters"));
		return element;
	}
	public static WebElement drpdn_Options() 
	{
		WebElement element = driver.findElement(By.id("img_actionsShow"));
		return element;
	}
	public static WebElement chkbx_CheckAll() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl02_checkAll"));
		return element;
	}
	public static WebElement btn_DeleteSelected() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnDelete"));
		return element;
	}
	public static WebElement btn_FirstPage() 
	{
		WebElement element = driver.findElement(By.className("rgPageFirst"));
		return element;
	}
	public static WebElement btn_PreviousPage() 
	{
		WebElement element = driver.findElement(By.className("rgPagePrev"));
		return element;
	}
	public static WebElement btn_NextPage() 
	{
		WebElement element = driver.findElement(By.className("rgPageNext"));
		return element;
	}
	public static WebElement btn_LastPage() 
	{
		WebElement element = driver.findElement(By.className("rgPageLast"));
		return element;
	}
	public static WebElement drpdn_PageSize() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl03_ctl01_PageSizeComboBox_Input"));
		return element;
	}
	public static class AddNewRecord
	{
		public static WebElement txtbx_Name() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_txtCategoryName_text"));
			return element;
		}
		public static WebElement drpdn_JobCardCategory() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_ddlJobcardCategory"));
			return element;
		}
		public static WebElement btn_Cancel() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_btnCancel"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_btnSave"));
			return element;
		}
	}
}