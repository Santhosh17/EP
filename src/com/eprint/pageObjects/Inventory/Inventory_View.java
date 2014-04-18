package com.eprint.pageObjects.Inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Inventory_View extends SuperTestNG
{
	public static WebElement txt_SuccessMsg()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_InventoryStoreCustomerView2_ctl02_lblMessage"));
		return element;
	}
}
