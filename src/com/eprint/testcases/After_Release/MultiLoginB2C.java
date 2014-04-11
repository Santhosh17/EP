package com.eprint.testcases.After_Release;

import org.testng.annotations.Test;

import com.eprint.libraries.Generic;
import com.eprint.libraries.SuperTestNG;

public class MultiLoginB2C extends SuperTestNG
{
	@Test
	public static void testMultiLoginB2C()
	{
	String xlpath="./Excel Files/Login Scripts Data.xls";
	String sheetName = "Test Login";
	int NumberOfRows = Generic.getexcelRowcount(xlpath, sheetName);
	for(int row = 1;row<=NumberOfRows;row++)
	{
		String Condition= Generic.getXlCellValue(xlpath, sheetName, row, 9);
		System.out.println("Cell Value = "+Condition);
		if (Condition.equals("YES"))
		{
			String URL = Generic.getXlCellValue(xlpath, sheetName, row, 8);
			driver.get(URL);
			System.out.println("Row Number = "+row+" Accessing = "+URL );
			Generic.BlindWait(2);
		}
		else if (Condition.equals("NO"))
		{
			String URL = Generic.getXlCellValue(xlpath, sheetName, row, 8);
			System.out.println("Row Number = "+row+" Skipping = "+URL );
		}
	}
	}
}