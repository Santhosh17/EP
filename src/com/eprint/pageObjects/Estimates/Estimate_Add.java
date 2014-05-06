package com.eprint.pageObjects.Estimates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.eprint.libraries.SuperTestNG;

public class Estimate_Add extends SuperTestNG
{
	public static WebElement txtbx_Company()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName"));
		return element;
	}
	public static WebElement Icn_CompanyAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImgCustomerAdd"));
		return element;
	}
	public static WebElement drpdn_Contact()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName"));
		return element;
	}
	public static WebElement Icn_ContactAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton8"));
		return element;
	}
	public static WebElement txtbx_Greeting()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtGreeting"));
		return element;
	}
	public static WebElement txtbx_Department()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtCompany"));
		return element;
	}
	public static WebElement Icn_DepartmentAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton9"));
		return element;
	}
	public static WebElement drpdn_CostCentre()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlcostcentre"));
		return element;
	}
	public static WebElement Icn_CostCentreAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton10"));
		return element;
	}
	public static WebElement txt_AccountNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblAccountNumber"));
		return element;
	}
	public static WebElement Icn_ContactAddressAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton5"));
		return element;
	}
	public static WebElement txt_ContactAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblAddress"));
		return element;
	}
	public static WebElement Icn_DeliveryAddressAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton7"));
		return element;
	}
	public static WebElement txt_DeliveryAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblDeliveryAddress"));
		return element;
	}
	public static WebElement Icn_InvoiceAddressAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton3"));
		return element;
	}
	public static WebElement txt_InvoiceAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblInvoiceAddress"));
		return element;
	}
	public static WebElement Icn_HeaderAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton2"));
		return element;
	}
	public static WebElement Icn_FooterAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton6"));
		return element;
	}
	public static WebElement drpdn_SalesPerson()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlSalesPerson"));
		return element;
	}
	public static WebElement drpdn_EstimateType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType"));
		return element;
	}
	public static WebElement drpdn_ProductType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlProductType"));
		return element;
	}
	public static WebElement drpdn_CalculationType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlCalcType"));
		return element;
	}
	public static WebElement txtbx_EstimateTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle"));
		return element;
	}
	public static WebElement chkbx_SetAsDefaultEstimateTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_Chk_isDefaultTitle"));
		return element;
	}
	public static WebElement txtbx_CustomerOrderNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber"));
		return element;
	}
	public static WebElement drpdn_Status()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlStatus"));
		return element;
	}
	public static WebElement txtbx_EstimateDate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimateDate"));
		return element;
	}
	public static WebElement txtbx_EstimatedArtwork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimateartworkDate"));
		return element;
	}
	public static WebElement txtbx_EstimatedProof()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtproofdate"));
		return element;
	}
	public static WebElement txtbx_EstimatedApproval()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtapprovaldate"));
		return element;
	}
	public static WebElement txtbx_EstimatedProduction()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtproductiondate"));
		return element;
	}
	public static WebElement txtbx_EstimatedCompletion()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtjobcompletiondate"));
		return element;
	}
	public static WebElement txtbx_EstimatedDelivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimatedeliveryDate"));
		return element;
	}
	public static WebElement txtbx_ValidFor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtValidFor"));
		return element;
	}
	public static WebElement btn_Next()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_btnNext"));
		return element;
	}
	
}
