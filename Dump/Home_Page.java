package com.eprint.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Home_Page extends SuperTestNG
{
	public static WebElement Icn_Settings()
	{
		WebElement element = driver.findElement(By.id("settingimg"));
		return element;
	}
	public static WebElement lnk_EprintMIS()
	{
		WebElement element = driver.findElement(By.partialLinkText("ePrint MIS"));
		return element;
	}
	public static WebElement lnk_Estore()
	{
		WebElement element = driver.findElement(By.partialLinkText("ePrint eStore"));
		return element;
	}
	
}
