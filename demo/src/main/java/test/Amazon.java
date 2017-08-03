package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		WebElement Nar=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(Nar).perform();
		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		WebElement Nar1=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		Actions b=new Actions(driver);
		b.moveToElement(Nar1).perform();
		driver.findElement(By.xpath(".//*[@id='nav-item-signout']/span")).click();
		driver.quit();
		driver.close();
		
		

	}

}
