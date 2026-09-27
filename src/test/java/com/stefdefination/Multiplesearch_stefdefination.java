package com.stefdefination;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.pages.Multiplesearch_pages;

import io.cucumber.java.en.*;

public class Multiplesearch_stefdefination  extends Library{
	Multiplesearch_pages ms;
	@Given("Enter the {string} in the search field")
	public void enter_the_in_the_search_field(String searchtext) {
	ms=new Multiplesearch_pages(driver);
	ms.Entersearch(searchtext);	
	}

	@When("click the search button")
	public void click_the_search_button() {
	  ms.clicksearch();  
	}

	@Then("it should navigates to the text page and display the correspding page")
	public void it_should_navigates_to_the_text_page_and_display_the_correspding_page() {
	  seleniumReusable sr=new seleniumReusable(driver) ;
	  sr.gettitle();
	  System.out.println("******************************************************");
	sr.screenshot("C:\\Users\\pavan\\OneDrive\\Documents\\Flipkart_END_toEND\\src"
			+ "\\test\\resources\\screenshots\\search_"
	  +System.currentTimeMillis()+".png");
	}

}








