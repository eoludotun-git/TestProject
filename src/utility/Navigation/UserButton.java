package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserButton{
private static WebElement element = null;
	
	//CREATE LABEL CONVERTER 
	   public static class User_Tab{
		   
	       
	         


 public static WebElement Click_User(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[4]/a"));
     return element;
     
 }
 public static WebElement Select_Create(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[4]/ul/li[2]/a"));
     return element;
     
     
 }
 public static WebElement Type_FirstName(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='FirstName']"));
     return element;
     
 }
 public static WebElement Type_LastName(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='LastName']"));
     return element;
     
 }
 public static WebElement Type_Email(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='UserName']"));
     return element;
     
 }
 public static WebElement Type_PhoneNumber(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='PhoneNumber']"));
     return element;
     
 }
 public static WebElement Type_Password(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='Password']"));
     return element;
     
 }
 public static WebElement Type_CofirmPassword(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
     return element;
     
 }
 public static WebElement Type_CompanyName(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id='Company']"));
     return element;
     
 }
 public static WebElement Click_SubmitCreate(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div[10]/div/button"));
     return element;
     
 }
 public static WebElement Click_SignOut(WebDriver driver){
    element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/ul/li[2]/a"));
    return element;
    
 }
 public static WebElement click_Home_Button(WebDriver driver){
    element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[1]/a"));
    return element;
	
	

}
}}

