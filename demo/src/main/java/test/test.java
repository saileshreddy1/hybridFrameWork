package test;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	
	// Now set the cookie. This one's valid for the entire domain
	Cookie cookie = new Cookie("key", "value");
	driver.manage().addCookie(cookie);

	// And now output all the available cookies for the current URL
	Set<Cookie> allCookies = driver.manage().getCookies();
//	for (Cookie loadedCookie : allCookies) {
//	    System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
//	}

	for (int i = 0; i < allCookies.size(); i++)
	{
		System.out.println(allCookies);
		
	}
	// You can delete cookies in 3 ways
	// By name
	driver.manage().deleteCookieNamed("CookieName");
	
	// By Cookie

	// Or all of them
	driver.manage().deleteAllCookies();
	
	System.out.println("After deleting cookies");
	System.out.println(driver.manage().getCookies());
	  

	
	
}

}
