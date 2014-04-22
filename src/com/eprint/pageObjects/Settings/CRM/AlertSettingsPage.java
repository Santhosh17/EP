package com.eprint.pageObjects.Settings.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class AlertSettingsPage extends SuperTestNG
{
	public static WebElement chkbx_SwitchOnTasksCallsAlerts()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkswitchonAlertsetting"));
		return element;
	}
	public static WebElement chkbx_TaskScreenAlert()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkTaskScreenMinute"));
		return element;
	}
	public static WebElement drpdn_TasksScreenAlert()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlTaskScreenMinute"));
		return element;
	}
	public static WebElement chkbx_CallsScreenAlert()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkCallScreenMinute"));
		return element;
	}
	public static WebElement drpdn_CallsScreenAlert()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCallScreenMinute"));
		return element;
	}
	public static WebElement chkbx_TasksEmailNotification()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkTaskSendMinute"));
		return element;
	}
	public static WebElement drpdn_TasksEmailNotification()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlTaskSendMinute"));
		return element;
	}
	public static WebElement chkbx_CallsEmailNotification()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkCallSendMinute"));
		return element;
	}
	public static WebElement drpdn_CallsEmailNotification()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCallSendMinute"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancelSetting"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSaveSetting"));
		return element;
	}
}
