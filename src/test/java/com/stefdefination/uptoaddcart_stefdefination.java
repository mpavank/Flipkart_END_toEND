package com.stefdefination;
import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.pages.uptoaddcart_pages;
import io.cucumber.java.en.*;

public class uptoaddcart_stefdefination  extends Library{
	   seleniumReusable re;
	uptoaddcart_pages up;
	@Given("User can move to the login link")
	public void user_can_move_to_the_login_link() throws Throwable {
	   up=new uptoaddcart_pages(driver);
	   re=new seleniumReusable(driver);
	   up.clickloginlink();
	   re.waits();	    
	   up.moveloginlink();
	   re.waits();
	   System.out.println("parentwindow title");	
	re.gettitle();
	}
	@When("User can click the flipkart pluse zone")
	public void user_can_click_the_flipkart_pluse_zone() throws Throwable {
	   up.Movetoflipkartplus();
	   re.waits();
	}
	@When("Mouse move to the Home&Furniture link")
	public void mouse_move_to_the_home_furniture_link() throws Throwable {
	   up.movehomefurniture(); 
	   re.waits();
	}

	@When("Going to click the wall lamp")
	public void going_to_click_the_wall_lamp() throws Throwable {
		up.clickwallamp();
		re.waits();
	}

	@When("Scroll down the page and click one particular result")
	public void scroll_down_the_page_and_click_one_particular_result() throws Throwable {
	   up.clickonresult();
	   re.waits();
	}

	@When("Enter delivery pincode and click the check link")
	public void enter_delivery_pincode_and_click_the_check_link() throws Throwable {
	    up.enterpincode();
	    re.waits();
	}

	@Then("Pincode should be checked and display and verify the titles")
	public void pincode_should_be_checked_and_display_and_verify_the_titles() {
	   up.clickchecklink();
	   System.out.println("childwindow title");
	  re=new seleniumReusable(driver);
	  re.gettitle();
 re.screenshot("C:\\Users\\pavan\\OneDrive\\Documents\\Flipkart_END_toEND\\src\\test\\resources\\screenshots\\uptoaddcart.png");
	}
}
