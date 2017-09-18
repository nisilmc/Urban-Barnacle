package com.Contacttest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Generallibraries.Baseclass;
import com.Generallibraries.Commonlib;
import com.Generallibraries.Excellib;
import com.Webelementreposlib.ContactList;
import com.Webelementreposlib.Contactinfo;
import com.Webelementreposlib.Hompage;

public class Deletecontacttest extends Baseclass
{
  
	Excellib elib=new Excellib();	
	
	@Test
  
   public void deleteContact() throws Throwable 
  {
  
		
		
		String fstname=elib.getexceldata("Sheet1",2,3);
		  
		  String lstname=elib.getexceldata("Sheet1",2,4);
		
		
		
		
		
		//click on contacts//
		  Thread.sleep(4000);
		  Hompage h=PageFactory.initElements(Baseclass.driver,Hompage.class);
	  
	      h.contctClick();	  
		  
	      
	      //click on new contacts//
	      Thread.sleep(4000);
	      ContactList cl=PageFactory.initElements(Baseclass.driver,ContactList.class);
	      cl.newContcat();
	       
	      
	      //enter contact details//
	      Thread.sleep(4000);
	      Contactinfo ci=PageFactory.initElements(Baseclass.driver,Contactinfo.class);
	      WebElement wsel= ci.getSelectFirstName();
	       
	       Commonlib com=PageFactory.initElements(Baseclass.driver,Commonlib.class);
	 	  com.selectwebelemnt(wsel,"Mr.");
	 	  
	 	  WebElement wb1=ci.enterFirstName();
	   
	           wb1.sendKeys(fstname); 
	      WebElement wb2= ci.enterLastName();    
	         wb2.sendKeys(lstname);
  
	       //to save entered details//s
	         Thread.sleep(4000);
	          
	         ci.saveButton();
		
	        //click on contacts//
			  Thread.sleep(4000);
			  h.contctClick();	  
			  
	         //click on checkbox//
			  
			 cl.chechBoxclick();
			 
			//click on delete//
			 cl.deleteClick();
			 
			//to handle alert//
			 
			 com.acptalert();
			 
	         
  }
}
