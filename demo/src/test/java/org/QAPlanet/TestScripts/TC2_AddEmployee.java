package org.QAPlanet.TestScripts;

import org.QAPlanet.BussinessFunction.LoginToOrangeHRM;
import org.QAPlanet.BussinessFunction.PimAddEmployee;
import org.testng.annotations.Test;

public class TC2_AddEmployee extends RootTest {
	
public static LoginToOrangeHRM login=new LoginToOrangeHRM(brow); 

public static PimAddEmployee addEmployee=new PimAddEmployee(brow);
	
	@Test
	public static void verifyOrangeHRMApplication()
	{
		brow.configDriver("Chrome");
		brow.verifyTitle("OrangeHRM - New Level of HR Management");		
		login.setUp();
		login.loginToApplication("qaplanet1", "user1");
		brow.verifyTitle("OrangeHRM");
		
		addEmployee.AddEmployee("value","Tendulkar", "Sachin");
		
		
		
//		login.logout();
//		brow.closeBrowser();
//		brow.QuitBrowser();
	}
	

}
