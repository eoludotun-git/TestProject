package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MichaelBase 
{
	
   private WebDriver _driver =  null;
   //private WebElement element = null;
   
   public MichaelBase()
   {
   }

  public WebDriver getDriver() {
	return _driver;
  }

  public void setDriver(WebDriver _driver) {
	this._driver = _driver;
  }
   
   protected WebElement getElementByXpath(String xPath) throws Exception
   {
	   try
	   {
	      return _driver.findElement(By.xpath(xPath));
	   }
	   catch(Exception ex)
	   {
           System.out.println("error");
           throw(ex);
	   }
   }
}
