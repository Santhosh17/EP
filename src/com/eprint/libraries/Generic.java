package com.eprint.libraries;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
public class Generic extends SuperTestNG
{
// Method to count the rows present in excel sheet 
	public static int getexcelRowcount(String Xlpath,String SheetName)
	{ 
		int rowCount;
		try
		{
			FileInputStream fis = new FileInputStream(Xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			rowCount = wb.getSheet(SheetName).getLastRowNum();
		}
		catch(Exception e)
		{
			rowCount =-1;
		}
		return rowCount;
	}
//Method to read String data from specified cell of excel sheet 	
	public static String getXlCellValue(String xlpath,String sheetName,int rownum,int cellnum)
	{
		String V;
		try 
		{
			FileInputStream fis = new FileInputStream (xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cel = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum);
			cel.setCellType(Cell.CELL_TYPE_STRING);
			V=cel.getStringCellValue();
		}
		catch (Exception e)
		{
			V="";
		}
		return V;
	}
//Method to read Double data from specified cell of excel sheet
	public static double getXlCellNumValue(String xlpath,String sheetName,int rownum,int cellnum)
	{
		double V;
		try 
		{
			FileInputStream fis = new FileInputStream (xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cel = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum);
			cel.setCellType(Cell.CELL_TYPE_NUMERIC);
			V=cel.getNumericCellValue();
		}
		catch (Exception e)
		{
			V=0.0 ;
		}
		return V;
	}
//Method to read Int data from specified cell of excel sheet 	
	public static int getXlCellintNumValue(String xlpath,String sheetName,int rownum,int cellnum)
	{
		double V;
		try 
		{
			FileInputStream fis = new FileInputStream (xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			V = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getNumericCellValue();
		}
		catch (Exception e)
		{
			V=0.0 ;
		}
		int k = (int)V;
		return k;
	}
//Method to give delay in seconds
	public static void BlindWait(int timeInSec)
	{
		try {
			Thread.sleep(timeInSec*1000);
			Reporter.log("Delay for "+timeInSec+" Seconds",true);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public static void ImplicitWait(int timeInSec)
	{
		driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
	}
	public static void WriteDataToAExcelCell(String xlpath,String Sheetname,int RowNum,int CellNum,String DatatoWrite) throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(xlpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(Sheetname);
		s.createRow(RowNum).createCell(CellNum).setCellValue(DatatoWrite);
		FileOutputStream fos = new FileOutputStream(xlpath);
		wb.write(fos);
	}
}
