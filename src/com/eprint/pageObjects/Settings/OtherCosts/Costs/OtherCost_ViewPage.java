package com.eprint.pageObjects.Settings.OtherCosts.Costs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class OtherCost_ViewPage extends SuperTestNG
{
	public static WebElement drpdn_FilterByCategory() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCategorySelect"));
		return element;
	}
	public static WebElement lnk_AddNewRecord() 
	{
		WebElement element = driver.findElement(By.linkText("Add New Record"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridOtherCost_ctl00_ctl02_ctl00_btnclrFilters"));
		return element;
	}
	public static WebElement chkbx_CheckAll() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridOtherCost_ctl00_ctl02_ctl02_checkAll"));
		return element;
	}
	public static WebElement drpdn_Options() 
	{
		WebElement element = driver.findElement(By.id("img_actionsShow"));
		return element;
	}
	public static WebElement chkbx_DeleteSelected() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnDelete"));
		return element;
	}
	public static WebElement btn_FirstPage() 
	{
		WebElement element = driver.findElement(By.id("rgPageFirst"));
		return element;
	}
	public static WebElement btn_PreviousPage() 
	{
		WebElement element = driver.findElement(By.id("rgPagePrev"));
		return element;
	}
	public static WebElement btn_NextPage() 
	{
		WebElement element = driver.findElement(By.id("rgPageNext"));
		return element;
	}
	public static WebElement btn_LastPage() 
	{
		WebElement element = driver.findElement(By.id("rgPageLast"));
		return element;
	}
	public static WebElement drpdn_PageSize() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridOtherCost_ctl00_ctl03_ctl01_PageSizeComboBox_Input"));
		return element;
	}
	public static WebElement txt_SuccessMsg() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_lblMessage"));
		return element;
	}
}
