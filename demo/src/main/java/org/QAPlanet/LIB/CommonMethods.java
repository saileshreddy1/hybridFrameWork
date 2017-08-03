package org.QAPlanet.LIB;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CommonMethods {

	 WebDriver Driver;
	 WebDriverWait wait;
	 Actions action;
	 Alert alert;
//	
//	To Launch Browser
//
	 public void configDriver(String strBrowser)
	 {
		if (strBrowser.equals("Firefox")) 
		{
			try 
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.16.1-win32\\geckodriver.exe");
				Driver=new FirefoxDriver();
				Driver.manage().window().maximize();
				Reporter.log("FirefoxDriver launched To Automate TestCases");
				Driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		else if (strBrowser.equals("IE")) 
		{
			try 
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\Downloads\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
				Driver=new InternetExplorerDriver();
				Driver.manage().window().maximize();
				Reporter.log("IEDriver launched To Automate TestCases");
				Driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		else if (strBrowser.equals("Chrome"))
		{
			try 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lab\\Downloads\\chromedriver_win32\\chromedriver.exe");
				Driver=new ChromeDriver();
				Driver.manage().window().maximize();
				Reporter.log("ChromeDriver launched To Automate TestCases");
				Driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			Reporter.log("Invalid Driver Passed");
		}
				
	}
	
	public WebElement webElementLocator(String strIdentifier, String strLocator)
	{
		WebElement e=null;
//		WebElement ele=Driver.findElement(By.xpath(""));
		switch(strIdentifier)
		{
		case "id":
			e=Driver.findElement(By.id(strLocator));
			break;
		
		case "name":
			e=Driver.findElement(By.name(strLocator));
			break;
			
		case "className":
			e=Driver.findElement(By.className(strLocator));
			break;
			
		case "tagName":
			e=Driver.findElement(By.tagName(strLocator));
			break;
			
		case "linkText":
			e=Driver.findElement(By.linkText(strLocator));
			break;
			
		case "partialLinkText":
			e=Driver.findElement(By.partialLinkText(strLocator));
			break;
			
		case "xpath":
			e=Driver.findElement(By.xpath(strLocator));
			break;
			
		case "cssSelector":
			e=Driver.findElement(By.cssSelector(strLocator));
			break;
		
		default :
			Reporter.log("Locator Not Found");
			e=null;
			
		}
		return e;
	}
	
//
//	To Send Text in Text box fields
//	
	public void sendKeys(String stridentifier, String strLocator,String strContent)
	{
		WebElement e=webElementLocator(stridentifier, strLocator);
		e.sendKeys(strContent);
	}
	
//	
//	To Clear text in Text box Feilds
//	
	
	public void clearTextFeild(String stridentifier, String strLocator)
	{
		WebElement e=webElementLocator(stridentifier, strLocator);
		e.clear();
		
	}

//	
//	To Click on Buttons,Links,Check Boxes, RadioButtons etc
//
	public void clickOnWebElemets(String stridentifier, String strLocator)
	{
		WebElement e=webElementLocator(stridentifier, strLocator);
		e.click();
	}
	
//
//	To verify the page title 
//	
	public void verifyTitle(String strTitle)
	{
		if (Driver.getTitle().equals(strTitle))
		{
			Reporter.log(strTitle+" displayed");			
		}
		else
		{
			Reporter.log("Failed to displayed ditle "+strTitle);
			return;
		}
	}
	
//	
//		Wait until element Present
//	
	
	public void waitUntilElementPresent(String strLocator) 
	{
//		WebElement elementPresent=(new WebDriverWait(Driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(strLocator)));
		
			
	 wait=new WebDriverWait(Driver, 10);
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(strLocator)));
		

	}
	
//	
//		Verify the text
//	
	public void verifyText(String stridentifier,String strLocator,String strText)
	{
		WebElement e=webElementLocator(stridentifier, strLocator);
		if (e.getText().equals(strText))
		{
			
			Reporter.log(strText+" displayed");
			
		}
		else
		{
			Reporter.log(strText+" not displayed");
		}
		
	}
	
//	
//	Verify element present
//	
	
	public void verifyElementPresent(String stridentifier, String strLocator)
	{
		WebElement e=webElementLocator(stridentifier, strLocator);
		if (e.isDisplayed())
		{
			Reporter.log(e.getText()+" is displayed");
		}
		else
		{
			Reporter.log(e.getText()+" is not displayed");
			return;
		}
		
	}
	
//	
//		Thread.sleep
//	
	public void sleepThread(long sleepTime)
	{
		try
		{
			Thread.sleep(sleepTime);
		}
		catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	
//	
//		Wait For Page To Load
//	
	
	public void waitForPageLoad()
	{
		try 
		{
			for (int i = 0; i < 50;) 
			{
				if(Driver.getTitle().length()!=0 )
				{
					Reporter.log("Page Loaded");
					i=51;
					break;

				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	
//	
//	SwitchTo By Frame ID
//	
	
	public void  switchToFrameByID(String strLocator)
	{
		Driver.switchTo().frame(strLocator);
	}
	
//	
//	Switch To Default Content
//	
	
	public void switchToDefaultContent()
	{
		Driver.switchTo().defaultContent();
	}
	
//
//	 Getting Data from table and verifying with required text
//	
	
	public void verifyElementInTable(String strXpathLocator,String strText)
	{
		
		boolean bln=false;
		
		List<WebElement>objTableList=Driver.findElements(By.xpath(strXpathLocator));
		for(WebElement ele:objTableList)
		{
			if (ele.getText().equals(strText))
			{
				bln=true;
				break;
			}
			
		}
		if (bln==true)
		{
			Reporter.log(strText+" was identified");
		}
		else
		{
			Reporter.log(strText+" was not identified");
		}
	}
	
	
	 
	
//	
//		Actions class: move To Element
//	
	public void moveToElement(String strIdentifier,String strLocator)
	{
		action=new Actions(Driver);
		WebElement e=webElementLocator(strIdentifier, strLocator);
		action.moveToElement(e).build().perform();
	}
	
	
	public void getTextFormWebElement(String strIdentifier,String strLocator, String strWelcome, String strUserName)
	{
		WebElement e=webElementLocator(strIdentifier, strLocator);
		e.getText();
		
		if (e.getText().equals(strWelcome+" "+strUserName)) 
		{
			Reporter.log("Welcome text verified with username");
			
		}
		else
		{
			Reporter.log("Welcome text not verified with username");
		}
	}
	
	public void FindMultipleElements(String strXpath)
	{
		List<WebElement>mulEle=Driver.findElements(By.xpath(strXpath));
		for (int i = 1; i <=mulEle.size(); i++)
		{
			if (mulEle.get(i).isDisplayed())
			{
				Reporter.log(mulEle.get(i).getText()+" is displayed");
				
			}
			else
			{
				Reporter.log(mulEle.get(i).getText()+" is not displayed");
			}
			
		}
	}
	
//	
//	To get attribute value
//	
	public void getAttributeMethod(String strIdentifier, String strLocator, String strCode)
	{
		WebElement e=webElementLocator(strIdentifier, strLocator);
		e.getAttribute(strCode);
		
	}
	
//	
//	To handle alerts
//	
	public void alertPopUpMessage(String strAlertMessage)
	{
		wait=new WebDriverWait(Driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		alert=Driver.switchTo().alert();
		if (alert.getText().equals(strAlertMessage))
		{
			Reporter.log(strAlertMessage+" alert is displayed");
			alert.accept();
		}
		else
		{
			Reporter.log("No alert present");
		}
		
	}
	
	
	public void sendkeysOnActions(String strIdentifier, String strLocator,String strActionText)
	{
		action=new Actions(Driver);
		WebElement ele=webElementLocator(strIdentifier, strLocator);
		action.moveToElement(ele).sendKeys(strActionText).build().perform();
	}
	
public void getTableData(String strTableXpath,String strEmployeeIDXpath, String strEmployeeNameXpath,String strCode, String strFirstName, String strLastName)
{
	int iRc=Driver.findElements(By.xpath(strTableXpath)).size();
	for(int i=1; i<=iRc; i++)
	{	
		String strEmployeeID=Driver.findElement(By.xpath(strEmployeeIDXpath)).getText();
		String strEmployeeName=Driver.findElement(By.xpath(strEmployeeNameXpath)).getText();
		
		if (strEmployeeID.equals(strCode) && strEmployeeName.equals(strFirstName+" "+strLastName))
		{
			System.out.println(strEmployeeID +" "+strEmployeeName + " is displayed at "+i);
			break;
		}
	
	}
}
	
//	
//	close
//	
	
	public void closeBrowser()
	{
		Driver.close();
	}
	
//	
// Quit
//	
	
	public void QuitBrowser()
	{
		Driver.quit();
	}


	
	
}
