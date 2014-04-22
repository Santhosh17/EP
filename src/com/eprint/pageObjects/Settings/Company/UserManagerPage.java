package com.eprint.pageObjects.Settings.Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class UserManagerPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord_Roles()
	{
		WebElement element = driver.findElement(By.linkText("Add New Record"));
		return element;
	}
	public static WebElement lnk_AddNewRecord_Users()
	{
		WebElement element = driver.findElement(By.partialLinkText("Add New Record"));
		return element;
	}
}
