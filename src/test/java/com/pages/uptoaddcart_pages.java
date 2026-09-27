package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class uptoaddcart_pages extends Library{
	seleniumReusable se;
	public uptoaddcart_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='pStjB2 lr29Nk']")WebElement  Loginglink;
	@FindBy(xpath="//a[text()='Login']")WebElement curseronloginlink;
	@FindBy(xpath="//div[text()='Flipkart Plus Zone']")WebElement flipkartplusezone;
	@FindBy(xpath="//span[text()='Home & Furniture']")WebElement  HomeFurniturelink;
	@FindBy(xpath="//a[text()='Wall Lamp']")WebElement wallLamplink;
@FindBy(xpath="(//a[text()='Sinoman Wallchiere Wall Lamp Without Bulb'])[1]")WebElement clickonelamp;
	@FindBy(id="pincodeInputId")WebElement Pincode;
	@FindBy(xpath="//span[text()='Check']")WebElement checklink;
	@FindBy(xpath="//span[@role='button']")WebElement popup;
		

	public void clickloginlink() {
    se=new seleniumReusable(driver);
    se.moveelement(Loginglink);
	}
	public void moveloginlink() {
	    se=new seleniumReusable(driver);
	    se.highletelement(curseronloginlink);
	    se.mousehover(curseronloginlink);
		}
	public void Movetoflipkartplus() {
		se.highletelement(flipkartplusezone);
		se.moveelement(flipkartplusezone);
	}	
	public void movehomefurniture() {
		se.highletelement(HomeFurniturelink);
		se.mousehover(HomeFurniturelink);
	}
	public void clickwallamp() {
		se.highletelement(wallLamplink);
		se.moveelement(wallLamplink);
	}	
	public void clickonresult() {
		se.scrolldown(clickonelamp);
	}
	public void enterpincode() {
		se.windowhandling(clickonelamp);
		Pincode.sendKeys("600083");
	}	
	public void clickchecklink() {
		se.click(checklink);
	}
	public void getpopup() {
		se.click(popup);
	}	

}
