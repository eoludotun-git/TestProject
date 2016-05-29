package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchLabelBundle extends BaseClass{
	private static WebElement element;
    public SearchLabelBundle (WebDriver driver){
    	
    	super(driver);
       
             }
    public static class Nav_To_BO_HomeDashBoard{
        public static WebElement Click_NumberOfProduct(WebDriver driver){
             element = null;
             try{
                   element= driver.findElement(By.xpath("//*[@id='CurrentStatistics']/div[2]/div/div/div[1]/a"));
                   System.out.println("# Of Product Selected");
                   }catch (Exception e){
            	   System.out.println("error!!!!");
                   
            	   
                   throw(e);
                   }
               return element;
            }
        
            
  
         public static WebElement Type_FindProduct_ByName(WebDriver driver){
             element = null;
              try{
                  element= driver.findElement(By.xpath("//*[@id='SearchString']"));
                  System.out.println("Find Product By Name is typed");
              }catch (Exception e){
            	  System.out.println("error");
                  throw(e);
                  }
              return element;
            }
         
         
         
    
    
    
    
    public static WebElement Type_FindLot_ByLotIdentifier(WebDriver driver){
        element = null;
         try{
             element= driver.findElement(By.xpath("//*[@id='SearchString']"));
             System.out.println("Find Product_By Lot Identifier is typed");
         }catch (Exception e){
       	  System.out.println("error");
             throw(e);
             }
         return element;
         
         
    }




public static WebElement Type_FindLabelBundle_ByName(WebDriver driver){
element = null;
try{
    element= driver.findElement(By.xpath("//*[@id='SearchString']"));
    System.out.println("Find LabelBundle_ByName is selected");
}catch (Exception e){
	   System.out.println("ERROR!!, something went wrong");
    throw(e);
    }
return element;
}
public static WebElement Click_SearchBox(WebDriver driver){
    element = null;
     try{
         element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/p/input[2]"));
         System.out.println("Your Product search box is clicked");
     }catch (Exception e){
  	   System.out.println("error");
         throw(e);
         }
     return element;
     
}
public static WebElement ClickProduct(WebDriver driver){
    element = null;
     try{
         element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/a"));
         System.out.println("Your Product is clicked");
     }catch (Exception e){
  	   System.out.println("error");
         throw(e);
         }
     return element;
     
}
public static WebElement SelectViewALL(WebDriver driver){
    element = null;
     try{
         element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/ul/li[1]/a"));
         System.out.println("ViewALL is clicked");
     }catch (Exception e){
  	   System.out.println("error");
         throw(e);
         }
     return element;
     
     
}
public static WebElement SelectLabelBUNDLE(WebDriver driver){
    element = null;
     try{
         element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/a[3]"));
         System.out.println("Label BUNDLE is clicked");
     }catch (Exception e){
  	   System.out.println("error");
         throw(e);
         }
     return element;
}

         public static WebElement Type_ProductName(WebDriver driver) throws Exception{
            element = null;
             try{
                 element= driver.findElement(By.xpath("//*[@id='Name']"));
                 System.out.println("great,ProductName Typed");
             }catch (Exception e){
            	  System.out.println("error");
                 throw(e);
                 }
             return element;
            }
         
    

    public static WebElement Click_TotalScans(WebDriver driver) throws Exception{
       element = null;
        try{
            element= driver.findElement(By.xpath("//*[@id='CurrentStatistics']/div[2]/div/div/div[1]/a"));
            System.out.println("Total Scans is clicked");
        }catch (Exception e){
       	  System.out.println("error");
            throw(e);
            }
        return element;
        
 }
         
    

    public static WebElement Click_NegativeFeedBack(WebDriver driver) throws Exception{
       element = null;
        try{
            element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[3]/a"));
            System.out.println("Negative FeedBack is clicked");
        }catch (Exception e){
       	  System.out.println("error");
            throw(e);
            }
        return element;
        
}
         
    

    public static WebElement Click_ViewAllRecent_NegativeFeedBack(WebDriver driver) throws Exception{
       element = null;
        try{
            element= driver.findElement(By.xpath("//*[@id='FbNeg']/div/div/div[1]/span/a"));
            System.out.println("Recent Negative FeedBack is clicked");
        }catch (Exception e){
       	  System.out.println("error");
            throw(e);
            }
        return element;
        
        

        
}
         
    

    public static WebElement Click_ViewDetail_RecentNegativeFeedBack(WebDriver driver) throws Exception{
       element = null;
        try{
            element= driver.findElement(By.xpath("//*[@id='FbNeg']/div/div/div[2]/div/table/tbody/tr/td/a/span"));
            System.out.println("Recent Negative FeedBack is clicked");
        }catch (Exception e){
       	  System.out.println("error");
            throw(e);
            }
        return element;
    }
    
    
	        }
	 
         
         
}
