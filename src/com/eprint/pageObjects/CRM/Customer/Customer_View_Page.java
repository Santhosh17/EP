package com.eprint.pageObjects.CRM.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Customer_View_Page extends SuperTestNG
{
	public static WebElement lnk_EditView()
	{
		WebElement element = driver.findElement(By.partialLinkText("Edit View"));
		return element;
	}
	public static WebElement lnk_Change()
	{
		WebElement element = driver.findElement(By.id("spn_change"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnclrFilters"));
		return element;
	}
}
