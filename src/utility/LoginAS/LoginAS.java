package utility.LoginAS;

import org.openqa.selenium.WebDriver;

import utility.HomePage.HomePageLoginIn;

public class LoginAS {
	 // Pass Arguments (Username and Password) as string
    public static void Execute(WebDriver driver,String sUsername, String sPassword){
    	//HomePageUI._MyAccount(driver).click();
       // Enter sUsername variable in place of hardcoded value
       HomePageLoginIn.click_UserName(driver).sendKeys(sUsername);
       // Enter sPassword variable in place of hardcoded value
       HomePageLoginIn.click_Password(driver).sendKeys(sPassword);
       HomePageLoginIn.click_remmeber_Me_Button(driver).click();
       HomePageLoginIn.click_LogIn(driver).click();
       }
}

	

