package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
       if (d.getTitle().equals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"))
       {
		System.out.println("Title displayed");
	   }
       else 
       {
		System.out.println("page not found");
	   }
        
       WebElement Electronics=d.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
       Actions a=new Actions(d);
       a.moveToElement(Electronics).perform();
       d.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span")).click();
       
       
	}

}
