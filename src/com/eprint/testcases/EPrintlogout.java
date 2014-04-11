package com.eprint.testcases;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.SuperTestNG;
public class EPrintlogout extends SuperTestNG
{
  @Test (groups={"All"})
  public void testLogout() 
  {
	  EprintSpecificLinks.logout();
  }
}