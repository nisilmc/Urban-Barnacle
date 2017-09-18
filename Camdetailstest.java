package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Camdetailstest 
{

	@FindBy(linkText="Qspiders")
	
	private WebElement owndata;
	
	
   @FindBy(xpath="//span[@id='value_Campaign Name']")
	
	private WebElement namdata;
	
   
   @FindBy(xpath=".//span[@id='value_Type']")
	
	private WebElement typdata;
	
  @FindBy(xpath="//div[@id='show']/form/table[2]/tbody/tr/td/div/input[1]")
  
  private WebElement edt;
  
   
   
   public String owner()
   {
	  String data1= owndata.getText();
  
	  return data1;
   }
   
   public void Edt() 
   {
	edt.click();;

   }

public String name()
   {
	  String data2= namdata.getText();
   
     return data2;   
   }
   
   
   
   public String type()
   {
	  String data3= typdata.getText();
   
   return data3;
   }
   
   
   
}
