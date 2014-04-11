package com.eprint.testcases;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.SuperTestNG;
public class TrialRun extends SuperTestNG
{
  @Test 
  public void testTrialRun() 
  {
	EprintSpecificLinks.login();
	driver.get("http://192.168.1.6/eprint_prod_3.8/Settings/othercost_view.aspx");
	
	
	
	Generic.BlindWait(60);
  }
}