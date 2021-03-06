package com.Campaigntest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Generallibraries.Baseclass;
import com.Generallibraries.Commonlib;
import com.Generallibraries.Excellib;
import com.Webelementreposlib.Camdetailstest;
import com.Webelementreposlib.Campaigninfo;
import com.Webelementreposlib.Campaigntest;
import com.Webelementreposlib.Hompage;

public class Editexstingcamp extends Baseclass
{
	WebDriver driver;
	  Excellib elib=new Excellib();
		

			@Test
		  public void campaigntedtest() throws Throwable 
		  {
			String campnme =elib.getexceldata("Sheet1",1,3);
			String nameexp="user29gg";
			String typexp="Webinar";
			
			//click on campaign//
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
			  //save entered details// 
			    Thread.sleep(4000);
			    n.savecamp();
			
			    
		
		 
		//click on edit button//
			    Thread.sleep(4000);
			Camdetailstest cam1=PageFactory.initElements(Baseclass.driver,Camdetailstest.class); 
			cam1.Edt();;
		
		//modif enterd details//
			Thread.sleep(4000);
			String campnam =elib.getexceldata("Sheet1",1,4);	
		WebElement w=n.getModifyCampaign();
		w.sendKeys(campnam);
	    WebElement	nsel=n.getnewselect();
		comm.selectwebelemnt(nsel,"Webinar");
		
		 //save entered details// 
		Thread.sleep(4000);
	    n.savecamp();
	
		 
	  //verifing captured name//
	    Thread.sleep(4000);
		 SoftAssert soft=new SoftAssert();
		 Camdetailstest c=PageFactory.initElements(Baseclass.driver,Camdetailstest.class);
		 String nameact=c.name();
		 soft.assertEquals(nameact, nameexp);
		
		 //verifing captured type//
		 String typact=c.type();
		 soft.assertEquals(typact,typexp);
		 soft.assertAll();
		  
		 }
			
			
			
			
	
}
