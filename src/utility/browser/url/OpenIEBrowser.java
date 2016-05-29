package utility.browser.url;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.Constant;

public class OpenIEBrowser {

	
    
	public static WebDriver IEBrowser() throws InterruptedException
	
       		{
		
		//System.setProperty("webdriver.ie.driver", "/Users/Troy Tester Machine/Downloads/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", "/SeleniumJars/IEDriverServer.exe");
		
      	   	  WebDriver driver = new InternetExplorerDriver();
      	   	  
      	   	 
      	   	  
      	   	  
       			driver.get(Constant.URL);
       			
       		 
       			
       			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       			
       			driver.manage().window().maximize();
       			//LoginAS.Execute(driver, Constant.Username, Constant.Password);
                   return driver;
                  
       		/*}
       		 
        		{
       			WebDriver driver = new FirefoxDriver();
       			driver.get(Constant.URL);
       			
       			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       			
       			driver.manage().window().maximize();
       			//LoginAS.Execute(driver, Constant.Username, Constant.Password);
       			return driver;*/
       		}
       
}
