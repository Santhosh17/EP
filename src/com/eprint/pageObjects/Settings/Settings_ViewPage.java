package com.eprint.pageObjects.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Settings_ViewPage extends SuperTestNG
{
	public static WebElement drpdn_Accounting()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblAccounting"));
		return element;
	}
	public static class Accounting
	{
		public static WebElement lnk_AccountingCode()
		{
			WebElement element = driver.findElement(By.partialLinkText("Accounting Code"));
			return element;
		}
		public static WebElement lnk_MYOB()
		{
			WebElement element = driver.findElement(By.partialLinkText("MYOB"));
			return element;
		}
		public static WebElement lnk_XERO()
		{
			WebElement element = driver.findElement(By.partialLinkText("XERO"));
			return element;
		}
	}
	public static WebElement drpdn_Appearance()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblAppearence"));
		return element;
	}
	public static class Appearance
	{
		public static WebElement lnk_CustomizeHeader()
		{
			WebElement element = driver.findElement(By.partialLinkText("Customize Header"));
			return element;
		}
		public static WebElement lnk_CustomizeFooter()
		{
			WebElement element = driver.findElement(By.partialLinkText("Customize Footer"));
			return element;
		}
		public static WebElement lnk_CustomizeTab()
		{
			WebElement element = driver.findElement(By.partialLinkText("Customize Tab"));
			return element;
		}
		public static WebElement lnk_CustomizeTabColour()
		{
			WebElement element = driver.findElement(By.partialLinkText("Customize Tab Colour"));
			return element;
		}
	}
	public static WebElement drpdn_Company()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblCompany"));
		return element;
	}
	public static class Company
	{
		public static WebElement lnk_Profile()
		{
			WebElement element = driver.findElement(By.partialLinkText("Profile"));
			return element;
		}
		public static WebElement lnk_RegionalSettings()
		{
			WebElement element = driver.findElement(By.partialLinkText("Regional Settings"));
			return element;
		}
		public static WebElement lnk_SystemMarkup()
		{
			WebElement element = driver.findElement(By.partialLinkText("System Markup"));
			return element;
		}
		public static WebElement lnk_Tax()
		{
			WebElement element = driver.findElement(By.partialLinkText("Tax"));
			return element;
		}
		public static WebElement lnk_Users()
		{
			WebElement element = driver.findElement(By.partialLinkText("Users"));
			return element;
		}
	}
	public static WebElement drpdn_ContentMgmt()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblContentmgmt"));
		return element;
	}
	public static class ContentMgmt
	{
		public static WebElement lnk_ItemDescriptions()
		{
			WebElement element = driver.findElement(By.partialLinkText("Item Descriptions"));
			return element;
		}
		public static WebElement lnk_PhraseBook()
		{
			WebElement element = driver.findElement(By.partialLinkText("Phrase Book"));
			return element;
		}
	}
	public static WebElement drpdn_CRM()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblCRM"));
		return element;
	}
	public static class CRM
	{
		public static WebElement lnk_AddressLabels()
		{
			WebElement element = driver.findElement(By.partialLinkText("Address Labels"));
			return element;
		}
		public static WebElement lnk_AccountStatus()
		{
			WebElement element = driver.findElement(By.partialLinkText("Account Status"));
			return element;
		}
		public static WebElement lnk_AlertSettings()
		{
			WebElement element = driver.findElement(By.partialLinkText("Alert Settings"));
			return element;
		}
		public static WebElement lnk_CallSubject()
		{
			WebElement element = driver.findElement(By.partialLinkText("Call Subject"));
			return element;
		}
		public static WebElement lnk_CompanyType()
		{
			WebElement element = driver.findElement(By.partialLinkText("Company Type"));
			return element;
		}
		public static WebElement lnk_ContactCustomFields()
		{
			WebElement element = driver.findElement(By.partialLinkText("Contact Custom Fields"));
			return element;
		}
		public static WebElement lnk_DashboardSettings()
		{
			WebElement element = driver.findElement(By.partialLinkText("Dashboard Settings"));
			return element;
		}
		public static WebElement lnk_DepartmentCustomFields()
		{
			WebElement element = driver.findElement(By.partialLinkText("Department Custom Fields"));
			return element;
		}
		public static WebElement lnk_PaymentTerms()
		{
			WebElement element = driver.findElement(By.partialLinkText("Payment Terms"));
			return element;
		}
		public static WebElement lnk_Referrals()
		{
			WebElement element = driver.findElement(By.partialLinkText("Referrals"));
			return element;
		}
		public static WebElement lnk_TaskSubject()
		{
			WebElement element = driver.findElement(By.partialLinkText("Task Subject"));
			return element;
		}
		public static WebElement lnk_MailchimpIntegration()
		{
			WebElement element = driver.findElement(By.partialLinkText("Mailchimp Integration"));
			return element;
		}
		
	}
	public static WebElement drpdn_SystemEmails()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblSystemEmail"));
		return element;
	}
	public static class SystemEmails
	{
		public static WebElement lnk_Customizetext()
		{
			WebElement element = driver.findElement(By.partialLinkText("Customize Text"));
			return element;
		}
		public static WebElement lnk_EmailSettings()
		{
			WebElement element = driver.findElement(By.partialLinkText("Email Settings"));
			return element;
		}
	}
	public static WebElement drpdn_General()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblGeneral"));
		return element;
	}
	public static class General
	{
		public static WebElement lnk_NumberingSystem()
		{
			WebElement element = driver.findElement(By.partialLinkText("Numbering System"));
			return element;
		}
		public static WebElement lnk_PaperStockSizes()
		{
			WebElement element = driver.findElement(By.partialLinkText("Paper/Stock Sizes"));
			return element;
		}
	}
	public static WebElement drpdn_OtherCosts()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblOtehrCost"));
		return element;
	}
	public static class OtherCosts
	{
		public static WebElement lnk_Category()
		{
			WebElement element = driver.findElement(By.partialLinkText("Category"));
			return element;
		}
		public static WebElement lnk_Costs()
		{
			WebElement element = driver.findElement(By.partialLinkText("Costs"));
			return element;
		}
		public static WebElement lnk_Sequence()
		{
			WebElement element = driver.findElement(By.partialLinkText("Sequence"));
			return element;
		}
	}
	public static WebElement drpdn_PlantAndPresses()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblPlantProcess"));
		return element;
	}
	public static class PlantAndPresses
	{
		public static WebElement lnk_DigitalPress()
		{
			WebElement element = driver.findElement(By.partialLinkText("Digital Press"));
			return element;
		}
		public static WebElement lnk_Guillotine()
		{
			WebElement element = driver.findElement(By.partialLinkText("Guillotine"));
			return element;
		}
		public static WebElement lnk_LargeFormat()
		{
			WebElement element = driver.findElement(By.partialLinkText("Large Format"));
			return element;
		}
		public static WebElement lnk_CuttingTable()
		{
			WebElement element = driver.findElement(By.partialLinkText("Cutting Table"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset()
		{
			WebElement element = driver.findElement(By.partialLinkText("Sheet Fed Offset"));
			return element;
		}
		
	}
	public static WebElement drpdn_ProcessFlow()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblProcessFlow"));
		return element;
	}
	public static class ProcessFlow
	{
		public static WebElement lnk_Estimates()
		{
			WebElement element = driver.findElement(By.partialLinkText("Estimates"));
			return element;
		}
		public static WebElement lnk_JobViewColor()
		{
			WebElement element = driver.findElement(By.partialLinkText("Job View Color"));
			return element;
		}
		public static WebElement lnk_Status()
		{
			WebElement element = driver.findElement(By.partialLinkText("Status"));
			return element;
		}
		public static WebElement lnk_ArchiveStatus()
		{
			WebElement element = driver.findElement(By.partialLinkText("Archive Status"));
			return element;
		}
		
	}
	public static WebElement drpdn_Templates()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblTemplate"));
		return element;
	}
	public static class Templates
	{
		public static WebElement lnk_Estimates()
		{
			WebElement element = driver.findElement(By.partialLinkText("Estimates"));
			return element;
		}
		public static WebElement lnk_SupplierRFQs()
		{
			WebElement element = driver.findElement(By.partialLinkText("Supplier RFQs"));
			return element;
		}
		public static WebElement lnk_Jobs()
		{
			WebElement element = driver.findElement(By.partialLinkText("Jobs"));
			return element;
		}
		public static WebElement lnk_JobCardSettings()
		{
			WebElement element = driver.findElement(By.partialLinkText("Job Card Settings"));
			return element;
		}
		public static WebElement lnk_Invoice()
		{
			WebElement element = driver.findElement(By.partialLinkText("Invoice"));
			return element;
		}
		public static WebElement lnk_PurchaseOrder()
		{
			WebElement element = driver.findElement(By.partialLinkText("Purchase Order"));
			return element;
		}
		public static WebElement lnk_DeliveryNotes()
		{
			WebElement element = driver.findElement(By.partialLinkText("Delivery Notes"));
			return element;
		}
		public static WebElement lnk_BackgroundPDF()
		{
			WebElement element = driver.findElement(By.partialLinkText("Background PDF"));
			return element;
		}
	}
	public static WebElement drpdn_Inventory()
	{
		WebElement element = driver.findElement(By.id("ctl00_lblInventory"));
		return element;
	}
	public static class Inventory
	{
		public static WebElement lnk_Adjustment()
		{
			WebElement element = driver.findElement(By.partialLinkText("Adjustment"));
			return element;
		}
		public static WebElement lnk_Import()
		{
			WebElement element = driver.findElement(By.partialLinkText("Import"));
			return element;
		}
		public static WebElement lnk_Settings()
		{
			WebElement element = driver.findElement(By.partialLinkText("Settings"));
			return element;
		}
		public static WebElement lnk_StockReduction()
		{
			WebElement element = driver.findElement(By.partialLinkText("Stock Reduction"));
			return element;
		}
	}
	public static WebElement lnk_OldData()
	{
		WebElement element = driver.findElement(By.linkText("Old Data"));
		return element;
	}
}
