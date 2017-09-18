package com.Campaigntest;

import org.openqa.selenium.Alert;
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
import com.Webelementreposlib.Campaigninfo;
import com.Webelementreposlib.Campaigntest;
import com.Webelementreposlib.Hompage;

public class Deletecampaigntest extends Baseclass
{

	
	
	Excellib elib=new Excellib();
	
		 @Test
		  public void campaigndeletest() throws Throwable 
		  {
			 
			  String expaltmsg="Are you sure ?";
			//click on campaign//
			  Hompage h=PageFactory.initElements(Baseclass.driver,Hompage.class);
			  h.camptest();
			//click on new campaign//
			  Thread.sleep(5000);
			  Campaigntest cam=PageFactory.initElements(Baseclass.driver,Campaigntest.class);
			  
			 cam.newcamp();
			  		  
			//entering campaign details to create a new campaign//
			  Thread.sleep(5000);
			  	Campaigninfo n=PageFactory.initElements(Baseclass.driver,Campaigninfo.class);
			  	String campnme =elib.getexceldata("Sheet1",1,3);
			  	WebElement w=n.getnewCamp();
			  	w.sendKeys(campnme);
			  	WebElement msel=n.getnewselect();
			Commonlib comm=PageFactory.initElements(Baseclass.driver,Commonlib.class);
			comm.selectwebelemnt(msel,"Conference");
		
			
			//save entered details// 
		     n.savecamp();
	
		   //click on campaign//
		    h.camptest();
			
		
		
		//select above created campaign checkbox in Campaigntable//
		    Thread.sleep(3000);
		    cam.editchkbox();
	
		
		//click on "delete" button//
		Thread.sleep(4000);
        cam.clickondelet();
		
		//to verify "are you sure" msg//
		String actaltmsg=comm.getalerttext();
		System.out.println(actaltmsg);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actaltmsg,expaltmsg);
		//clcik on ok button on alert box//

		comm.acptalert();
		
}

		 


}

