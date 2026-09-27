package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Library {
	public static WebDriver driver;
	public static Properties prop;
    protected  static Logger logger;
	public void launchapplication() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\pavan\\OneDrive\\Documents\\Flipkart_END_toEND\\src\\test\\resources\\property\\config.properties");
	    prop=new Properties();
	  prop.load(fis);
	logger=Logger.getLogger(Library.class);
	PropertyConfigurator.configure("src/test/resources/property/log4j.properties");
	  
	  try {
		  if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			  driver=new ChromeDriver();
			  logger.info("************chrom browser launched***********");
		  }
		  else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			  driver=new  EdgeDriver();
			  logger.info("************edge browser launched***********");
			  
		  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(prop.getProperty("url"));
		  logger.info("************Application launched***********");
	  }
	  catch(Exception e) {
		  System.out.println("browser didnt launch");
	  }
	}
	public void teardown() {
	//	driver.quit();
	}
}
