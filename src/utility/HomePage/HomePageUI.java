package utility.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUI {
	private static WebElement element = null;
	  
	  public static WebElement Click_Home(WebDriver driver){
	     element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[1]/a"));
	     return element;
	     }
	  
	  public static WebElement click_SignOut(WebDriver driver){
	     element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/ul/li[2]/a"));
	  return element;
	  
}
	  
	  public static WebElement Click_About_Troy(WebDriver driver){
	     element = driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/ul/li[1]/a"));
	  return element;
	  }
	  
	  public static WebElement Click_About_TROY_Track_and_Trace(WebDriver driver){
		     element = driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/ul/li[2]/a"));
		  return element;
		  
}
	  
	  public static WebElement Click_Frequently_Asked_Questions(WebDriver driver){
		     element = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/ul/li[1]/a"));
		  return element;
	     
	
} 
	  // Legal
	  
	  public static WebElement Click_Terms_of_Use(WebDriver driver){
		     element = driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/ul/li[1]/a"));
		  return element;
}
	  
	  public static WebElement Click_Privacy_Policy(WebDriver driver){
		     element = driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/ul/li[2]/a"));
		  return element;
	  


	  
	  
	 

	  
	  
	  
	  //Ask questions
	  
}
			  
			  public static WebElement Click_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/ul/li[2]/a"));
			     return element;
			     }
			  
			  public static WebElement Type_FirstName_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='FirstName']"));
			  return element;
			  
}
			  
			  public static WebElement Type_LastName_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='LastName']"));
			  return element;
			  
}
			  
			  public static WebElement Type_Company_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='Company']"));
			  return element;
			  
}
			  
			  public static WebElement Type_Address_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='Address']"));
			  return element;

}
			  
			  public static WebElement Type_City_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='City']"));
			  return element;
			  
			  
			  
}
			  
			  public static WebElement Type_State_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='State']"));
			  return element;
			  
}
			  
			  public static WebElement Type_ZipCode_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='PostalCode']"));
			  return element;
			  

			  
			  
}
			  
			  public static WebElement Type_Phone_NUmber_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='Phone']"));
			  return element;
			  
}
			  
			  public static WebElement Type_Email_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='Email']"));
			  return element;
			  
			  
}
			  
			  public static WebElement Type_Product_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='Product']"));
			  return element;
			  
			  
}
			  
			  public static WebElement Type_Problem_Description_To_Ask_Questions(WebDriver driver){
			     element = driver.findElement(By.xpath("//*[@id='Description']"));
			  return element;
			  
			  }
			  public static WebElement Click_Submit_Report_Request(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[2]/form/div/div[12]/div/input"));
				  return element;
			  }
			  public static WebElement Click_AllProducts(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div/button[2]"));
				  return element;
				  
			  }
			  public static WebElement SelectYourProduct(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div/ul/li[2]/a"));
				  return element;
			  }
			  public static WebElement Click_Lots(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[2]/button[2]"));
				  return element;
			  }
			  public static WebElement Select_YourLots1(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[2]/ul/li[1]/a"));
				  return element;  
			  }
			  public static WebElement Select_YourLots2(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[2]/ul/li[2]/a"));
				  return element;
			
				  
			  }
			  public static WebElement Select_AllProducts(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[1]/ul/li[1]/a"));
				  return element;
			  
			  }
			  public static WebElement Click_RecentFeedBack_Nagative(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='FbNeg']/div/div/div[1]/span/a"));
				  return element;
			  }
			  public static WebElement Click_ToView_AllCustomerFeedBack_DETAIL(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[1]/p/a"));
				  return element;
			  }
			  public static WebElement Select_AllLots(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[2]/ul/li[1]/a"));
				  return element;
				  
			  }
			  public static WebElement click_ToView_LotsStatus(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/a/div[2]"));
				  return element;
				  
			  }
			  public static WebElement click_View_NumberOf_Product(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/a"));
				  return element;
			  }
			  public static WebElement click_ToView_TotalScans(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/a/div[1]"));
				  return element;
			  }
			  public static WebElement click_ToView_NegativeFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[3]/a"));
				  return element;
			  }
			  public static WebElement click_ToView_PositiveFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[4]/a"));
				  return element;
			  }
			  public static WebElement Click_AllRecentNegativeFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='FbNeg']/div/div/div[1]/span/a"));
				  return element;
				  
			  }
			  public static WebElement Click_AllRecentPositiveFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='FbPos']/div/div/div[1]/span/a"));
				  return element;
				  
			  }
			  public static WebElement Click_ToEmailPositiveFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[1]/a"));
				  return element;
				  
			  }
			  public static WebElement Click_ToViewDetail_RecentPositiveFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='FbPos']/div/div/div[2]/div/table/tbody/tr/td/a/span"));
				  return element;
			  }
			  public static WebElement Click_ToViewDetail_RecentNagetiveFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='FbNeg']/div/div/div[2]/div/table/tbody/tr/td/a/span"));
				  return element;
				  
			  }
			  public static WebElement click_ToView_FeedBackBYCategory1 (WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[1]/a"));
				  return element;
				  
			  }
			  public static WebElement click_ToView_FeedBackBYCategory2(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[2]/a"));
				  return element;
				  
			  }
			  public static WebElement click_DETAIL_ForEachFeedBack(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/a"));
				  return element;
			  }
			  public static WebElement click_ToView_FeedBackBYCategory3(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[3]/a"));
				  return element;
				  
			  }
			  public static WebElement Click_Recent_FeedBack_Positive(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='Fb3']/div/div/div[1]/span/a"));
				  return element;
			  }
			  public static WebElement click_ToView_FeedBackBYCategory4(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[4]/a"));
				  return element;
				  
			  }
			  public static WebElement click_ToView_FeedBackBYCategory5(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[5]/a"));
				  return element;
				  
			  }
			  public static WebElement click_ToViewMoreMAP(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div[1]/div/div[1]/span/a"));
				  return element;
				  
			  }
			  public static WebElement click_To_ViewALL_ScanHistory(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[3]/div[2]/div/div[1]/span/a[2]"));
				  return element;
				  
			  }
			  public static WebElement click_To_ViewLast30Days(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[1]/span/a[1]"));
				  return element;
				  
			  }
			  public static WebElement click_To_ViewLast7Days(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[1]/span/a[1]"));
				  return element;
				  
			  }
			  public static WebElement click_To_ViewYearToDate(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div/div/div[1]/span/a[2]"));
				  return element;
				  
				  
			  }
			  public static WebElement click_To_ViewFeedBack_1_DETAIL(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='Fb1']/div/div/div[2]/div/table/tbody/tr[2]/td/a/span"));
				  return element;
				  
				  
			  }
			  public static WebElement click_To_ViewFeedBack_2_DETAIL(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='FbAll']/div/div/div[2]/div/table/tbody/tr[2]/td/a/span"));
				  return element;
				  
			  }
			  public static WebElement click_To_ReplyToCustomer(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[3]/div/div[6]/div[2]/a"));
				  return element;
				  
			  }
			  public static WebElement click_Name(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/ul/li[1]/a"));
				  return element;
				  
			  }
			  public static WebElement click_ChangeYourPassword(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/a"));
				  return element;
			  }
			  public static WebElement click_ChangePhoneNumber(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/a[1]"));
				  return element;
				  
			  }
			  public static WebElement Type_PhoneNumber_ToSendVerificationCode(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='Number']"));
				  return element;
				  
			  }
			  public static WebElement Type_YourCurrentPassword(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='OldPassword']"));
				  return element;
				  
			  }
			  public static WebElement Type_YourNewPassword(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='NewPassword']"));
				  return element;
				  
			  }
			  public static WebElement Type_ConfirmYourNewPassword(WebDriver driver){
				     element = driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
				  return element;
				  
			  }
			  public static WebElement Click_ChangePassWord(WebDriver driver){
				     element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/div[5]/div/input"));
				  return element;
				  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
}}


