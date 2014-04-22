package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class TaskSubjectPage extends SuperTestNG
{
	public static WebElement lnk_AddNewRecord()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_radgrdtasksubject_ctl00_ctl02_ctl00_btnAdd"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_radgrdtasksubject_ctl00_ctl02_ctl00_btnclrFilters"));
		return element;
	}
	public static WebElement txtbx_Subject()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_radgrdtasksubject_ctl00_ctl02_ctl04_txtSubject"));
		return element;
	}
	public static WebElement chkbx_Default()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_radgrdtasksubject_ctl00_ctl02_ctl04_chkDefault"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_radgrdtasksubject_ctl00_ctl02_ctl04_radbtnCancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_radgrdtasksubject_ctl00_ctl02_ctl04_radbtnSave"));
		return element;
	}
}
