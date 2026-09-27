package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class Titleprice_pages extends Library{
	seleniumReusable se;
	public Titleprice_pages(WebDriver driver) {
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='q']")WebElement Search;
	@FindBy(xpath="//button[@type='submit']")WebElement searchicon;
	@FindBy(xpath="//span[@role='button']")WebElement popup;
	public void entersearch(String text) {
		se=new seleniumReusable(driver);
		se.enterValue(Search, text);	
	}	
	public void clicksearchicon() {
		se.click(searchicon);
			
	}
	public void getpopup() {
		se.click(popup);
	}	

}
