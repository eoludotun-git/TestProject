package utility.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BaseClass  {
	 
	private static WebElement element;
    public ProductPage (WebDriver driver){
        super(driver);
       
             }
    public static class Nav_ToProduct{
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
        
            
  
         public static WebElement Select_Create(WebDriver driver){
             element = null;
              try{
                  element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a"));
                  System.out.println("Create selected");
              }catch (Exception e){
            	  System.out.println("error  Creating ");
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
 
         
         public static WebElement Type_Description(WebDriver driver){
              element = null;
               try{
                   element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div/div[2]/div/div[2]/div"));
                   System.out.println("Your Product Description is typed");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;
               
               
               
  
               
               
 }
 
         
         public static WebElement Type_Product_Ingredients_Material(WebDriver driver){
              element = null;
               try{
                   element= driver.findElement(By.xpath("//*[@id='MaterialsHeaderId']"));
                   System.out.println("Your Product Ingredients is typed");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;
               
}
 
         
         public static WebElement Type_Product_UPC(WebDriver driver){{
              element = null;
               try{
                   element= driver.findElement(By.xpath("//*[@id='UPC']"));
                   System.out.println("Your Product UPC is typed");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;}
               
               
         }
          
                  
                  public static WebElement Click_Display_Material_CheckBOX(WebDriver driver){{
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='DisplayMaterials']"));
                            System.out.println("Your Material wil be display");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;}
                        
                        
}
          
                  
                  public static WebElement Click_Display_Lot_Number_CheckBOX(WebDriver driver){{
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='DisplayLotNumber']"));
                            System.out.println("Your Lot Number wil be display");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;}
                  }
                  
                  
                  public static WebElement Type_Product_NotificationEmail(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='NotificationEmail']"));
                            System.out.println("You Enable_Nofication Email");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
 }
                  
                 
                  public static WebElement Click_UseProduct_SpecificEmail(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='UseProductSpecificEmailAddress']"));
                            System.out.println("You Enable_Product_SpecificEmail");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
}
                  
                  
                  public static WebElement Click_Enable_AutoMaticNotification(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='EnableAutomaticNotifications']"));
                            System.out.println("You Enable_AutoMaticNotification");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
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
                  
                  
                  public static WebElement Type_CustomeLink_1(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='CustomFieldName1']"));
                            System.out.println("Your Product Custome_Link_1 is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Type_Custome_Link_2(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='CustomFieldName2']"));
                            System.out.println("Your Product Custome Link 2 is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Type_Custome_Link_1_URL(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='CustomFieldValue1']"));
                            System.out.println("Your Product Custome Link 1 URL is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
               
                        
}
                  
                  
                  public static WebElement Type_Custome_Link_2_URL(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='CustomFieldValue2']"));
                            System.out.println("Your Product Custome Link 2 URL is typed");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Click_DisplayLink_1_URL(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='DisplayCustomField1']"));
                            System.out.println("Your Product display Link 1 URL is checked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                        
                        
}
                  
                  
                  public static WebElement Click_Display_Link_2_URL(WebDriver driver){
                       element = null;
                        try{
                            element= driver.findElement(By.xpath("//*[@id='CustomFieldValue2']"));
                            System.out.println("Your Product display Link 2 URL is checked");
                        }catch (Exception e){
                     	   System.out.println("error");
                            throw(e);
                            }
                        return element;
                  }       
                        public static WebElement Click_Save_GoTO_Step_2(WebDriver driver){
                            element = null;
                             try{
                                 element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div/div[7]/div/input"));
                                 System.out.println("You are in step 2 ");
                             }catch (Exception e){
                          	   System.out.println("error");
                                 throw(e);
                                 }
                             return element;
                             
                        }       
                        public static WebElement Click_Browse_UploadImage(WebDriver driver){
                            element = null;
                             try{
                                 element= driver.findElement(By.xpath("//*[@id='uploadImages']"));
                                 System.out.println("Check your Product image !!!!");
                             }catch (Exception e){
                          	   System.out.println("error");
                                 throw(e);
                                 }
                             return element;
                             
                             
                        }       
                        public static WebElement Click_Skip_UploadImage(WebDriver driver){
                            element = null;
                             try{
                                 element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/form/div/div/div/a"));
                                 System.out.println("You just skipped load image!!!!");
                             }catch (Exception e){
                          	   System.out.println("error");
                                 throw(e);
                                 }
                             return element;
                    
               
               
               
               
               
               
        //COLOR SELECTION        
               
               
               
               
               
               
             }
 
     }
     
     public static class Color_1{
      
              
          public static WebElement Click_Header_Background_Color(WebDriver driver){
              element = null;
                try{
                    element= driver.findElement(By.xpath("//*[@id='HeaderBackgroundColor']/div/button"));
                    System.out.println("great,Header_Background is selected ");
                }catch (Exception e){
                	System.out.println("error");
                    throw(e);
                    }
                return element;
             }
     
     
          public static WebElement Select_White_Color(WebDriver driver){
              element = null;
               try{
                   element= driver.findElement(By.xpath("//*[@id='HeaderBackgroundColor']/div/div/div[2]/ul/li[1]/a/span[1]"));
                   System.out.println("great, white color is selected");
               }catch (Exception e){
            	   System.out.println("error");
                   throw(e);
                   }
               return element;
             }
          
     
          public static  WebElement Select_Yellow_Color(WebDriver driver){
             element = null;
              try{
                  element= driver.findElement(By.xpath("//*[@id='HeaderBackgroundColor']/div/div/div[2]/ul/li[4]/a/span[1]"));
                  System.out.println("great, yellow color is selected");
              }catch (Exception e){
            	  System.out.println("error");
                  throw(e);
                  }
              return element;
             }
          
     
          
          
          
          
}

