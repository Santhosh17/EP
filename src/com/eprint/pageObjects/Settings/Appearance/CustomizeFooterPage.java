package com.eprint.pageObjects.Settings.Appearance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class CustomizeFooterPage extends SuperTestNG
{
	public static WebElement txtbx_FooterText()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txttext"));
		return element;
	}
	public static WebElement chkbx_Text()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdtext"));
		return element;
	}
	public static WebElement chkbx_Image()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdimage"));
		return element;
	}
	public static WebElement btn_Browse()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_FileUpload1"));
		return element;
	}
	public static WebElement chkbx_CustomHTML()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdtemplate"));
		return element;
	}
	public static WebElement txtbx_CustomHTML()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txttemplate"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnsave"));
		return element;
	}
	public static WebElement lnk_Remove()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton1"));
		return element;
	}
}
