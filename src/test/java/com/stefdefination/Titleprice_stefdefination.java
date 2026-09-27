package com.stefdefination;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.pages.Titleprice_pages;

import io.cucumber.java.en.*;

public class Titleprice_stefdefination extends Library {
	Titleprice_pages tp;
	seleniumReusable re;
	@Given("Enter the search text in the text field")
	public void enter_the_search_text_in_the_text_field() {
	   tp=new Titleprice_pages(driver) ;
		tp.entersearch("Shirts");   
	   }
	@When("click the search icon")
	public void click_the_search_icon() {
	   tp.clicksearchicon();
	}

	@Then("It should display the search result and get the title")
	public void it_should_display_the_search_result_and_get_the_title() {
	   re=new seleniumReusable(driver);
	   re.MultipleGettext(driver.findElements(By.xpath("//div[@class='p0C73x']")));
	}

}
