package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * mngr520631
 * zErYvUq
 * 
 * https://github.com/RamanjaneyuluE/inetbankingV1.git
 */

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL =readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password =readconfig.getPassword();
	public static WebDriver driver ;
	public static  Logger logger;
	
    @Parameters("browser")
	@BeforeClass 
	public void setup(String br) {
    	
    logger = Logger.getLogger("Ebanking");
    PropertyConfigurator.configure("Log4j.properties");
    
    if(br.equals("chrome")) {
   	 WebDriverManager.chromedriver().setup();
   	 driver= new ChromeDriver();
   	
    } 
		
	}
	
	//@AfterClass
	
	public void tearDown() {
		
		driver.quit();
	}
}
