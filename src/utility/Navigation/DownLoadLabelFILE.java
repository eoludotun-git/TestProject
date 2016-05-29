package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownLoadLabelFILE {
	
private static WebElement element = null;
	
	//CREATE Notifications
	   public static class Nav_To_DownLoads{
		   
	       
	         


 public static WebElement Click_On_BO_DownLoads(WebDriver driver){
	 element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[4]/a"));
     return element;
 }
 public static WebElement Click_On_LC_DownLoads(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[2]/a"));
     return element;
     }
 public static WebElement Select_DownLoads_FILE_1(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/a"));
     return element;
   
     
 }
 public static WebElement Select_DownLoads_FILE_2(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/a"));
     return element;
     
 }
 public static WebElement Select_DownLoads_FILE_3(WebDriver driver){
     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/a"));
     return element;

}}}