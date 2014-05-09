package com.eprint.libraries;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
public class ProjectLibrary extends SuperTestNG
{
	public static void GoToURL_DD(String xlpath,String sheetName,int RowNum,int ColNum)
	{
		String URL = Generic.getXlCellValue(xlpath, sheetName, RowNum, ColNum);
		driver.get(URL);
		Reporter.log("Navigating to: "+URL,true);
		String Title = driver.getTitle();
		Reporter.log("Page Title "+Title ,true);
	}
	public static void StringDDTextBoxID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementID)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.id(webelementID));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);
	}
	public static void StringDDTextBox(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,WebElement TxtBxWebElement)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		TxtBxWebElement.clear();
		TxtBxWebElement.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);
	}
	public static void StringDDTextBoxName(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementNAME)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.name(webelementNAME));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	
	}
	
	public static void StringDDTextBoxLinkText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementLINKTEXT)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.linkText(webelementLINKTEXT));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void StringDDTextBoxParitalLinkText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementPartialLINKTEXT)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.partialLinkText(webelementPartialLINKTEXT));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void StringDDTextBoxXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementXPATH)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.xpath(webelementXPATH));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void StringDDTextBoxCssSelector(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementCssSelector)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.cssSelector(webelementCssSelector));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void StringDDTextBoxClassName(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementClassName)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.className(webelementClassName));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void StringDDTextBoxTagName(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementTagName)
	{
		String SheetData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.tagName(webelementTagName));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//	
	public static void DoubleDDTextBoxID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementID)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.id(webelementID));
		ElementLocation.clear();
		ElementLocation.sendKeys(SheetData+"");
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxName(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementNAME)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.name(webelementNAME));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxLinkText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementLINKTEXT)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.linkText(webelementLINKTEXT));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxParitalLinkText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementPartialLINKTEXT)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.partialLinkText(webelementPartialLINKTEXT));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementXPATH)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.xpath(webelementXPATH));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxCssSelector(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementCssSelector)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.cssSelector(webelementCssSelector));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxClassName(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementClassName)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.className(webelementClassName));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
	
	public static void DoubleDDTextBoxTagName(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementTagName)
	{
		double SheetData = Generic.getXlCellNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.tagName(webelementTagName));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//	
	public static void intDDTextBoxID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementID)
	{
		int SheetData = Generic.getXlCellintNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement ElementLocation = driver.findElement(By.id(webelementID));
		ElementLocation.clear();
		ElementLocation.sendKeys(""+SheetData);
		Reporter.log(LocationName+" : '"+SheetData+"' - Entered",true);	
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//		
	public static void ChkBoxSelection(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementID)
	{
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (ExcelData.equals("YES"))
		{
			WebElement ElementLocation = driver.findElement(By.id(webelementID));
			if (ElementLocation.isSelected())
			{
				Reporter.log("Checkbox '"+LocationName+"' has been defaultly Selected",true);
			}
			else
			{
				ElementLocation.click();
				Reporter.log("Selecting "+LocationName+" Checkbox",true);
			}
		}
		else if (ExcelData.equals("NO"))
		{
			WebElement ElementLocation = driver.findElement(By.id(webelementID));
			if (ElementLocation.isSelected())
			{	
				Reporter.log(LocationName+" Checkbox has been Defaultly Selected ",true);
				ElementLocation.click();
				Reporter.log("Un-Selecting the '"+LocationName+"' Checkbox",true);
			}
			else
			{
				Reporter.log("Checkbox "+LocationName+" has been defaultly Un-Selected ",true);
			}
		}
	}
	public static void CheckBoxSelection(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,WebElement ChkBxWebelement)
	{
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (ExcelData.equals("YES"))
		{

			if (ChkBxWebelement.isSelected())
			{
				Reporter.log("Checkbox '"+LocationName+"' has been defaultly Selected",true);
			}
			else
			{
				ChkBxWebelement.click();
				Reporter.log("Selecting "+LocationName+" Checkbox",true);
			}
		}
		else if (ExcelData.equals("NO"))
		{

			if (ChkBxWebelement.isSelected())
			{	
				Reporter.log(LocationName+" Checkbox has been Defaultly Selected ",true);
				ChkBxWebelement.click();
				Reporter.log("Un-Selecting the '"+LocationName+"' Checkbox",true);
			}
			else
			{
				Reporter.log("Checkbox "+LocationName+" has been defaultly Un-Selected ",true);
			}
		}
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------//		
		public static void ChkBoxSelectionbyXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webelementXpath)
		{
			String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
			if (ExcelData.equals("YES"))
			{
				WebElement ElementLocation = driver.findElement(By.xpath(webelementXpath));
				if (ElementLocation.isSelected())
				{
					Reporter.log("Checkbox '"+LocationName+"' has been defaultly Selected",true);
				}
				else
				{
					ElementLocation.click();
					Reporter.log("Selecting "+LocationName+" Checkbox",true);
				}
			}
			else if (ExcelData.equals("NO"))
			{
				WebElement ElementLocation = driver.findElement(By.xpath(webelementXpath));
				if (ElementLocation.isSelected())
				{	
					Reporter.log(LocationName+" Checkbox has been Defaultly Selected ",true);
					ElementLocation.click();
					Reporter.log("Un-Selecting the '"+LocationName+"' Checkbox",true);
				}
				else
				{
					Reporter.log("Checkbox "+LocationName+" has been defaultly Un-Selected ",true);
				}
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//	
	public static void  SingleSelectDropDownbyVisibleText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,WebElement DrpDn_WebElement)
	{
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Select singleselect = new Select(DrpDn_WebElement);
		singleselect.selectByVisibleText(ExcelData);
		Reporter.log("Selecting an option '"+ExcelData+"' in '"+LocationName+"' Drop Down Menu",true);
	}
	public static void  SingleSelectDropDownbyVisibleTextbyID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webElementID)
	{
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement WebElement = driver.findElement(By.id(webElementID));
		Select singleselect = new Select(WebElement);
		singleselect.selectByVisibleText(ExcelData);
		Reporter.log("Selecting an option '"+ExcelData+"' in '"+LocationName+"' Drop Down Menu",true);
	}
	
	public static void  SingleSelectDropDownbyVisibleTextbyXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webElementxpath)
	{
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		WebElement WebElement = driver.findElement(By.xpath(webElementxpath));
		Select singleselect = new Select(WebElement);
		singleselect.selectByVisibleText(ExcelData);
		Reporter.log("Selecting an option '"+ExcelData+"' in '"+LocationName+"' Drop Down Menu",true);
	}
	
	public static void  SingleSelectNumDropDownbyVisibleText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String webElementID)
	{
		int ExcelData = Generic.getXlCellintNumValue(xlpath, sheetName, rownum, cellnum);
		WebElement WebElement = driver.findElement(By.id(webElementID));
		Select singleselect = new Select(WebElement);
		singleselect.selectByVisibleText(ExcelData+"");
		Reporter.log("Selecting an option '"+ExcelData+"' in '"+LocationName+"' Drop Down Menu",true);
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------//	
	public static void ClickOnButtonByID(String LocationName,String webelementID)
	{
	WebElement Button = driver.findElement(By.id(webelementID));
	Button.click();
	Reporter.log("Clicked on '"+LocationName+"' Button",true);
	}
	public static void ClickOnButton(String LocationName,WebElement ButtonWebElement)
	{
	ButtonWebElement.click();
	Reporter.log("Clicked on '"+LocationName+"' Button",true);
	}
	public static void ClickOnDropDown(String LocationName,WebElement ButtonWebElement)
	{
	ButtonWebElement.click();
	Reporter.log("Clicked on '"+LocationName+"' Button",true);
	}
	public static void ClickOnButtonByXpath(String LocationName,String webelementXpath)
	{
	WebElement Button = driver.findElement(By.xpath(webelementXpath));
	Button.click();
	Reporter.log("Clicked on '"+LocationName+"' Button",true);
	}
	public static void ClickOnButtonByLinkText(String LocationName,String webelementLinktext)
	{
		WebElement Button = driver.findElement(By.linkText(webelementLinktext));
		Button.click();
		Reporter.log("Clicked on '"+LocationName+"' Button",true);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//	
	public static void ClickOnLink(String LocationName,WebElement LinkWebElement)
	{
		LinkWebElement.click();
		Reporter.log("Clicked on '"+LocationName+"'Link",true);
	}
	public static void ClickOnLinkByID(String LocationName,String webelementID)
	{
		WebElement link = driver.findElement(By.id(webelementID));
		link.click();
		Reporter.log("Clicked on '"+LocationName+"'Link",true);
	}
	public static void ClickOnLinkByLinkText(String LocationName,String webelementLinkText)
	{
		WebElement link = driver.findElement(By.linkText(webelementLinkText));
		link.click();
		Reporter.log("Clicked on '"+LocationName+"'Link",true);
	}
	public static void ClickOnLinkByXpath(String LocationName,String WebelementXpath)
	{
		WebElement link = driver.findElement(By.xpath(WebelementXpath));
		link.click();
		Reporter.log("Clicked on '"+LocationName+"'Link",true);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//	
	public static boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        Alert alert = driver.switchTo().alert();
	        Reporter.log("Alert Popup is present",true);
	        alert.accept();
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   // isAlertPresent()
	public static void SelectARecordbyXpath(String xlpath,String sheetName,int PrevDataRowNum,int PrevDataCellNum,String WebElementXpath) 
	{
		String Exceldata = Generic.getXlCellValue(xlpath, sheetName, PrevDataRowNum, PrevDataCellNum);
		String select = driver.findElement(By.xpath(WebElementXpath)).getText();
		if (Exceldata.equals(select))
		{
			driver.findElement(By.xpath(WebElementXpath)).click();
			Reporter.log("Selecting: '"+select+"'",true);
		}
	}
	public static void SelectPreviousRecord(String xlpath,String sheetName,int PrevDataRowNum,int PrevDataCellNum) 
	{
		String Exceldata = Generic.getXlCellValue(xlpath, sheetName, PrevDataRowNum, PrevDataCellNum);
		String select = driver.findElement(By.linkText(Exceldata)).getText();
		WebElement clickinglocation = driver.findElement(By.linkText(Exceldata));
		clickinglocation.click();
		Reporter.log("Selecting: '"+select+"'",true);
	}
	public static String SelectPreviousRecordReturnRecordName(String xlpath,String sheetName,int PrevDataRowNum,int PrevDataCellNum) 
	{
		String Exceldata = Generic.getXlCellValue(xlpath, sheetName, PrevDataRowNum, PrevDataCellNum);
		String select = driver.findElement(By.linkText(Exceldata)).getText();
		WebElement clickinglocation = driver.findElement(By.linkText(Exceldata));
		clickinglocation.click();
		Reporter.log("Selecting: '"+select+"'",true);
		return select;
	}
	public static void SelectPreviousRecordByPartialLinkText(String xlpath,String sheetName,int PrevDataRowNum,int PrevDataCellNum) 
	{
		String Exceldata = Generic.getXlCellValue(xlpath, sheetName, PrevDataRowNum, PrevDataCellNum);
		String select = driver.findElement(By.partialLinkText(Exceldata)).getText();
		WebElement clickinglocation = driver.findElement(By.linkText(Exceldata));
		clickinglocation.click();
		Reporter.log("Selecting: '"+select+"'",true);
	}
	public static void SwitchToAlertPopup()
	{
		Alert alert = driver.switchTo().alert();
		alert.getText();
		Reporter.log("Message in Popup : '"+alert+"'",true );
		alert.accept();	
		Reporter.log("Clicked On OK (Accept) in Allert Popup",true);
	}
	//----------------------------------------------------------------------------------------------------------------------------------------------//
	public static void CompareStringText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,WebElement TxtWebElement)
	{
		String Content = TxtWebElement.getText();
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(Content,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	public static void CompareStringTextBox(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,WebElement TxtBoxWebElement)
	{
		String Content = TxtBoxWebElement.getAttribute("value");
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(Content,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	public static void CompareStringTextBoxByID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementID)
	{
		WebElement TxtBoxContent = driver.findElement(By.id(WebelementID));
		String Content = TxtBoxContent.getAttribute("value");
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(Content,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareStringTextBoxByXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementXpath)
	{
		WebElement TxtBoxContent = driver.findElement(By.xpath(WebelementXpath));
		String Content = TxtBoxContent.getAttribute("value");
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(Content,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareStringTextByID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementID)
	{
		WebElement TxtContent = driver.findElement(By.id(WebelementID));
		String Content = TxtContent.getText();
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(Content,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareStringTextByXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementXpath)
	{
		WebElement TxtContent = driver.findElement(By.xpath(WebelementXpath));
		String Content = TxtContent.getText();
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(Content,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareSubStringTextByID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementID,int beginIndex)
	{
		WebElement TxtContent = driver.findElement(By.id(WebelementID));
		String Content = TxtContent.getText();
		String substr = Content.substring(beginIndex);
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(substr,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareSubStringRangeTextByID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementID,int beginIndex,int endIndex)
	{
		WebElement TxtContent = driver.findElement(By.id(WebelementID));
		String Content = TxtContent.getText();
		String substr = Content.substring(beginIndex, endIndex);
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(substr,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareSubStringTextByXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementXpath,int WebElementbeginIndex)
	{
		WebElement TxtContent = driver.findElement(By.xpath(WebelementXpath));
		String Content = TxtContent.getText();
		String substr = Content.substring(WebElementbeginIndex);
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		Assert.assertEquals(substr,ExcelData);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareSubStringRangeTextBoxByXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementXpath,int WebElementbeginIndex,int WebElementendIndex,int ExcelbeginIndex,int ExcelendIndex)
	{
		WebElement TxtContent = driver.findElement(By.xpath(WebelementXpath));
		String Content = TxtContent.getAttribute("value");
		String substr = Content.substring(WebElementbeginIndex, WebElementendIndex);
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		String excelsubstr = ExcelData.substring(ExcelbeginIndex, ExcelendIndex);
		Assert.assertEquals(substr,excelsubstr);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareSubStringRangeTextByXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementXpath,int WebElementbeginIndex,int WebElementendIndex,int ExcelbeginIndex,int ExcelendIndex)
	{
		WebElement TxtContent = driver.findElement(By.xpath(WebelementXpath));
		String Content = TxtContent.getText();
		String substr = Content.substring(WebElementbeginIndex, WebElementendIndex);
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		String excelsubstr = ExcelData.substring(ExcelbeginIndex, ExcelendIndex);
		Assert.assertEquals(substr,excelsubstr);
		Reporter.log(LocationName+" Data Verification -- PASS",true);
	}
	
	public static void CompareStringDropDownTextByID(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementID)
	{
		WebElement DDmenu = driver.findElement(By.id(WebelementID));
		Select select = new Select(DDmenu);
		WebElement option = select.getFirstSelectedOption();
		String Content=option.getText();
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (Content.equals(ExcelData))
		{
		Reporter.log(LocationName+" Data Verification -- PASS",true);
		}
		else
		{
		Assert.fail(LocationName+"Data Verification -- Failed");
		}
	}
	
	public static void CompareStringDropDownTextByXpath(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,String WebelementXpath)
	{
		WebElement DDmenu = driver.findElement(By.xpath(WebelementXpath));
		Select select = new Select(DDmenu);
		WebElement option = select.getFirstSelectedOption();
		String Content=option.getText();
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (Content.equals(ExcelData))
		{
		Reporter.log(LocationName+" Data Verification -- PASS",true);
		}
		else
		{
		Assert.fail(LocationName+"Data Verification -- Failed");
		}
	}
	public static void CompareStringDropDownText(String xlpath,String sheetName,int rownum,int cellnum,String LocationName,WebElement DropDownWebElement)
	{
		Select select = new Select(DropDownWebElement);
		WebElement option = select.getFirstSelectedOption();
		String Content=option.getText();
		String ExcelData = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (Content.equals(ExcelData))
		{
		Reporter.log(LocationName+" Data Verification -- PASS",true);
		}
		else
		{
		Assert.fail(LocationName+"Data Verification -- Failed");
		}
	}
	
	public static void CompareCheckBoxVerify(String xlpath,String sheetName,int rownum,int cellnum,String DataValue1,String DataValue2,String LocationName,String WebElementID)
	{
		String Checkbox = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (Checkbox.equals(DataValue1))
		{
			WebElement CheckboxElement = driver.findElement(By.id(WebElementID));
			if (CheckboxElement.isSelected())
			{
				Reporter.log("Verifying '"+LocationName+"' Checkbox Selection -- PASS",true);
			}
			else
			{
				Assert.fail("As Per Data '"+LocationName+"' Checkbox Must Be Selected But It is Not Selected in Webpage");
			}
		}
		else if (Checkbox.equals(DataValue2))
		{
			WebElement CheckboxElement = driver.findElement(By.id(WebElementID));
			if (CheckboxElement.isSelected())
			{
				Assert.fail("As Per Data '"+LocationName+"' Checkbox Should Not be Selected But It is Now Selected in Webpage");
			}
			else
			{
				Reporter.log("Verifying '"+LocationName+"' Checkbox Selection -- PASS",true);
			}
		}
	}
	public static void CompareRadioButtonWith2_Option(String xlpath,String sheetName,int rownum,int cellnum,String FirstOptionDATA,String SecondOptionDATA,String FirstLocationName,String SecondLocationName,String FirstWebElementID,String SecondWebElementID)
	{
		String RadioButton = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (RadioButton.equals(FirstOptionDATA))
		{
			WebElement CheckboxElement = driver.findElement(By.id(FirstWebElementID));
			if (CheckboxElement.isSelected())
			{
				Reporter.log("Verifying '"+FirstLocationName+"' RadioButton Selection -- PASS",true);
			}
			else
			{
				Assert.fail("As Per Data '"+FirstLocationName+"' RadioButton Must Be Selected But It is NOT Selected in Webpage");
			}
		}
		else if (RadioButton.equals(SecondOptionDATA))
		{
			WebElement CheckboxElement = driver.findElement(By.id(SecondWebElementID));
			if (CheckboxElement.isSelected())
			{
				Reporter.log("Verifying '"+SecondLocationName+"' RadioButton Selection -- PASS",true);
			}
			else
			{
				Assert.fail("As Per Data  '"+SecondLocationName+"' RadioButton Must Be Selected But It is NOT Selected in Webpage");
			}
		}
	}
	public static void DropdownControlByID(String DropdownMenuName,String DropdownID,String SubMenuName,String LinkTextOfSubMenu)
	{
		WebElement Dropdown = driver.findElement(By.id(DropdownID));
		Actions actions = new Actions(driver);
		actions.moveToElement(Dropdown).perform();
		Reporter.log("Hovering Mouse on - "+DropdownMenuName,true);
		driver.findElement(By.linkText(LinkTextOfSubMenu)).click();
		Reporter.log("Clicking on Sub Menu Option - "+SubMenuName,true);
	}
	public static void HoverDropdownControlByXpath(String DropdownMenuName,String DropdownXpath,String SubMenuName,String LinkTextOfSubMenu)
	{
		WebElement Dropdown = driver.findElement(By.xpath(DropdownXpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(Dropdown).perform();
		Reporter.log("Hovering Mouse on - "+DropdownMenuName,true);
		driver.findElement(By.linkText(LinkTextOfSubMenu)).click();
		Reporter.log("Clicking on Sub Menu Option - "+SubMenuName,true);
	}
	public static void HoverDropdownControl_ByXpath(String DropdownMenuName,WebElement DropdownWebElement,String SubMenuName,WebElement DropdownOptionWebelement)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(DropdownWebElement).perform();
		Reporter.log("Hovering Mouse on - "+DropdownMenuName,true);
		DropdownOptionWebelement.click();
		Reporter.log("Clicking on Sub Menu Option - "+SubMenuName,true);
	}
	public static void PageTitleVerification(String ExpectedPageTitle)
	{
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, ExpectedPageTitle);
		Reporter.log(PageTitle+"- Page Title VERIFICATION --- PASS ",true);
	}
	
}

