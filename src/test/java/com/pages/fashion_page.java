package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class fashion_page extends Library {
	seleniumReusable se;
	public fashion_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//div[@class='yQdBY2'])[3]") WebElement  fashionlink;	
	@FindBy(xpath="//a[text()='Kids']")WebElement Kidslink;
	@FindBy(xpath="//a[text()='Girls Dresses']")WebElement girlsaddresslink;
	@FindBy(xpath="//div[text()='Price -- Low to High']")WebElement Pricetlowtohigh;
	@FindBy(xpath="//span[@role='button']")WebElement popup;
	
	
	public void movefashionlink() {
		 se=new seleniumReusable(driver);
		 se.mousehover(fashionlink);
	}
	public void movekidslink() {
		se.mousehover(Kidslink);
	}
	
	public void clickgirlslink() {
		se.moveelement(girlsaddresslink);
	}
	
	public void clickprice() {
		se.click(Pricetlowtohigh);
	}
public void getpopup() {
	se.click(popup);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
