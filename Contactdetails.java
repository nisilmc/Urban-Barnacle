package com.Webelementreposlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactdetails 
{

@FindBy(xpath="//table[@id='secContent1']/tbody/tr[1]/td[2]/a")

private WebElement vrfyownr;


@FindBy(xpath="//table[@id='secContent1']/tbody/tr[2]/td[4]")

private WebElement verfycontctnam;


@FindBy(xpath="//div[@id='show']/form/table[2]/tbody/tr/td/div/input[1]")

private WebElement edtclk;



public String verifyOwnername()
{
	String Oname=vrfyownr.getText();

return Oname;
}

public String verifyContactname()
{
	String Cname=verfycontctnam.getText();
return Cname;
}

public void clickEdit()
{
	edtclk.click();
}

public String verfyMoidifiedconct()
{
	String MCname=verfycontctnam.getText();
	return MCname;
}


	
}
