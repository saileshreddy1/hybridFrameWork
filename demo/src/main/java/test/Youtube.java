package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("");
        driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='grid-077471']/li[1]/div/div[1]/div[2]/h3/a")).click();
        
        
        
	}

}
