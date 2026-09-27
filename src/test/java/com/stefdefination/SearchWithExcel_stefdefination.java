package com.stefdefination;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.pages.searchexcelpage;

import io.cucumber.java.en.*;

public class SearchWithExcel_stefdefination extends Library {
	searchexcelpage sp;
	seleniumReusable re;
	@Given("Enter Search Text In the Search Field")
	public void enter_search_text_in_the_search_field() throws Throwable {
		
	    sp=new searchexcelpage(driver);
	   
	    sp.Searchwithexcel();
	}

	@When("click search Icon")
	public void click_search_icon() {
	   re=new seleniumReusable(driver);
	   re.screenshot("src/test/resources/screenshots/searchexcel_"+System.currentTimeMillis()+".png");
	}

	@Then("It should Display the Relevent result")
	public void it_should_display_the_relevent_result() {
	  re.gettitle();
	}

}
