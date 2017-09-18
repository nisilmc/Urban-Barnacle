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

public class Creatcontacttest extends Baseclass 
{
	
String expownname="Qspiders";	
String expconname="Mr. fff ggg";

Excellib elib=new Excellib();	
SoftAssert s=new SoftAssert();  
@Test
  public void creatContact() throws Throwable 
  {
	  String fstname=elib.getexceldata("Sheet1",1,6);
	  
	  String lstname=elib.getexceldata("Sheet1",1,7);
	  //click on contacts//
	  Hompage h=PageFactory.initElements(Baseclass.driver,Hompage.class);
  
      h.contctClick();	  
	  
	  //click on new contacts//
      ContactList cl=PageFactory.initElements(Baseclass.driver,ContactList.class);
      cl.newContcat();
      
 //enter contact details//
      
      Contactinfo ci=PageFactory.initElements(Baseclass.driver,Contactinfo.class);
     WebElement wsel= ci.getSelectFirstName();
      
      Commonlib com=PageFactory.initElements(Baseclass.driver,Commonlib.class);
	  com.selectwebelemnt(wsel,"Mr.");
	  
	  WebElement wb1=ci.enterFirstName();
  
          wb1.sendKeys(fstname); 
     WebElement wb2= ci.enterLastName();    
        wb2.sendKeys(lstname);  
      
         ci.saveButton();
      //verifing details from contact details page//
        
       Contactdetails cd=PageFactory.initElements(driver,Contactdetails.class);
      String ownname=cd.verifyOwnername();
       s.assertEquals(ownname,expownname); 
       String conname=cd.verifyContactname();
       s.assertEquals(conname,expconname);
       s.assertAll();
  
  }
}
