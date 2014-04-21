package com.eprint.pageObjects.Settings.OtherCosts.Costs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class OtherCost_AddPage extends SuperTestNG
{
	public static WebElement txtbx_Name() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtName"));
		return element;
	}
	public static WebElement txtbx_Description() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDescription"));
		return element;
	}
	public static WebElement btn_Category() 
	{
		WebElement element = driver.findElement(By.xpath("//div[1]/div[2]/a/img"));
		return element;
	}
	public static WebElement drpdn_Category() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCategory"));
		return element;
	}
	public static WebElement drpdn_CalculationUsed() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCalculation"));
		return element;
	}
	public static WebElement btn_Supplier() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton8"));
		return element;
	}
	public static WebElement drpdn_Supplier() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlSupplier"));
		return element;
	}
	public static WebElement txtbx_PerHourCostPrice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPerHourCost"));
		return element;
	}
	public static WebElement txtbx_MarkupPercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProfit"));
		return element;
	}
	public static WebElement txtbx_MinimumChargePrice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimum"));
		return element;
	}
	public static class QuantityBased
	{
		public static WebElement drpdn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlSupplier"));
			return element;
		}
		public static WebElement btn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton8"));
			return element;
		}
		public static WebElement txtbx_MarkupPercentage() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProfit"));
			return element;
		}
		public static WebElement txtbx_MinimumChargePrice() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimum"));
			return element;
		}
		public static WebElement txtbx_HourlyRatePrice() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtQtyHourlyRate"));
			return element;
		}
		public static WebElement txtbx_MakeReadyTime() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtQtyMakeReadyTime"));
			return element;
		}
		public static WebElement txtbx_TimePerUnitMins() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtQtyTimePerUnit"));
			return element;
		}
		public static WebElement txtbx_UnitCost() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtQtyUnitCost"));
			return element;
		}
		public static WebElement rb_FixedValue() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_0"));
			return element;
		}
		public static WebElement txtbx_FixedValue() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtQtyFixedValue"));
			return element;
		}
		public static WebElement rb_VariableValue() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_1"));
			return element;
		}
		public static WebElement drpdn_VariableValue() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlQtyVariableValue"));
			return element;
		}
		public static WebElement btn_Cancel() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
			return element;
		}
	}
	public static class FormulaBased
	{
		public static WebElement drpdn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlSupplier"));
			return element;
		}
		public static WebElement btn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton8"));
			return element;
		}
		public static WebElement txtbx_MarkupPercentage() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProfit"));
			return element;
		}
		public static WebElement txtbx_MinimumCharge() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimum"));
			return element;
		}
		public static WebElement txtbx_FormulaString() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox2"));
			return element;
		}
		public static WebElement btn_LeftParentheses() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[1]"));
			return element;
		}
		public static WebElement btn_RightParentheses() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[2]"));
			return element;
		}
		public static WebElement btn_Plus() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[3]"));
			return element;
		}
		public static WebElement btn_Minus() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[4]"));
			return element;
		}
		public static WebElement btn_Multiply() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[5]"));
			return element;
		}
		public static WebElement btn_Divide() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[6]"));
			return element;
		}
		public static WebElement btn_Percentage() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[7]"));
			return element;
		}
		public static WebElement btn_Exponential() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[8]"));
			return element;
		}
		public static WebElement btn_Hash() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[9]"));
			return element;
		}
		public static WebElement btn_Reset() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[10]"));
			return element;
		}
		public static WebElement lnk_BookletVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[1]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class BookletVariables
		{
			public static WebElement lnk_BookletQtyReqd_Section1() 
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfSections() 
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_TotalNumberOfPages_AllSections() 
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PrintSheetQtyAllSections_IncludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[5]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PrintSheetQtyAllSections_ExcludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[6]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_Guillotine() 
		{
			WebElement element = driver.findElement(By.xpath("//table[7]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class Guillotine
		{
			public static WebElement lnk_GuillotineBundles() 
			{
				WebElement element = driver.findElement(By.xpath("//table[8]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_GuillotineCostPerCut() 
			{
				WebElement element = driver.findElement(By.xpath("//table[9]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfCutsInFirstTrim() 
			{
				WebElement element = driver.findElement(By.xpath("//table[10]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfCutsInSecondTrim() 
			{
				WebElement element = driver.findElement(By.xpath("//table[11]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_PadVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[12]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class PadVariables
		{
			public static WebElement lnk_NumberOfLeavesPerPad() 
			{
				WebElement element = driver.findElement(By.xpath("//table[13]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfPads() 
			{
				WebElement element = driver.findElement(By.xpath("//table[14]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_PressVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[15]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class PressVariables
		{
			public static WebElement lnk_PressHourlyCharge() 
			{
				WebElement element = driver.findElement(By.xpath("//table[16]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_TotalPressCostPrice() 
			{
				WebElement element = driver.findElement(By.xpath("//table[17]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_TotalPressSellingPrice() 
			{
				WebElement element = driver.findElement(By.xpath("//table[18]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_JobVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[19]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class JobVariables
		{
			public static WebElement lnk_PrintSheetQty_ExcludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[20]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PrintSheetQty_IncludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[21]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_FinishedJobQty_ExcludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[22]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_FinishedJobQty_IncludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[23]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_WarehouseVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[24]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class Warehousevariables
		{
			public static WebElement lnk_PaperBasisWeight() 
			{
				WebElement element = driver.findElement(By.xpath("//table[25]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_ExcludingMarkup() 
			{
				WebElement element = driver.findElement(By.xpath("//table[26]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_IncludingMarkup() 
			{
				WebElement element = driver.findElement(By.xpath("//table[27]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_SpoilagePercentageUsed() 
			{
				WebElement element = driver.findElement(By.xpath("//table[28]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_SpoilageSheetsUsed() 
			{
				WebElement element = driver.findElement(By.xpath("//table[29]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_ProductCatalogue() 
		{
			WebElement element = driver.findElement(By.xpath("//table[31]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class ProductCatalogue
		{
			public static WebElement lnk_ProductWidth() 
			{
				WebElement element = driver.findElement(By.xpath("//table[32]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_ProductHeight() 
			{
				WebElement element = driver.findElement(By.xpath("//table[33]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_ProductWeight() 
			{
				WebElement element = driver.findElement(By.xpath("//table[34]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_ProductLength() 
			{
				WebElement element = driver.findElement(By.xpath("//table[35]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_AddQuestion() 
		{
			WebElement element = driver.findElement(By.xpath("//table[35]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class AddQuestion
		{
			public static WebElement btn_Close() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton3"));
				return element;
			}
			public static WebElement txtbx_QuestionBox() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtquestion"));
				return element;
			}
			public static WebElement btn_OK() 
			{
				WebElement element = driver.findElement(By.id("//*[@id='div_QuestionTable']/table/tbody/tr[2]/td[3]/div/div/table/tbody/tr[2]/td/div[2]/input"));
				return element;
			}
		}
		public static WebElement btn_Cancel() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
			return element;
		}
	}
	public static class TimeBased
	{
		public static WebElement drpdn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton8"));
			return element;
		}
		public static WebElement btn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlSupplier"));
			return element;
		}
		public static WebElement txtbx_PerHourCost() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPerHourCost"));
			return element;
		}
		public static WebElement txtbx_MarkupPercentage() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProfit"));
			return element;
		}
		public static WebElement txtbx_MinimumCharge() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimum"));
			return element;
		}
		public static WebElement txtbx_HourlyRate() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHourlyRate"));
			return element;
		}
		public static WebElement txtbx_MakeReadyTime() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyTime"));
			return element;
		}
		public static WebElement txtbx_HourlyRunSpeed() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRunSpeed"));
			return element;
		}
		public static WebElement rb_MachineAndLabour() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_0"));
			return element;
		}
		public static WebElement rb_LabourOnly() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_1"));
			return element;
		}
		public static WebElement rb_FixedHours() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0"));
			return element;
		}
		public static WebElement txtbx_FixedHours() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFixedQty"));
			return element;
		}
		public static WebElement rb_HrsCalcBasedOnQtyandRunSpeed() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_1"));
			return element;
		}
		public static WebElement txtbx_HrsCalcBasedOnQtyandRunSpeed() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlVariableQty"));
			return element;
		}
		public static WebElement btn_Cancel() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
			return element;
		}
	}
	public static class FormulaBasedMatrix
	{
		public static WebElement txtbx_Prompt() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtprompt"));
			return element;
		}
		public static WebElement txtbx_Qty1_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm1"));
			return element;
		}
		public static WebElement txtbx_Qty1_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo1"));
			return element;
		}
		public static WebElement txtbx_Qty2_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm2"));
			return element;
		}
		public static WebElement txtbx_Qty2_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo2"));
			return element;
		}
		public static WebElement txtbx_Qty3_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm3"));
			return element;
		}
		public static WebElement txtbx_Qty3_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo3"));
			return element;
		}
		public static WebElement txtbx_Qty4_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm4"));
			return element;
		}
		public static WebElement txtbx_Qty4_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo4"));
			return element;
		}
		public static WebElement txtbx_Qty5_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm5"));
			return element;
		}
		public static WebElement txtbx_Qty5_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo5"));
			return element;
		}
		public static WebElement txtbx_Qty6_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm6"));
			return element;
		}
		public static WebElement txtbx_Qty6_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo6"));
			return element;
		}
		public static WebElement txtbx_Qty7_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm7"));
			return element;
		}
		public static WebElement txtbx_Qty7_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo7"));
			return element;
		}
		public static WebElement txtbx_Qty8_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm8"));
			return element;
		}
		public static WebElement txtbx_Qty8_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo8"));
			return element;
		}
		public static WebElement txtbx_Qty9_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm9"));
			return element;
		}
		public static WebElement txtbx_Qty9_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo9"));
			return element;
		}
		public static WebElement txtbx_Qty10_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm10"));
			return element;
		}
		public static WebElement txtbx_Qty10_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo10"));
			return element;
		}
		public static WebElement txtbx_Qty11_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm11"));
			return element;
		}
		public static WebElement txtbx_Qty11_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo11"));
			return element;
		}
		public static WebElement txtbx_Qty12_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm12"));
			return element;
		}
		public static WebElement txtbx_Qty12_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo12"));
			return element;
		}
		public static WebElement txtbx_Qty13_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm13"));
			return element;
		}
		public static WebElement txtbx_Qty13_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo13"));
			return element;
		}
		public static WebElement txtbx_Qty14_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm14"));
			return element;
		}
		public static WebElement txtbx_Qty14_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo14"));
			return element;
		}
		public static WebElement txtbx_Qty15_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm15"));
			return element;
		}
		public static WebElement txtbx_Qty15_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo15"));
			return element;
		}
		public static WebElement txtbx_Qty16_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm16"));
			return element;
		}
		public static WebElement txtbx_Qty16_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo16"));
			return element;
		}
		public static WebElement txtbx_Qty17_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm17"));
			return element;
		}
		public static WebElement txtbx_Qty17_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo17"));
			return element;
		}
		public static WebElement txtbx_Qty18_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm18"));
			return element;
		}
		public static WebElement txtbx_Qty18_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo18"));
			return element;
		}
		public static WebElement txtbx_Qty19_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm19"));
			return element;
		}
		public static WebElement txtbx_Qty19_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTo19"));
			return element;
		}
		public static WebElement txtbx_Qty20_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFrm20"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol1"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol2"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol3"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol4"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol5"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol6"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol7"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol8"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol9"));
			return element;
		}
		public static WebElement txtbx_MatrixUnitPrice10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCol10"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA51"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA52"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA53"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA54"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA55"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA56"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA57"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA58"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA59"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA510"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA511"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA512"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA513"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA514"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA515"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA516"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA517"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA518"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA519"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA520"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA41"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA42"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA43"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA44"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA45"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA46"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA47"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA48"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA49"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA410"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA411"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA412"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA413"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA414"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA415"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA416"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA417"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA418"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA419"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA420"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA31"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA32"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA33"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA34"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA35"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA36"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA37"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA38"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA39"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA310"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA311"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA312"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA313"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA314"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA315"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA316"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA317"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA318"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA319"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA320"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA21"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA22"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA23"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA24"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA25"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA26"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA27"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA28"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA29"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA210"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA211"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA212"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA213"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA214"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA215"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA216"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA217"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA218"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA219"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA220"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA61"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA62"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA63"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA64"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA65"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA66"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA67"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA68"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA69"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA610"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA611"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA612"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA613"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA614"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA615"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA616"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA617"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA618"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA619"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA620"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA71"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA72"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA73"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA74"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA75"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA76"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA77"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA78"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA79"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA710"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA711"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA712"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA713"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA714"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA715"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA716"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA717"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA718"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA719"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA720"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA81"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA82"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA83"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA84"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA85"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA86"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA87"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA88"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA89"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA810"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA811"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA812"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA813"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA814"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA815"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA816"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA817"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA818"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA819"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA820"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA91"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA92"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA93"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA94"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA95"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA96"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA97"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA98"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA99"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA910"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA911"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA912"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA913"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA914"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA915"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA916"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA917"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA918"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA919"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA920"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA101"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA102"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA103"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA104"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA105"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA106"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA107"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA108"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA109"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1010"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1011"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1012"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1013"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1014"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1015"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1016"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1017"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1018"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1019"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1020"));
			return element;
		}
		public static WebElement txtbx_MatrixValue1_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA111"));
			return element;
		}
		public static WebElement txtbx_MatrixValue2_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA112"));
			return element;
		}
		public static WebElement txtbx_MatrixValue3_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA113"));
			return element;
		}
		public static WebElement txtbx_MatrixValue4_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA114"));
			return element;
		}
		public static WebElement txtbx_MatrixValue5_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA115"));
			return element;
		}
		public static WebElement txtbx_MatrixValue6_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA116"));
			return element;
		}
		public static WebElement txtbx_MatrixValue7_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA117"));
			return element;
		}
		public static WebElement txtbx_MatrixValue8_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA118"));
			return element;
		}
		public static WebElement txtbx_MatrixValue9_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA119"));
			return element;
		}
		public static WebElement txtbx_MatrixValue10_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1110"));
			return element;
		}
		public static WebElement txtbx_MatrixValue11_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1111"));
			return element;
		}
		public static WebElement txtbx_MatrixValue12_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1112"));
			return element;
		}
		public static WebElement txtbx_MatrixValue13_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1113"));
			return element;
		}
		public static WebElement txtbx_MatrixValue14_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1114"));
			return element;
		}
		public static WebElement txtbx_MatrixValue15_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1115"));
			return element;
		}
		public static WebElement txtbx_MatrixValue16_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1116"));
			return element;
		}
		public static WebElement txtbx_MatrixValue17_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1117"));
			return element;
		}
		public static WebElement txtbx_MatrixValue18_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1118"));
			return element;
		}
		public static WebElement txtbx_MatrixValue19_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1119"));
			return element;
		}
		public static WebElement txtbx_MatrixValue20_10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA1120"));
			return element;
		}
		public static WebElement btn_SaveInMatrix() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSaveMatrix"));
			return element;
		}
		public static WebElement drpdn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlSupplier"));
			return element;
		}
		public static WebElement btn_Supplier() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton8"));
			return element;
		}
		public static WebElement txtbx_MarkupPercentage() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProfit"));
			return element;
		}
		public static WebElement txtbx_MinimumCharge() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimum"));
			return element;
		}
		public static WebElement txtbx_FormulaString() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox2"));
			return element;
		}
		public static WebElement btn_Matrix() 
		{
			WebElement element = driver.findElement(By.xpath(".//*[@id='div_matrix_button']/input"));
			return element;
		}
		public static WebElement btn_LeftParentheses() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[1]"));
			return element;
		}
		public static WebElement btn_RightParentheses() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[2]"));
			return element;
		}
		public static WebElement btn_Plus() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[3]"));
			return element;
		}
		public static WebElement btn_Minus() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[4]"));
			return element;
		}
		public static WebElement btn_Multiply() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[5]"));
			return element;
		}
		public static WebElement btn_Divide() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[6]"));
			return element;
		}
		public static WebElement btn_Percentage() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[7]"));
			return element;
		}
		public static WebElement btn_Exponential() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[8]"));
			return element;
		}
		public static WebElement btn_Hash() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[9]"));
			return element;
		}
		public static WebElement btn_Reset() 
		{
			WebElement element = driver.findElement(By.xpath("//div[3]/div[3]/div/input[10]"));
			return element;
		}
		public static WebElement lnk_BookletVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[1]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class BookletVariables
		{
			public static WebElement lnk_BookletQtyReqd_Section1() 
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfSections() 
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_TotalNumberOfPages_AllSections() 
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PrintSheetQtyAllSections_IncludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[5]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PrintSheetQtyAllSections_ExcludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[6]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_Guillotine() 
		{
			WebElement element = driver.findElement(By.xpath("//table[7]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class Guillotine
		{
			public static WebElement lnk_GuillotineBundles() 
			{
				WebElement element = driver.findElement(By.xpath("//table[8]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_GuillotineCostPerCut() 
			{
				WebElement element = driver.findElement(By.xpath("//table[9]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfCutsInFirstTrim() 
			{
				WebElement element = driver.findElement(By.xpath("//table[10]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfCutsInSecondTrim() 
			{
				WebElement element = driver.findElement(By.xpath("//table[11]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_PadVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[12]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class PadVariables
		{
			public static WebElement lnk_NumberOfLeavesPerPad() 
			{
				WebElement element = driver.findElement(By.xpath("//table[13]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_NumberOfPads() 
			{
				WebElement element = driver.findElement(By.xpath("//table[14]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_PressVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[15]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class PressVariables
		{
			public static WebElement lnk_PressHourlyCharge() 
			{
				WebElement element = driver.findElement(By.xpath("//table[16]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_TotalPressCostPrice() 
			{
				WebElement element = driver.findElement(By.xpath("//table[17]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_TotalPressSellingPrice() 
			{
				WebElement element = driver.findElement(By.xpath("//table[18]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_JobVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[19]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class JobVariables
		{
			public static WebElement lnk_PrintSheetQty_ExcludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[20]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PrintSheetQty_IncludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[21]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_FinishedJobQty_ExcludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[22]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_FinishedJobQty_IncludingSpoilage() 
			{
				WebElement element = driver.findElement(By.xpath("//table[23]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_WarehouseVariables() 
		{
			WebElement element = driver.findElement(By.xpath("//table[24]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class Warehousevariables
		{
			public static WebElement lnk_PaperBasisWeight() 
			{
				WebElement element = driver.findElement(By.xpath("//table[25]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_ExcludingMarkup() 
			{
				WebElement element = driver.findElement(By.xpath("//table[26]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_IncludingMarkup() 
			{
				WebElement element = driver.findElement(By.xpath("//table[27]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_SpoilagePercentageUsed() 
			{
				WebElement element = driver.findElement(By.xpath("//table[28]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_PaperCost_SpoilageSheetsUsed() 
			{
				WebElement element = driver.findElement(By.xpath("//table[29]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_ProductCatalogue() 
		{
			WebElement element = driver.findElement(By.xpath("//table[31]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class ProductCatalogue
		{
			public static WebElement lnk_ProductWidth() 
			{
				WebElement element = driver.findElement(By.xpath("//table[32]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_ProductHeight() 
			{
				WebElement element = driver.findElement(By.xpath("//table[33]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_ProductWeight() 
			{
				WebElement element = driver.findElement(By.xpath("//table[34]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
			public static WebElement lnk_ProductLength() 
			{
				WebElement element = driver.findElement(By.xpath("//table[35]/tbody/tr/td/div/table/tbody/tr/td[3]"));
				return element;
			}
		}
		public static WebElement lnk_AddQuestion() 
		{
			WebElement element = driver.findElement(By.xpath("//table[35]/tbody/tr/td/div[2]/table/tbody/tr/td[2]/b"));
			return element;
		}
		public static class AddQuestion
		{
			public static WebElement btn_Close() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton3"));
				return element;
			}
			public static WebElement txtbx_QuestionBox() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtquestion"));
				return element;
			}
			public static WebElement btn_OK() 
			{
				WebElement element = driver.findElement(By.id("//*[@id='div_QuestionTable']/table/tbody/tr[2]/td[3]/div/div/table/tbody/tr[2]/td/div[2]/input"));
				return element;
			}
		}
		public static WebElement btn_Cancel() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
			return element;
		}
		public static WebElement txt_NameAlreadyExistErrorMsg() 
		{
			WebElement element = driver.findElement(By.id("spn_alreadyExist"));
			return element;
		}
	}
}
