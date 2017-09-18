package com.Contacttest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Generallibraries.Baseclass;
import com.Generallibraries.Commonlib;
import com.Generallibraries.Excellib;
import com.Webelementreposlib.ContactList;
import com.Webelementreposlib.Contactdetails;
import com.Webelementreposlib.Contactinfo;
import com.Webelementreposlib.Hompage;

public class Editcontacttest extends Baseclass
{

	Excellib elib=new Excellib();
	
SoftAssert s=new SoftAssert();
	
	String expconname="Mr. vvvuu ccc";

	
	@Test
  public void creatContact() throws Throwable 
	{
  
		String fstname=elib.getexceldata("Sheet1",1,8);
		  
		  String lstname=elib.getexceldata("Sheet1",1,9);
		
		  String modifname=elib.getexceldata("Sheet1",1,10);
		
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
	       
	         //to save entered details//
	          ci.saveButton();
		
	         //to edit entered deatails// 
	      Contactdetails cd=PageFactory.initElements(Baseclass.driver,Contactdetails.class);
		
		cd.clickEdit();
		
		//to modify enterd details//
		
		WebElement wb3=ci.modifyContct();
		wb3.sendKeys(modifname);
		
		//to save entered details//
        ci.saveButton();
	
      //to verify modified contact name//
        
       String actcontctname= cd.verfyMoidifiedconct();
       
       s.assertEquals(actcontctname,expconname);
        s.assertAll();
        
	}
}
