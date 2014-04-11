package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddsheetFedOffsetAutomation {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.1.6/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAddsheetFedOffsetAutomation() throws Exception {
    driver.get(baseUrl + "/eprint_prod_3.8/settings/litho_press_add.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPressName")).sendKeys("Press Name");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDescription")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDescription")).sendKeys("Description");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPress")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoPerfectYes")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoPerfectNo")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgHeight")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgHeight")).sendKeys("0.001");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgHeight")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgHeight")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgWidth")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgWidth")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxSheetWeight")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxSheetWeight")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterDepthHeight")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterDepthHeight")).sendKeys("4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterDepthWidtht")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterDepthWidtht")).sendKeys("5");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterHorizontal")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterHorizontal")).sendKeys("6");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterVertical")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterVertical")).sendKeys("7");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSpoilageSheets")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSpoilageSheets")).sendKeys("8");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRunningSpoilage")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRunningSpoilage")).sendKeys("9");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnDefaultPaper")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPrintSheetSize"))).selectByVisibleText("RA3");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlJobSize"))).selectByVisibleText("RA3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupCharge")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupCharge")).sendKeys("10");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Turn")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Turn")).sendKeys("11");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Tumble")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Tumble")).sendKeys("12");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReady")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReady")).sendKeys("13");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Turn")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Turn")).sendKeys("14");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Tumble")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Tumble")).sendKeys("15");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkMakeReady")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinRunningCharge")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinRunningCharge")).sendKeys("12");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkWashUp")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWashUp")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWashUp")).sendKeys("274");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkUp")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkUp")).sendKeys("42");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtUnitOfMeasure")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtUnitOfMeasure")).sendKeys("57");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnNext")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHourlyCharge")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHourlyCharge")).sendKeys("4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh1")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh2")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh3")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh3")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh4")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh4")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh5")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh5")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm1")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val11")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val11")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val21")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val21")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val31")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val31")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val41")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val41")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val51")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val51")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm2")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val12")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val12")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val22")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val22")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val32")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val32")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val42")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val42")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val52")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val52")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm3")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm3")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val13")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val13")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val23")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val23")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val33")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val33")).sendKeys("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val43")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val43")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val53")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val53")).sendKeys("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdn_Yield")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdn_Matrix")).click();
    driver.findElement(By.id("1")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourunit"))).selectByVisibleText("3");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourNo"))).selectByVisibleText("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDefaultInk")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDefaultInk")).sendKeys("8");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
