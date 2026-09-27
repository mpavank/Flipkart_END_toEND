package com.hooks;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends Library{
	seleniumReusable se;
public static Scenario scenario;
	@Before
	public void test(Scenario cucumberscenario) throws IOException {
		scenario=cucumberscenario;
		launchapplication();
	  driver.findElement(By.xpath("//span[@role='button']")).click();
	}
	@After
	public void cleanup(Scenario scenario) {
		 se=new seleniumReusable(driver);
		 se.attachscreenshot(scenario);
		se.closeapp();
	}
	
}
