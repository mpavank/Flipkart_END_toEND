package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.utilites.excelutility;

public class searchexcelpage extends Library {
	excelutility excel;
	seleniumReusable se;
public searchexcelpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@name='q']") WebElement Search;
@FindBy(xpath="//div[@id='container']") WebElement homepage;
@FindBy(xpath="//span[@role='button']")WebElement popup;

public void Searchwithexcel() throws Throwable {
	excel=new excelutility();
	
	for(int i=1;i<=6;i++) {
		se=new seleniumReusable(driver);
		se.enterValue(Search, excel.excelread("sheet1", i, 0));
		Search.sendKeys(Keys.ENTER);
		se.waits();
		
		if(homepage.isDisplayed()) {
			excel.excelwrite("sheet1", i, 1, "PASS");
		}else {
			excel.excelwrite("sheet1", i, 1, "FAIL");
		}
		se.navigateback();
		
	}
	
}
public void getpopup() {
	se.click(popup);
}	
}
