package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Generallibraries.Excellib;

public class Campaigninfo 
{
	
	
	@FindBy(name="property(Campaign Name)")
	
	private WebElement edtcampname;
	
	
    @FindBy(xpath="//select[@name='property(Type)']")
	
	private WebElement selcttyp;
    
    @FindBy(xpath="(//input[@value='Save'])[1]")
    
    private WebElement savebtn;
    
    
    
    
    
    public WebElement getnewCamp() 
    {
		return edtcampname;
	}


	
    public WebElement getnewselect() 
    {
		return selcttyp;
	}



    public void savecamp()
   {
	   savebtn.click();;
   }

   
   


public WebElement getModifyCampaign() 
{
	return edtcampname;
}
   

}
