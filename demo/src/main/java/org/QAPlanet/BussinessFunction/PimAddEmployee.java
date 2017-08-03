package org.QAPlanet.BussinessFunction;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.QAPlanet.LIB.CommonMethods;



public class PimAddEmployee {

	public static String strCode;	
	CommonMethods browser;
	public PimAddEmployee(CommonMethods br) 
	{
		browser=br;
	}


	Properties locators=new Properties();
							
	File locFile=new File("D:\\workspace\\demo\\src\\main\\java\\elementLocatorFile\\AddEmployee.properties");
	
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
	
	
//	https://www.codeproject.com/Articles/1109000/Create-Hybrid-Test-Framework-Selenium-Driver-Imple
	
	public void AddEmployee(String strCode, String strLastName, String strFirstName)
	{
//		String strPim=locators.getProperty("Pim.link"); 
//		String strPimAddEmployee=locators.getProperty("pim.AddEmployee.link");
//		String strFrameID=locators.getProperty("frame.ID");
//		String strEmployeeCode=locators.getProperty("code.ID");
//		String strLN=locators.getProperty("LastName.TextField.Id");
//		String strFN=locators.getProperty("FirstName.TextFeild.ID");
//		String strSaveButton=locators.getProperty("Save.Button.ID");
//		String strPimEmployeeList=locators.getProperty("pim.EmployeeList.link");
		
		
		try 
		{
			browser.moveToElement("xpath", "//span[text()='PIM']");
			
			browser.verifyElementPresent("xpath", "//span[text()='PIM']");
			
			browser.moveToElement("xpath", "//span[text()='Add Employee']");
			
			browser.verifyElementPresent("xpath", "//span[text()='Add Employee']");
			
			browser.clickOnWebElemets("xpath", "//span[text()='Add Employee']");
			
			
			browser.waitForPageLoad();
			browser.switchToFrameByID("rightMenu");
			browser.getAttributeMethod("id", "txtEmployeeId","txtEmployeeId");
					
			
//			 Change the locators
					
			browser.verifyElementPresent("id", "txtEmpLastName");
			browser.verifyElementPresent("id", "txtEmpFirstName");
			browser.verifyElementPresent("id", "btnEdit");
			
			browser.clickOnWebElemets("id", "btnEdit");
			browser.alertPopUpMessage("Last Name Empty!");
			
			browser.clearTextFeild("id", "txtEmpLastName");
			browser.sendKeys("id", "txtEmpLastName", strLastName);
			browser.clickOnWebElemets("id", "btnEdit");
			browser.alertPopUpMessage("First Name Empty!");
			
			browser.waitForPageLoad();
//			browser.clickOnWebElemets("id", "txtEmpFirstName");
//			browser.clearTextFeild("id", "txtEmpFirstName");
//			browser.sendKeys("id", "txtEmpFirstName", strFirstName);
//			browser.clickOnWebElemets("id", "btnEdit");
			
			browser.sendkeysOnActions("id", "txtEmpFirstName", strFirstName);
			browser.clickOnWebElemets("id", "btnEdit");
			
			browser.waitForPageLoad();
			browser.switchToDefaultContent();
			browser.moveToElement("xpath", "//span[text()='PIM']");
			
//			
			browser.moveToElement("xpath", "//span[text()='Employee List']");
			browser.verifyElementPresent("xpath", "//span[text()='Employee List']");
			browser.clickOnWebElemets("xpath", "//span[text()='Employee List']");
			

			int i = 1;
			//			browser.verifyElementInTable(strXpathLocator, strText);(strXpath);
			browser.getTableData("//table[@class='data-table']/tbody/tr/td","//table[@class='data-table']/tbody/tr["+i+"]/td[2]","//table[@class='data-table']/tbody/tr["+i+"]/td[3]", strCode, strFirstName, strLastName);
//			
//			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	

}
