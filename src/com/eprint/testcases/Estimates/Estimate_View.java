package com.eprint.testcases.Estimates;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Estimate_View extends SuperTestNG
{
	@Test
	public static void testEstimate_View()
	{
		EprintSpecificLinks.login();
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "View All Quotes","View All Quotes");
		}
		ProjectLibrary.ClickOnLinkByID("Edit View", "ctl00_ContentPlaceHolder1_lnkPurchaseedit");
		List<WebElement> elements = driver.findElements(By.xpath("//div[3]/div/div/div/ul/li/input"));
		int elementcount = elements.size();
		for(int i=1;i<=elementcount;i++)
		{
			String Expression = "//div[3]/div/div/div/ul/li["+i+"]/input";
			driver.findElement(By.xpath(Expression)).click();
			Reporter.log("Clicked on "+i+"",true);
		}
		System.out.println(elementcount);
		Generic.BlindWait(120);
	}
}
