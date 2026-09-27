package com.stefdefination;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.pages.Filter_page;

import io.cucumber.java.en.*;

public class Filter_stefdefanation extends Library {
	Filter_page fp;
	seleniumReusable se;
	@Then("Select Minimum and maximum Amount")
	public void select_minimum_and_maximum_amount() throws Throwable {
	  fp=new Filter_page(driver) ;
	 String beforeFilter = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]")).getText();
	  System.out.println("before Filter :"+beforeFilter);
	  fp.Min();
	 se=new  seleniumReusable(driver);
	 se.waits();
	 fp.max();
	 se.waits();	 	 	  
	}
	@Then("Select the Brand")
	public void select_the_brand() throws Throwable {
	fp.brand(); 
	se.waits();
	}
	@Then("Select the Ram")
	public void select_the_ram() throws Throwable {
	 fp.ram();  
	 se.waits();
	}
	@Then("Select the BatteryCapacity")
	public void select_the_battery_capacity() throws Throwable {
	 fp.clickbattery(); 
	 se.waits();
	}
	@Then("It shout display the Relavant result")
	public void it_shout_display_the_relavant_result() {
	  System.out.println("************************************************************");  
	  String afterFilter = driver.findElement(By.xpath("//div[text()='vivo V9 Youth (Black, 32 GB)']")).getText();
	  System.out.println("after Filter :"+afterFilter);	
	}
}
