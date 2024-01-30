package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.pageObjects.SamfmLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	SamfmLoginPage loginpage; 
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	 public void loginTest(String br) throws Exception {
		
		if(br.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
				
		logger = Logger.getLogger("SamFM-Web Application");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		try {
		loginpage =  new SamfmLoginPage(driver);
		driver.get("http://localhost/App-15084");
		logger.info("URL is launched");
		loginpage.userLogin();
		logger.info("login is successful");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
	    WebElement ele = loginpage.HoverLanguagemenu();
		act.moveToElement(ele).build().perform();
		String language = loginpage.LanguageText();
		if(language.equalsIgnoreCase("Basculer en langue 'English'")) {
			
			ele.click();
			
			logger.info("English language is selected");
			
		}
													
	}
				catch(Exception e) {
			
			System.out.println(e.getMessage());
		}

}
		
	}


