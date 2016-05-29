package utility.browser.url;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constant;



public class OpenChromeBrowser1{
public static  WebDriver ChromeBrowser1()
	
	{

		
	System.setProperty("webdriver.chrome.driver", "/SeleniumJars/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Constant.URL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
       return driver;
}
}