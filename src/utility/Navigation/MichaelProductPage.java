package utility.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MichaelProductPage extends MichaelBase
{
   public MichaelProductPage(WebDriver driver)
   {
	   this.setDriver(driver);
   }
   
   
       public WebElement click_Product() throws Exception
       {
    	   return this.getElementByXpath("html/body/div[2]/div/div/div/ul/li[3]/a");
       }
       
    
        public WebElement Select_Create() throws Exception
        {
        	return this.getElementByXpath("html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a");
        }
        

        public WebElement Type_ProductName() throws Exception
        {
        	return this.getElementByXpath("//*[@id='Name']");
        }
}
