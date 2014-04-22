package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class MailchimpIntegrationPage extends SuperTestNG
{
	public static WebElement txtbx_APIKey()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAPIKey"));
		return element;
	}
	public static WebElement btn_ClickHereToValidateTheKey()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnGetList"));
		return element;
	}

}
