package utility.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLoginIn {
	
	private static WebElement element = null;

	public static WebElement click_UserName(WebDriver driver){
	     element = driver.findElement(By.xpath("//*[@id='UserName']"));
	     return element;
	     }
	 public static WebElement click_Password(WebDriver driver){
	     element = driver.findElement(By.xpath("//*[@id='Password']"));
	     return element;
	     
	 }
	 public static WebElement click_remmeber_Me_Button(WebDriver driver){
	     element = driver.findElement(By.xpath("//*[@id='RememberMe']"));
	     return element;
	     }
	 public static WebElement click_LogIn(WebDriver driver){
	     element = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/form/div[2]/button"));
	     return element;
	     }
	}



