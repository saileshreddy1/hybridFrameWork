package org.QAPlanet.TestScripts;

import org.QAPlanet.BussinessFunction.LoginToOrangeHRM;
import org.testng.annotations.Test;

public class TC1_LoginToOrangeHRM extends RootTest {

	
	public static LoginToOrangeHRM login=new LoginToOrangeHRM(brow); 
	
	@Test
	public static void verifyOrangeHRMApplication()
	{
		brow.configDriver("Chrome");
		brow.verifyTitle("OrangeHRM - New Level of HR Management");		
		login.setUp();
		login.loginToApplication("qaplanet1", "user1");
		brow.verifyTitle("OrangeHRM");
		login.verifyElementsInOrageHRMDashBoard();		
		login.logout();
		brow.closeBrowser();
		brow.QuitBrowser();
	}
}
