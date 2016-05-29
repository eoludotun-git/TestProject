package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CampaignPage {
	
	private static WebElement element = null;
	
	public static class Nav_To_Campaign
	{
		public static WebElement click_Product(WebDriver driver){
            element = null;
            try{
                  element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/a"));
                  System.out.println("Product Selected");
                  }catch (Exception e){
           	   System.out.println("error!!!!");
                  
           	   
                  throw(e);
                  }
              return element;
           }
		
		
	}

}
