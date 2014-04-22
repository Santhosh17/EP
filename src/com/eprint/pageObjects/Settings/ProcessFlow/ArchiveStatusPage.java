package com.eprint.pageObjects.Settings.ProcessFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class ArchiveStatusPage extends SuperTestNG
{
	public static WebElement drpdn_WhenYouManuallyArchiveAnEstimate() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlEst1"));
		return element;
	}
	public static WebElement drpdn_WhenYouProgressanEstimatetoJob() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlEst1"));
		return element;
	}
	
}
