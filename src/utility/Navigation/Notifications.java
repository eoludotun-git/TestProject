package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Notifications {
	
	
private static WebElement element = null;
	
	//CREATE Notifications
	   public static class Nav_To_Notification{
		   
	       
	         


 public static WebElement click_Notifications(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[6]/a"));
     return element;
     }
 public static WebElement Select_Create(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[6]/ul/li[2]/a"));
     return element;
   
     
 }
 public static WebElement Type_CompanyID(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='CompanyId']"));
     return element;
     
     
 }
 public static WebElement Type_ExpiresUTC(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='Expiration']"));
     return element;
     
 }
 public static WebElement Type_Notification(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='Notification']"));
     return element;
     
     
 }
 public static WebElement Type_CreatedDate(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='TimeStamp']"));
     return element;
     
 }
 public static WebElement Type_Severity(WebDriver driver){
     element = driver.findElement(By.xpath("//*[@id='Severity']"));
     return element;
     
 }
 public static WebElement Click_SubmitButton(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div/div[6]/div/input"));
     return element;
     
     
     
     
     
     
     
     
     
     
     
     

}}

}
