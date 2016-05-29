package utility.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LabelPage extends BaseClass {
	private static WebElement element;
    public LabelPage (WebDriver driver){
        super(driver);
       
             }
    public static class Nav_To_Product{
        public static WebElement click_Product(WebDriver driver){
             element = null;
             try{
                   element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/a"));
                   System.out.println("Product Selected");
                   }catch (Exception e){
            	   System.out.println("error!!!!");
                   
            	   
                   throw(e);
                   }
               return element;
            }
        
            
  
         public static WebElement Select_ViewAll(WebDriver driver){
             element = null;
              try{
                  element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/ul/li[1]/a"));
                  System.out.println("ViewAll selected");
              }catch (Exception e){
            	  System.out.println("error");
                  throw(e);
                  }
              return element;
              
        
            }
         
 
         public static WebElement Select_LabelBundles(WebDriver driver) throws Exception{
            element = null;
             try{
                 element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/a[3]"));
                 System.out.println("LabelBundles selected");
             }catch (Exception e){
            	  System.out.println("error");
                 throw(e);
                 }
             return element;
            }
 
         
         public static WebElement Click_CreateNew_LabelFiles(WebDriver driver){
              element = null;
               try{
                   element= driver.findElement(By.xpath("html/body/div[3]/div/div/p/a"));
                   System.out.println("Create New Label File is clicked");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;
               
               
               
  
               
               
 }
 
         
         public static WebElement Type_LabelConverter(WebDriver driver){
              element = null;
               try{
                   element= driver.findElement(By.xpath("//*[@id='LabelConverterId']"));
                   System.out.println("Label Converter is typed");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;
               
}
 
         
         public static WebElement Type_LabelIdentifier(WebDriver driver){{
              element = null;
               try{
                   element= driver.findElement(By.xpath("//*[@id='LabelFileIdentifier']"));
                   System.out.println("Label LabelIdentifier is typed");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;}
               
               
         }
          
                  
                  public static WebElement Type_NumberOfLabels(WebDriver driver){{
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='NumberOfLabels']"));
                            System.out.println("NumberOfLabels is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;}
                        
                        
}
          
                  
                  public static WebElement Click_CreateLabel(WebDriver driver){{
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='create']"));
                            System.out.println("Click_CreateLabel is clicked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;}
                  }
                  
                  
                  public static WebElement Click_Display_ExpirationDate(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='DisplayExpirationDate']"));
                            System.out.println("Your Product Expiration Date will display");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
}
                  
                  
                  public static WebElement Click_RegisterLOT(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr/td[5]/a[2]"));
                            System.out.println("Label bundle detail is clicked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Click_ViewDetailLots(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr/td[5]/a[1]"));
                            System.out.println("BackToLabelFiles is clicked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                 /* public static WebElement Type_LotIdentifier(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/a[2]"));
                            System.out.println("RegisterLot From LabelBundel DetailPage is clicked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
               
                        
}*/
                  
                  
                  public static WebElement Click_RegisterLot_From_ViewALLPage(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr/td[5]/a[2]"));
                            System.out.println("RegisterLot From ViewALLPage is clicked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Type_LotIdentifier(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='LotIdentifier']"));
                            System.out.println("Lot Identifier is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Type_StartLabel(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='StartingEncodedValue']"));
                            System.out.println("Start Label is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                  }       
                        public static WebElement Type_EndLabel(WebDriver driver){
                            element = null;
                             try{
                                 element= driver.findElement(By.xpath("//*[@id='EndingEncodedValue']"));
                                 System.out.println("End Label is typed ");
                             }catch (Exception e){
                          	   System.out.println("error");
                                 throw(e);
                                 }
                             return element;
                             
                        }       
                        public static WebElement Type_LabelExpirationDate(WebDriver driver){
                            element = null;
                             try{
                                 element= driver.findElement(By.xpath("//*[@id='Expiration']"));
                                 System.out.println("Label Expiration Date is typed ");
                             }catch (Exception e){
                          	   System.out.println("error");
                                 throw(e);
                                 }
                             return element;
                             
                             
                        }       
                        public static WebElement Click_ToCreateRegisterLabel(WebDriver driver){
                            element = null;
                             try{
                                 element= driver.findElement(By.xpath("//*[@id='create']"));
                                 System.out.println("Create Register Label is click");
                             }catch (Exception e){
                          	   System.out.println("error");
                                 throw(e);
                                 }
                             return element;
}
}}