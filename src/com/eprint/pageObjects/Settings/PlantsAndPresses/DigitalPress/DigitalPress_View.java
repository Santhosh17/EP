package com.eprint.pageObjects.Settings.PlantsAndPresses.DigitalPress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class DigitalPress_View extends SuperTestNG
{
	public static WebElement txt_SuccessMsg() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_lblMessage"));
		return element;
	}
}
