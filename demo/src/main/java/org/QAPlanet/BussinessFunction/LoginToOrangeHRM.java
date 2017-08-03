package org.QAPlanet.BussinessFunction;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.QAPlanet.LIB.CommonMethods;

public class LoginToOrangeHRM {
	
	
//	constructor with one argument.
	
	CommonMethods browser;
	public LoginToOrangeHRM(CommonMethods br) {
		
		browser=br;
	}


	Properties locators=new Properties();
	File locFile=new File("D:\\workspace\\demo\\src\\main\\java\\elementLocatorFile\\Locators.properties");
	
//	
//	Setup for properties file
//	
	public void setUp() 
	{
		try 
		{
			locators.load(new FileInputStream(locFile));	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	
//	
//	Login To Application
//	
	
	public void loginToApplication(String strUserName, String strPassword)
	{
		String strUserNameLoc=locators.getProperty("userName.TextFeild.Locator");
		String strPasswordLoc=locators.getProperty("Password.TextFeild.Locator");
		String strLoginLoc=locators.getProperty("login.Button.Locator");
		String strClearLoc=locators.getProperty("clear.Button.Locator");
		
//		
//		Verify element present
		browser.verifyElementPresent("name", strUserNameLoc);
		browser.verifyElementPresent("name", strPasswordLoc);
		browser.verifyElementPresent("name", strLoginLoc);
		browser.verifyElementPresent("name", strClearLoc);
		
//		
//		Clear data in text field
		browser.clearTextFeild("name", strUserNameLoc);
		browser.clearTextFeild("name", strPasswordLoc);
		
//		
//		Enter the text in text field
		browser.sendKeys("name", strUserNameLoc, strUserName);
		browser.sendKeys("name", strPasswordLoc, strPassword);
		
//		
//		Click on Login Button
		browser.clickOnWebElemets("name", strLoginLoc);
//
//		Waiting up to loading the page	
		browser.waitForPageLoad();
	}
	
	public void verifyElementsInOrageHRMDashBoard()
	{
		String strWelcomeUserName=locators.getProperty("welcome.userName");
		String strChangePassword=locators.getProperty("ChangePassword.LinkText");
		String strXpath=locators.getProperty("logout.link.locator");
		browser.getTextFormWebElement("xpath", strWelcomeUserName, "Welcome", "qaplanet1");
		browser.verifyElementPresent("linkText", strChangePassword);
		browser.verifyElementPresent("xpath", strXpath);
	}
	
	public void logout()
	{
		String strLogoutLoc=locators.getProperty("logout.link.locator");
		browser.switchToDefaultContent();
		browser.clickOnWebElemets("xpath", strLogoutLoc);
	}
	
	
	

	

}