public static class Color_2{
 
         
     public static WebElement Click_Header_Font_Color(WebDriver driver){
         element = null;
           try{
        	   
               element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div/div[2]/div/div/div/button"));
               System.out.println("great, Header_Font is selected");
           }catch (Exception e){
           	System.out.println("error");
               throw(e);
               }
           return element;
        }


     public static WebElement Select_Red_Color(WebDriver driver){
         element = null;
          try{
              element= driver.findElement(By.xpath("//*[@id='HeaderForegroundColor']/div/div/div[2]/ul/li[2]/a"));
              System.out.println("great, Red Color is selected");
          }catch (Exception e){
       	   System.out.println("error");
              throw(e);
              }
          return element;
        }
     

     public static  WebElement Select_Green_Color(WebDriver driver){
        element = null;
         try{
             element= driver.findElement(By.xpath("//*[@id='HeaderBackgroundColor']/div/div/div[2]/ul/li[5]/a/span[1]"));
             System.out.println("great, Green color is selected");
         }catch (Exception e){
       	  System.out.println("error");
             throw(e);
             }
         return element;
        }
          
     
     
     
     
     
     
     
}

public static class Color_3{

        
    public static WebElement Click_Body_Background_Color(WebDriver driver){
        element = null;
          try{
        	 
              element= driver.findElement(By.xpath("//*[@id='BodyBackgroundColor']/div/button"));
              System.out.println("great, Body_Background is selected");
          }catch (Exception e){
          	System.out.println("error");
              throw(e);
              }
          return element;
       }


    public static WebElement Select_Blue_Color(WebDriver driver){
        element = null;
         try{
             element= driver.findElement(By.xpath("//*[@id='BodyBackgroundColor']/div/div/div[2]/ul/li[4]/a/span[1]"));
             System.out.println("great, Blue Color is selected");
         }catch (Exception e){
      	   System.out.println("error");
             throw(e);
             }
         return element;
       }
    

    public static  WebElement Select_Green_Color(WebDriver driver){
       element = null;
        try{
            element= driver.findElement(By.xpath("//*[@id='HeaderBackgroundColor']/div/div/div[2]/ul/li[5]/a/span[1]"));
            System.out.println("great, Green color is selected");
        }catch (Exception e){
      	  System.out.println("error");
            throw(e);
            }
        return element;
       }
     
     









}

public static class Color_4{

       
   public static WebElement Click_Body_Font_Color(WebDriver driver){
       element = null;
         try{
       	 
             element= driver.findElement(By.xpath("//*[@id='BodyForegroundColor']/div/button"));
             System.out.println("great, Body_Font is selected");
         }catch (Exception e){
         	System.out.println("error");
             throw(e);
             }
         return element;
      
     
     
     
}


public static  WebElement Select_White_Color(WebDriver driver){
   element = null;
    try{
        element= driver.findElement(By.xpath("//*[@id='BodyForegroundColor']/div/div/div[2]/ul/li[1]/a/span[1]"));
        System.out.println("great, White color is selected");
    }catch (Exception e){
  	  System.out.println("error");
        throw(e);
        }
    return element;
   
   

    
    
    
    
    
    
    
    
    
    
    
    
    
}











}

public static class Color_5{

    
public static WebElement Click_Footer_BackGround_Color(WebDriver driver){
    element = null;
      try{
    	 
          element= driver.findElement(By.xpath("//*[@id='FooterBackgroundColor']/div/button"));
          System.out.println("great, FooterBackGround is selected");
      }catch (Exception e){
      	System.out.println("error");
          throw(e);
          }
      return element;
   
  
  
  
}


public static  WebElement Select_Purple_Color(WebDriver driver){
element = null;
 try{
     element= driver.findElement(By.xpath("//*[@id='FooterBackgroundColor']/div/div/div[2]/ul/li[7]/a/span[1]"));
     System.out.println("great, Purple color is selected");
 }catch (Exception e){
	  System.out.println("error");
     throw(e);
     }
 return element;



 
 
 
 
}











}

