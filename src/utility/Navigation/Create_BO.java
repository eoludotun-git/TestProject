package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_BO {
private static WebElement element = null;
	
	//CREATE BRAND OWNER
	   public static class BrandOwner{
		   
	       
	         


 public static WebElement click_BO(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/a"));
     return element;
     }
 public static WebElement Select_Create(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a"));
     return element;
   
     
 }
 public static WebElement Type_Email(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='PrimaryEmail']"));
     return element;
     
     
 }
 public static WebElement Type_CompanyName(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='Name']"));
     return element;
     
 }
 public static WebElement Type_Address(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='AddressLine1']"));
     return element;
     
     
     
 }
 public static WebElement Type_City(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='City']"));
     return element;
     }
 public static WebElement Type_State(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='State']"));
     return element;
     
 }
public static WebElement Type_ZipCode(WebDriver driver){
   element = driver.findElement(By.xpath("//*[@id='PostalCode']"));
   return element;
   
   
}
public static WebElement Type_Phone(WebDriver driver){
   element = driver.findElement(By.xpath("//*[@id='ContactPhone']"));
   return element;
   
   
}
public static WebElement Type_Country(WebDriver driver){
   element = driver.findElement(By.xpath("//*[@id='Country']"));
   return element;
}
   public static WebElement Click_CreateBO_Button (WebDriver driver){
	   element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div/div[11]/div/input"));
	   return element;
	   
	   
   }
   public static WebElement Click_SkipImageUpLoad_Button(WebDriver driver){
	   element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/div/div[2]/a"));
	   return element;
   
}
public static WebElement click_SignOut(WebDriver driver){
   element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/ul/li[2]/a"));
   return element;
   
}
public static WebElement click_Home_Buttont(WebDriver driver){
   element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[1]/a"));
   return element;
   

   
   
  
  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   }}
	   }

