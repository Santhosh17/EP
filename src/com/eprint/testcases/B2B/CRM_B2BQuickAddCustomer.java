package com.eprint.testcases.B2B;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class CRM_B2BQuickAddCustomer extends SuperTestNG
{
	@Test
	public static void testCRM_B2BQuickAddCustomer()
	{
		
		String xlpath="./Excel Files/CRM/CRM.xls";
		String sheetName = "Customer Add";
		ProjectLibrary.HoverDropdownControlByXpath("CRM", "//span[text()='CRM']", "Add New Customer","Add New Customer");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 1, "Company Name", "ctl00_ContentPlaceHolder1_ClientAddID_txt_companyname");
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_ClientAddID_btnsave");
		ProjectLibrary.DropdownControlByID("More Options", "ctl00_ContentPlaceHolder1_Client_BtnMoreAction", "eStore", "eStore");
		ProjectLibrary.ClickOnButtonByID("Create B2B eStore", "ctl00_ContentPlaceHolder1_Client_B2BSubSection_btn_b2bCreate");
		WebElement FrameLocation = driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_Client_B2BSubSection_ifrm_accounts']"));
		Reporter.log("Switching to Frame",true);
		driver.switchTo().frame(FrameLocation);
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 1, "Account Name", "AccountNew_txt_accountName");
		ProjectLibrary.ClickOnButtonByID("Save", "AccountNew_btnsave");
		driver.switchTo().defaultContent();
		ProjectLibrary.DropdownControlByID("More Options", "ctl00_ContentPlaceHolder1_Client_BtnMoreAction", "Contact", "Contact");
		ProjectLibrary.ClickOnLinkByLinkText("Add New Contact", "Add New Contact");
		try
		{
		WebElement FramePath = driver.findElement(By.xpath(".//*[@id='RadWindowWrapper_contacts']/table/tbody/tr[2]/td[2]/iframe"));
		Reporter.log("Finding frame in Add New Contact Radwindow",true);
		driver.switchTo().frame(FramePath);
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
		Reporter.log("Switching to Frame",true);
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 1,"First Name","ctl00_ContentPlaceHolder1_UCContact_txtFirstName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 43, 1, "Email", "ctl00_ContentPlaceHolder1_UCContact_txt_ContactEmail");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 48, 1, "Allow this contact to login to b2b ordering portal", "ctl00_ContentPlaceHolder1_UCContact_chkB2bLogin");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 49, 1, "New Password", "ctl00_ContentPlaceHolder1_UCContact_txtPassword");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 50, 1, "Confirm Password", "ctl00_ContentPlaceHolder1_UCContact_txtConfirmPassword");
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_UCContact_btnSave");
		driver.switchTo().defaultContent();
		Reporter.log("Taking control back to main window",true);
		EprintSpecificLinks.SuccessMsgVerification("Contact added successfully", "ctl00_ContentPlaceHolder1_Client_ctl30_lblMessage");
	}
}