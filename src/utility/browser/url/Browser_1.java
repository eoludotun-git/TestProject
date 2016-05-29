package utility.browser.url;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;
import utility.LoginAS.LoginAS;

public class Browser_1 {
	//public static void OpenChrome_AS_TroyAdmin(){
			/*//GetWebDriver
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Troy Tester Machine\\Downloads\\ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get(Constant.URL);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			//LoginAS.Execute(driver, Constant.Username, Constant.Password);
	*/
		
		
		public static WebDriver  ChromeBrowser(int x)
		{
			if(x == 1)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Troy Tester Machine\\Downloads\\ChromeDriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(Constant.URL);
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				//LoginAS.Execute(driver, Constant.Username, Constant.Password);
	            return driver;
	           
			}
			 else
	 		{
				WebDriver driver = new FirefoxDriver();
				driver.get(Constant.URL);
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				//LoginAS.Execute(driver, Constant.Username, Constant.Password);
				return driver;
			}
	}
	public static void OpenChrome_AS_BrandOwner(){
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Troy Tester Machine\\Downloads\\ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(Constant.URL);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			LoginAS.Execute(driver, Constant.Username_B, Constant.Password_B);
			
	}
	public static void OpenFirefox_AS_BrandOwner(){
			
			
			
			WebDriver driver = new FirefoxDriver();
			driver.get(Constant.URL);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			LoginAS.Execute(driver, Constant.Username_B, Constant.Password_B);
		
	}}

