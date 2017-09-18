package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Campaigntest 
{

	
	@FindBy(xpath="//a[@href='/crm/Create.do?module=Campaigns']")
	
	private WebElement newcampclk;
	
    @FindBy(xpath="//div[@id='idForCV']/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/div/input")
	
	private WebElement editclick;
	
	@FindBy(xpath="//div[@id='idForCV']/descendant::div/a[2]")
	
	private WebElement clikdelt;
	
	
	
	public void newcamp()
	{
		newcampclk.click();
	}
	
	
	public void editchkbox()
	{
		editclick.click();;
	}
	
	public void clickondelet()
	{
		clikdelt.click();;
	}
	
	
}
