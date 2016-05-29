package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddLabelConverter {
	
private static WebElement element = null;
	
	//CREATE LABEL CONVERTER 
	   public static class Nav_To_MY_LabelConverters{
		   
	       
	         


 public static WebElement click_LABEL_CONVERTER(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[2]/a"));
     return element;
     
 }
 public static WebElement Select_ViewAll(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[2]/ul/li/a"));
     return element;
     
 }
 public static WebElement Click_Add(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/p/a"));
     return element;
     
 }
 public static WebElement SelectAdd_My_LabelConverters (WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[4]/input"));
     return element;
 }
 public static WebElement Click_Save (WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/div/div/div/input"));
     return element;
     
     
 }
 public static WebElement Click_Remove (WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr/td[5]/a"));
     return element;

}
}}