package com.Generallibraries;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commonlib 
{

	public void selectwebelemnt(WebElement swb,String value)
	{
		Select sel=new Select(swb);
		sel.selectByVisibleText(value);
		
	}
	
	public String getalerttext()
	{
		Alert alt=Baseclass.driver.switchTo().alert();
		String actaltmsg=alt.getText();
		return actaltmsg;
	}

	public void acptalert()
	{
		Alert alt=Baseclass.driver.switchTo().alert();
		alt.accept();
	}

	public void cancelalert()
	{
		Alert alt=Baseclass.driver.switchTo().alert();
		alt.dismiss();
	}


}




