package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{

	@FindBy(name="j_username")
	private WebElement usrnameedt;
	
	@FindBy(id="passWord")
	private WebElement passwrdedt;
	
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement loginedt;


public void login() throws Throwable
{
	usrnameedt.sendKeys("Qspiders@hp.com");
	Thread.sleep(30000);
	passwrdedt.sendKeys("Qspiders");
	loginedt.click();
}



}


