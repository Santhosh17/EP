package com.eprint.pageObjects.Inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Inventory_Add extends SuperTestNG
{
	public static class StockTab
	{
		public static WebElement tab_General()
		{
			WebElement element = driver.findElement(By.id("divGeneral"));
			return element;
		}
		public static WebElement tab_Stock()
		{
			WebElement element = driver.findElement(By.id("divStock"));
			return element;
		}
		public static WebElement txtbx_OpeningStock()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInStock"));
			return element;
		}
		public static WebElement txtbx_ReOrderAlertLevel()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtReorderLevel"));
			return element;
		}
		public static WebElement txtbx_ReOrderQuantity()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtReorderQty"));
			return element;
		}
		public static WebElement txtbx_StockReplenished()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtReasonadjustment"));
			return element;
		}
		public static WebElement rb_EachTimeStockFallsBelowTheReorderLevel()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_chkReorderLevelEveryTime"));
			return element;
		}
		public static WebElement rb_OncePerDayUntilTheStockIsReplenished()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_chkReorderLevelDaily"));
			return element;
		}
		public static WebElement rb_DontAlertsUsers()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_rdoNone"));
			return element;
		}
		public static WebElement txtbx_EmailAddressForAlerts()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtemail"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_btnSave_new"));
			return element;
		}
		public static WebElement btn_Cancel()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_btnCancel_new"));
			return element;
		}
		public static WebElement btn_Previous()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_BtnPrevious"));
			return element;
		}
	}
	public static class GeneralTab
	{
		public static WebElement tab_General()
		{
			WebElement element = driver.findElement(By.id("divGeneral"));
			return element;
		}
		public static WebElement tab_Stock()
		{
			WebElement element = driver.findElement(By.id("divStock"));
			return element;
		}
		public static WebElement txtbx_InventoryName()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInvName"));
			return element;
		}
		public static WebElement txtbx_FriendlyName()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txt_UserFriendlyName"));
			return element;
		}
		public static WebElement txtbx_Description()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtdescription"));
			return element;
		}
		public static WebElement txtbx_InventoryCode()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInvCode"));
			return element;
		}
		public static WebElement drpdn_InventoryCategory()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlInvCategory"));
			return element;
		}
		public static WebElement txtbx_Location()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInvLocation"));
			return element;
		}
		public static WebElement icn_Supplier()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ImageButton8"));
			return element;
		}
		public static WebElement drpdn_Supplier()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlSupplier"));
			return element;
		}
		public static WebElement btn_Cancel()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_btnCancel"));
			return element;
		}
		public static WebElement btn_Next()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_btnNext"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_btnSave"));
			return element;
		}
		
		
		public static class Inks
		{
			public static WebElement drpdn_InkCostingType()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlInkType"));
				return element;
			}
			public static WebElement txtbx_MinimumCostPrice()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtminimum"));
				return element;
			}
			public static class Yield
			{
				public static WebElement txtbx_Cost()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtCost"));
					return element;
				}
				public static WebElement txtbx_Per()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPer"));
					return element;
				}
				public static WebElement txtbx_PackedIn()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPackedIn"));
					return element;
				}
				public static WebElement drpdn_PackedIn()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlPackedIn"));
					return element;
				}
				public static WebElement txtbx_PackPrice()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPackedPrice"));
					return element;
				}
				public static WebElement txtbx_Color()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtColour"));
					return element;
				}
				public static WebElement drpdn_Coated()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlCoated"));
					return element;
				}
				public static WebElement txtbx_Yield()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtYield"));
					return element;
				}
			}
			public static class Matrix
			{
				public static WebElement txtbx_MinimumCost()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtminimum"));
					return element;
				}
				public static WebElement txtbx_SetUpCost()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtSetupCost"));
					return element;
				}
				public static WebElement txtbx_Quantity1()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo1"));
					return element;
				}
				public static WebElement txtbx_Quantity2()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo2"));
					return element;
				}
				public static WebElement txtbx_Quantity3()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo3"));
					return element;
				}
				public static WebElement txtbx_Quantity4()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo4"));
					return element;
				}
				public static WebElement txtbx_Cost1()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost1"));
					return element;
				}
				public static WebElement txtbx_Cost2()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost2"));
					return element;
				}
				public static WebElement txtbx_Cost3()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost3"));
					return element;
				}
				public static WebElement txtbx_Cost4()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost4"));
					return element;
				}
				public static WebElement txtbx_Cost5()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost5"));
					return element;
				}
				public static WebElement txtbx_Per1()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer1"));
					return element;
				}
				public static WebElement txtbx_Per2()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer2"));
					return element;
				}
				public static WebElement txtbx_Per3()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer3"));
					return element;
				}
				public static WebElement txtbx_Per4()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer4"));
					return element;
				}
				public static WebElement txtbx_Per5()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer5"));
					return element;
				}
			}
		}
		public static class Paper
		{
			public static WebElement chkbx_LargeFormatMaterial()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_chk_LargeFormatMaterial"));
				return element;
			}
			public static WebElement drpdn_PaperStockType()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlPaperType"));
				return element;
			}
			public static class Sheet
			{
				public static WebElement txtbx_Cost()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtCost"));
					return element;
				}
				public static WebElement txtbx_Per()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPer"));
					return element;
				}
				public static WebElement txtbx_PackedIn()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPackedIn"));
					return element;
				}
				public static WebElement txtbx_PackPrice()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPackedPrice"));
					return element;
				}
				public static WebElement drpdn_SizeOrdered()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlPaperSize"));
					return element;
				}
				public static WebElement chkbx_Custom()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_chkCustom"));
					return element;
				}
				public static WebElement txtbx_PaperHeight()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPaperHeight"));
					return element;
				}
				public static WebElement txtbx_PaperWidth()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPaperWidth"));
					return element;
				}
				public static WebElement txt_CostPerLinearMtrs()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_lblCostperMtrvalue"));
					return element;
				}
				public static WebElement txt_CostPerSqMtrs()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_lblCostPerReel"));
					return element;
				}
				public static WebElement txtbx_BasisWeight()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtBasisWeight"));
					return element;
				}
				public static WebElement drpdn_Coated()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlCoated"));
					return element;
				}
				public static WebElement txtbx_Color()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtColour"));
					return element;
				}
			}
			public static class Roll
			{
				public static WebElement txtbx_Width()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtWebWidth"));
					return element;
				}
				public static WebElement txtbx_Length()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtWebLength"));
					return element;
				}
				public static WebElement txt_CostPerLinearMtrs()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_lblCostperMtrvalue"));
					return element;
				}
				public static WebElement txt_CostPerSqMtrs()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_lblCostPerReel"));
					return element;
				}
				public static WebElement txtbx_BasisWeight()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtBasisWeight"));
					return element;
				}
				public static WebElement drpdn_Coated()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_ddlCoated"));
					return element;
				}
				public static WebElement txtbx_Color()
				{
					WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtColour"));
					return element;
				}
			}
		}
		public static class Plates
		{
			public static WebElement txtbx_Cost()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtCost"));
				return element;
			}
			public static WebElement txtbx_Per()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPer"));
				return element;
			}
			public static WebElement txtbx_PackedIn()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPackedIn"));
				return element;
			}
			public static WebElement txtbx_PackPrice()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPackedPrice"));
				return element;
			}
			public static WebElement txtbx_Height()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPaperHeight"));
				return element;
			}
			public static WebElement txtbx_Width()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_inventoryadd_txtPaperWidth"));
				return element;
			}
		}
		
	}
}