package com.Campaigntest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Generallibraries.Baseclass;
import com.Generallibraries.Commonlib;
import com.Generallibraries.Excellib;
import com.Webelementreposlib.Camdetailstest;
import com.Webelementreposlib.Campaigninfo;
import com.Webelementreposlib.Campaigntest;
import com.Webelementreposlib.Hompage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Creatcampaigntest extends Baseclass 
{
	
  Excellib elib=new Excellib();
	

	@Test
  public void campaigntest() throws Throwable 
  {
		
		 String campnme =elib.getexceldata("Sheet1",1,2);
	String ownexp="Qspiders";
	String nameexp="user28";
	String typexp="Conference";
	
	//click on campaign//
	Thread.sleep(3000);
  Hompage h=PageFactory.initElements(Baseclass.driver,Hompage.class);
     h.camptest();
 
  //click on new campaign//
     Thread.sleep(4000);
  Campaigntest cam=PageFactory.initElements(Baseclass.driver,Campaigntest.class);
  cam.newcamp();
  
  
  //entering campaign details to create a new campaign//
  Thread.sleep(4000);
  	Campaigninfo n=PageFactory.initElements(Baseclass.driver,Campaigninfo.class);
  	WebElement wb=n.getnewCamp();
  	wb.sendKeys(campnme);
  	
  	
  	WebElement msel=n.getnewselect();
  	
  	Commonlib comm=PageFactory.initElements(Baseclass.driver,Commonlib.class);
    comm.selectwebelemnt(msel,"Conference");
    Thread.sleep(4000);
    n.savecamp();
       

//verifying captured owner name //
Camdetailstest c=PageFactory.initElements(driver,Camdetailstest.class);
String ownact=c.owner();
SoftAssert soft=new SoftAssert();
soft.assertEquals(ownact,ownexp);

//verifing captured name//
String nameact=c.name();
soft.assertEquals(nameact, nameexp);

//verifing captured type//
String typact=c.type();
soft.assertEquals(typact,typexp);
soft.assertAll();
}
  
 

}
