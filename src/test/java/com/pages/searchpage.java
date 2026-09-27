package com.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class searchpage extends Library  {
	seleniumReusable se;
public 	searchpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}
@FindBy(xpath="//input[@name='q']") WebElement Searchtext;
@FindBy(xpath="//html[@lang='en-IN']")WebElement Homepage;
@FindBy(xpath="//html[@lang='en']")WebElement searchresult;
@FindBy(xpath="//div[@class='col col-7-12']")List<WebElement> EntaireResult;
 @FindBy(xpath="(//div[@class='col col-7-12'])[3]") WebElement thirdresult;
 @FindBy(xpath="//span[@role='button']")WebElement popup;
public void Search(String text) {
	se=new seleniumReusable(driver);
	se.enterValue(Searchtext, text);	
	
}

public void clicksearch() {
	Searchtext.sendKeys(Keys.ENTER);
}
public void homescreen() {
	System.out.println(Homepage.isDisplayed());
}
public void Result() {
	System.out.println(searchresult.isDisplayed());
	System.out.println(driver.getTitle());
}

public void printentairresult() {
	se.MultipleGettext(EntaireResult);
}
public void print3rdresult() {
	se.Getvalue(thirdresult);
}

public void getpopup() {
	se.click(popup);
}	








}
