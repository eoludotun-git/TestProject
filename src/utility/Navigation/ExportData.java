package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExportData {
	
private static WebElement element = null;
	







//CREATE Export Data
   public static class Nav_To_ExportData {
	   
	   
	   public static  WebElement Click_ExportData(WebDriver driver){
		   	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div[2]/div/div[1]/span/a[1]"));
		     return element;




		   }
		   public static  WebElement Type_Product(WebDriver driver){
			   	 element = driver.findElement(By.xpath("//*[@id='SelectedProduct']"));
			     return element;
		   
		   
		   
			       
			   }
			   public static WebElement Type_FromDate(WebDriver driver){
			  	 element = driver.findElement(By.xpath("//*[@id='From']"));
			       return element;
			       
			   }
			   public static WebElement Type_ToDate(WebDriver driver){
			  	 element = driver.findElement(By.xpath("//*[@id='To']"));
			       return element;
			       
			   }
			   public static WebElement Click_Generate_CsvFILE(WebDriver driver){
			  	 element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/div/div[3]/div/input"));
			       return element;

}}}
