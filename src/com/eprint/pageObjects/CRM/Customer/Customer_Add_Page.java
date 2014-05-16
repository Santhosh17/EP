package com.eprint.pageObjects.CRM.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Customer_Add_Page extends SuperTestNG
{ 
	public static WebElement txt_CompanyType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_lblCompanyType"));
		return element;
	}
	public static WebElement txtbx_CompanyName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_companyname"));
		return element;
	}
	public static WebElement drpdn_Type()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_type_Input"));
		return element;
	}
	public static WebElement drpdn_AccountStatus()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_status"));
		return element;
	}
	public static WebElement txtbx_AccountNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_accountno"));
		return element;
	}
	public static WebElement txtbx_BusinessEmail()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_email"));
		return element;
	}
	public static WebElement txtbx_URL()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_url"));
		return element;
	}
	public static WebElement txtbx_CreditLimit()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_creditlimit"));
		return element;
	}
	public static WebElement txtbx_CreditReference()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_creditref"));
		return element;
	}
	public static WebElement drpdn_Tax()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_tax1"));
		return element;
	}
	public static WebElement txtbx_Address1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr1"));
		return element;
	}
	public static WebElement txtbx_Address2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr2"));
		return element;
	}
	public static WebElement txtbx_Address3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr3"));
		return element;
	}
	public static WebElement txtbx_Address4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr4"));
		return element;
	}
	public static WebElement txtbx_Address5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr5"));
		return element;
	}
	public static WebElement drpdn_Country()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_Deliverycountry"));
		return element;
	}
	public static WebElement txtbx_Telephone()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryphone"));
		return element;
	}
	public static WebElement txtbx_Fax()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryfax"));
		return element;
	}
	public static WebElement drpdn_PaymentTerms()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_PaymentTerms"));
		return element;
	}
	public static WebElement txtbx_ProfitMargin()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_profitmargin"));
		return element;
	}
	public static WebElement txtbx_TaxRegNo()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_taxregno"));
		return element;
	}
	public static WebElement txtbx_CompanyNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_companyno"));
		return element;
	}
	public static WebElement txtbx_ACOpened()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_acopened"));
		return element;
	}
	public static WebElement txtbx_BankCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_bankcode"));
		return element;
	}
	public static WebElement txtbx_BankAccountNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_bankacno"));
		return element;
	}
	public static WebElement txtbx_AccountName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_accountname"));
		return element;
	}
	public static WebElement drpdn_SalesPerson()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_salesperson"));
		return element;
	}
	public static WebElement drpdn_ReferredBy()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ddl_Referencedby"));
		return element;
	}
	public static WebElement btn_ReferredBy()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_ImgRefferedByAdd"));
		return element;
	}
	public static WebElement chkbx_CreateIdenticalContact()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_Chkcreate_identical_contact"));
		return element;
	}
	public static WebElement chkbx_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_txt_description"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_btncancel"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_btnsave"));
		return element;
	}
}