public static class Color_6{

    
public static WebElement Click_Footer_Font_Color(WebDriver driver){
    element = null;
      try{
    	 
          element= driver.findElement(By.xpath("//*[@id='FooterForegroundColor']/div/button"));
          System.out.println("great, FooterFont is selected");
      }catch (Exception e){
      	System.out.println("error");
          throw(e);
          }
      return element;
   
  
  
  
}


public static  WebElement Select_Black_Color(WebDriver driver){
element = null;
 try{
     element= driver.findElement(By.xpath("//*[@id='FooterForegroundColor']/div/div/div[2]/ul/li[8]/a/span[1]"));
     System.out.println("great, Black color is selected");
 }catch (Exception e){
	  System.out.println("error");
     throw(e);
     }
 return element;


}
   
   
   
   
   
   
}






public static class Click_Step4{
   
   
   

     
          public static WebElement Click_Go_To_Step_4(WebDriver driver){
               element = null;
                try{
                    element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div/div[7]/div/input"));
                    System.out.println("You are in Step 4");
                }catch (Exception e){
                	System.out.println("error");
                    throw(e);
                    }
                return element;
              }
      
         
}






public static class Click_Done{
          
          public static WebElement ClickDONE(WebDriver driver){
                 element = null;
                   try{
                       element= driver.findElement(By.xpath("//*[@id='create']"));
                       System.out.println("great!!! The Product is CREATED");
                   }catch (Exception e){
                	   System.out.println("ERROR!!, something went wrong");
                       throw(e);
                       }
                   return element;



          }}
public static class On_ProductPage{
	


public static WebElement Click_Product(WebDriver driver){
    element = null;
      try{
          element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/a"));
          System.out.println("Product is selected");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
	
}
          public static WebElement SelectViewALL(WebDriver driver){
              element = null;
               try{
                   element= driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[3]/ul/li[1]/a"));
                   System.out.println("View all is selected");
               }catch (Exception e){
             	  System.out.println("error");
                   throw(e);
                   }
               return element;
                   
                   
                }
          
          public static WebElement Click_Edit(WebDriver driver){
              element = null;
                try{
                    element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/a[1]"));
                    System.out.println("great!!!Edit is selected");
                }catch (Exception e){
             	   System.out.println("ERROR!!, something went wrong");
                    throw(e);
                    }
                return element;
                
}
          
          public static WebElement Click_ProductDetail(WebDriver driver){
              element = null;
                try{
                    element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/a[2]"));
                    System.out.println("great!!!View Product Detail Now!!!");
                }catch (Exception e){
             	   System.out.println("ERROR!!, something went wrong");
                    throw(e);
                    }
                return element;
                
                
}
          
          public static WebElement Click_BackToProduct(WebDriver driver){
              element = null;
                try{
                    element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/a[2]"));
                    System.out.println("back to Product is clicked");
                }catch (Exception e){
             	   System.out.println("ERROR!!, something went wrong");
                    throw(e);
                    }
                return element;
         }




public static WebElement  Click_FeedBack_Categories(WebDriver driver){
    element = null;
      try{
          element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/a[4]"));
          System.out.println("FeedBack Is selected");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
}

public static WebElement Click_Edit_FeedBack(WebDriver driver){
    element = null;
      try{
          element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/div/table/tbody/tr/td[3]/a"));
          System.out.println("great!!!Edit feedBack is selected");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
      
      
}
public static WebElement Type_FeedBack_CategoryName(WebDriver driver){
    element = null;

      try{
          element= driver.findElement(By.xpath("//*[@id='CategoryName']"));
          System.out.println("FeedBack CategoryName is Selected");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
	
	


}




public static WebElement Type_FeedBackType(WebDriver driver){
    element = null;

      try{
          element= driver.findElement(By.xpath("//*[@id='FeedbackType']"));
          System.out.println("Type FeedBack is clicked");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
      
}




public static WebElement Click_SaveProductChanges(WebDriver driver){
    element = null;

      try{
          element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[2]/form/div[4]/div/input"));
          System.out.println("great!!!Edit product is saved");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
      
}




public static WebElement ClickSave_FeedBackChanges(WebDriver driver){
    element = null;

      try{
          element= driver.findElement(By.xpath("//*[@id='create']"));
          System.out.println("great!!!Edit feedback is saved");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;
      
}




public static WebElement Click_Create_NewFeedBack(WebDriver driver){
    element = null;

      try{
          element= driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[2]/p/a[2]"));
          System.out.println("great!!Create FeedBack is clicked");
      }catch (Exception e){
   	   System.out.println("ERROR!!, something went wrong");
          throw(e);
          }
      return element;







}




}

}
	
	


























