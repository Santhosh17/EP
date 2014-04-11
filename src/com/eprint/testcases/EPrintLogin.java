package com.eprint.testcases;
import org.testng.annotations.Test;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.SuperTestNG;
public class EPrintLogin extends SuperTestNG
{
  @Test (groups={"All"})
  public void testLogin() 
  { 
	  EprintSpecificLinks.Version();
	  EprintSpecificLinks.login();
  }
}