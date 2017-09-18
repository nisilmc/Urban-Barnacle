package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactList 
{

	@FindBy(xpath="//input[@value='New Contact']")
	
	private WebElement newcntctclk;
	
	
	
	@FindBy(xpath="(//input[@name='chk'])[3]")
	
	private WebElement chkbxclk;
	
	
    @FindBy(xpath="(//a[@href1='#'])[3]")
	
	private WebElement delclk;
	
	
	
	
	
	
	public void newContcat()
	{
		newcntctclk.click();
	}
	
	public void chechBoxclick()
	{
		chkbxclk.click();
	}
	
	public void deleteClick()
	{
		delclk.click();
	}
	

    






}
