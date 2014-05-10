package com.eprint.pageObjects.Estimates.SheetFedOffset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Edit_SFO_NCR extends SuperTestNG
{
	public static WebElement chkbx_UpdateItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCNCRItem_Chk_ItemDescn"));
		return element;
	}

}
