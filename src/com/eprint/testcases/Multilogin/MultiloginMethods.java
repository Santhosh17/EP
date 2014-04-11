package com.eprint.testcases.Multilogin;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class MultiloginMethods extends SuperTestNG
{
	public static void CheckNewFeaturesInSite()
	{
		EprintSpecificLinks.ClickOnReports();
		EprintSpecificLinks.selectDelivery();
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadPanelBar1_i0_chkColumns_4")).isDisplayed();
		String Jobtitle = driver.findElement(By.xpath("//label[@for='ctl00_ContentPlaceHolder1_RadPanelBar1_i0_chkColumns_4']")).getText();
		Assert.assertEquals(Jobtitle, "Job Title");
		Reporter.log(Jobtitle+" Text Verification ---- Passed",true);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadPanelBar1_i0_chkColumns_5")).isDisplayed();
		String Jobvalue = driver.findElement(By.xpath("//label[@for='ctl00_ContentPlaceHolder1_RadPanelBar1_i0_chkColumns_5']")).getText();
		Assert.assertEquals(Jobvalue, "Job Value ($)");
		Reporter.log(Jobvalue+" Text Verification ---- Passed",true);
		
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		WebElement ddlist = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCalculation"));
		Select singleselect = new Select(ddlist);
		singleselect.selectByVisibleText("Formula Based");
		
		try
		{
			driver.findElement(By.xpath("//table[34]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b[text()='Product Catalogue']"));
			
			driver.findElement(By.xpath("//table[34]/tbody/tr/td/div[1]/table/tbody/tr/td[2]/b[text()='Product Catalogue']")).click();;
			
			Reporter.log("Clicked on Product Catalogue ",true);

		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Product Catalogue link Verification --- FAILED",true);
		}
		try
		{
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Width']"));
		String ProductWidth = driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Width']")).getText();
		Assert.assertEquals(ProductWidth, "Product Width");
		Reporter.log(ProductWidth+" Link Verification ---- Passed",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Product Width - Link Verification ---- FAILED");
		}
		try
		{
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Height']"));
		String ProductHeight = driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Height']")).getText();
		Assert.assertEquals(ProductHeight, "Product Height");
		Reporter.log(ProductHeight+" Link Verification ---- Passed",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (NoSuchElementException e)
		{	
			Reporter.log("Product Height - Link Verification ---- FAILED");
		}
		try
		{		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Weight']"));
		String ProductWeight = driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Weight']")).getText();
		Assert.assertEquals(ProductWeight, "Product Weight");
		Reporter.log(ProductWeight+" Link Verification ---- Passed",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Product Weight - Link Verification ---- FAILED");
		}
		try
		{		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Length']"));
		String ProductLength = driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[text()='Product Length']")).getText();
		Assert.assertEquals(ProductLength, "Product Length");
		Reporter.log(ProductLength+" Link Verification ---- Passed",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Product Length - Link Verification ---- FAILED");
		}
	}
	public static void CheckNewFeaturesInB2BSite()
	{
		
	}
	public static void B2BLogout()
	{
		driver.findElement(By.id("ctl00_lnkLogout")).click();
		Reporter.log("Clicking on Logout Button",true);
		String logoutconfirmation = driver.findElement(By.id("lblLogOutHead")).getText();
		Assert.assertEquals(logoutconfirmation,"You have successfully Logged out");
		Reporter.log("Logout Successfull Message Verified ",true);
	}
	
}
