package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver ;
	
	By stockManagementmodule= By.xpath("//label[contains(text(),\"Stock management\")]");
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void ClickOnStockModule() {
		
		driver.findElement(stockManagementmodule).click();
		
	}
	
	
	
	

}
