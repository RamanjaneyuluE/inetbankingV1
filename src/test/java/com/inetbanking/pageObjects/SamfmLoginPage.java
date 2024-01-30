package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamfmLoginPage {
	
	WebDriver driver ;
	
	public SamfmLoginPage(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	By uname = By.id("username");
	By password = By.id("password");
	By validate = By.id("validate");
	
	By languageIcon = By.xpath("//a/i[@class='glyph glyph-language']");
	By languageText = By.xpath("//a/i[@class='glyph glyph-language']/following-sibling::span[2]");
	
	public void userLogin() {
		
		driver.findElement(uname).sendKeys("sam");
		driver.findElement(password).sendKeys("Admsam@123");
		driver.findElement(validate).click();
	}
	
public WebElement HoverLanguagemenu() {
		
		return driver.findElement(languageIcon);		
	}
	
	public String LanguageText() {
		
		return driver.findElement(languageText).getText();
	}

	
	


}
