package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class Multiplesearch_pages  extends Library{
	seleniumReusable se;

	public Multiplesearch_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='q']")WebElement Searchfield;	
@FindBy(xpath="//span[@role='button']")WebElement popup;
	
public void Entersearch(String searchtext) {
	 se=new seleniumReusable(driver);
	se.enterValue(Searchfield, searchtext);
}
	
public void clicksearch() {
	Searchfield.sendKeys(Keys.ENTER);
}
	
public void getpopup() {
	se.click(popup);
}	
}
