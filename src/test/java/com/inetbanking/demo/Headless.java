package com.inetbanking.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless {
	
	@Test
	
	public void test() {
		
		WebDriver driver = new HtmlUnitDriver(true);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
