package utility.browser.url;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;

public class BrowserPage {
	public static WebDriver OpenFirefoxBrowser()
	
	{

		
   	  WebDriver driver = new FirefoxDriver();
		driver.get(Constant.URL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
       return driver;
}
	
public static WebDriver OpenChromeBrowser()
	
	{

		
	System.setProperty("webdriver.chrome.driver", "/SeleniumJars/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Constant.URL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
       return driver;
}
}