package com.eprint.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class LogIn_Page extends SuperTestNG
{
	public static WebElement txtbx_LoginMail()
	{
		WebElement element = driver.findElement(By.id("email"));
		return element;
	}
	public static WebElement txtbx_LoginPwd()
	{
		WebElement element = driver.findElement(By.id("password"));
		return element;
	}
	public static WebElement chkbx_StayLoggedIn()
	{
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/label"));
		return element;
	}
	public static WebElement btn_Login()
	{
		WebElement element = driver.findElement(By.id("btnlogin"));
		return element;
	}
}