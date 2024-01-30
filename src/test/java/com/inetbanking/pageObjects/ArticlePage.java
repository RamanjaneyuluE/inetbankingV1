package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlePage {
	
	WebDriver driver ;
	
	
	public ArticlePage(WebDriver driver) {
		this.driver= driver;
		 
	}
	
	By Articles = By.xpath("//label[contains(text(),'Articles')]");
	By ArticleTypeInsertButton = By.xpath("//button[contains(text(),'Insert')]");
	By ArticleTypeCode = By.xpath("//input[@validationmessage='Code is mandatory']");
	By ArticleTypeLabel = By.xpath("//input[@validationmessage='Label is mandatory']");
	By ArtricelTypeSave	= By.xpath("//button-component[@label='Save']");
	
	
	
	public void clickArticleSubMenu () {
		
		driver.findElement(Articles).click();	
	}
	
	public void ClickArticleTypeInsertButton() {
		
		driver.findElement(ArticleTypeInsertButton).click();
	}

	public void CreateArticleTypeRecord(String code, String label) {
		driver.findElement(ArticleTypeCode).sendKeys(code);
		driver.findElement(ArticleTypeLabel).sendKeys(label);
		driver.findElement(ArtricelTypeSave).click();
		
		
	}
}
