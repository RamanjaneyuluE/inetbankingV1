package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		logger.info("URL is opened ");
		driver.manage().window().maximize();
		logger.info("Browser is maximized ");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is entered ");
		lp.setPassword(password);
		logger.info("Password is entered ");
		lp.clickSubmit();
		logger.info("Clicked on Accept button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);	
			logger.info("Login Test passed ");
	}
		else {
			Assert.assertTrue(false);
			logger.info("Login Test failed ");
		}
	
}
}