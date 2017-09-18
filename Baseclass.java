package com.Generallibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Webelementreposlib.Login;

public class Baseclass 
{
	public static WebDriver driver;
	 @BeforeClass
	  public void beforeClass() 
	  {
		 
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  }
	 @BeforeMethod
	  public void beforeMethod() throws Throwable 
	  {
	  driver.get("http://192.168.183.128:8090/crm/ShowHomePage.do");
	  Login l=PageFactory.initElements(driver,Login.class);
	  l.login();
	  }
	
	 @AfterMethod
	  public void afterMethod() 
	  {
	  
	  driver.findElement(By.xpath("//a[@href='/crm/logout.sas']")).click();
	  }

	 

	  @AfterClass
	  public void afterClass() 
	  {
	  
	  driver.close();
	  }
	
	
	
}
