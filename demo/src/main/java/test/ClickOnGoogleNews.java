package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnGoogleNews {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.co.in/search?q=googlenews&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&ei=jABrWcHKPOHI8Aedo5HgCA#q=google+news&tbm=nws");
		
//		WebElement objGoogleLinks=Driver.findElement(By.);
		List<WebElement>GoogleLinks=Driver.findElements(By.xpath("//div[@id='rso']/div[1]/div/div/div[1]/h3/a"));
		for (int i = 1; i <=GoogleLinks.size(); i++) 
		{
			if (GoogleLinks.get(i).isDisplayed())
			{
				String strLinkName=GoogleLinks.get(i).getText();
				GoogleLinks.get(i).click();
				String strCurrentUrl=Driver.getCurrentUrl();
				System.out.println(strLinkName+"=============="+strCurrentUrl);
				Driver.navigate().back();
			}
//			objGoogleLinks=Driver.findElement(By.xpath("//div[@id='rso']/div[1]/div/div/div[1]/h3"));
			GoogleLinks=Driver.findElements(By.xpath("//div[@id='rso']/div[1]/div/div/div[1]/h3/a"));				
		}
		
		
		
		
	}
}
