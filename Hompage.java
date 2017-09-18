package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hompage 
{

	@FindBy(xpath="//a[text()='Campaigns']")
	
	private WebElement campclk;
	
	@FindBy(xpath="//a[text()='Contacts']")
	
	private WebElement contctclk;
	
	
	public void camptest()
	{
		campclk.click();
	}
	
	
	public void contctClick()
	{
		contctclk.click();
	}
	
	
	
	
}
