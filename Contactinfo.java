package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactinfo 
{

	@FindBy(xpath="//select[@name='property(saltName)']")
	
	private WebElement selctfstname;
	
	@FindBy(xpath="//input[@name='property(First Name)']")
	
	private WebElement entrfstname;
	
	@FindBy(xpath="//input[@name='property(Last Name)']")
	
	private WebElement entrlstname;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	
	private WebElement clksave;
	
	
	public WebElement getSelectFirstName()
	{
		return selctfstname;
	}
	
	
	public WebElement enterFirstName()
	{
		return entrfstname;
	}
	
	
	public WebElement enterLastName()
	{
		return entrlstname;
	}
	
	
	public void saveButton()
	{
		clksave.click();
	}
	
	
	public WebElement modifyContct()
	{
		return entrfstname;
	}
	
	
	
	
	
	
}
