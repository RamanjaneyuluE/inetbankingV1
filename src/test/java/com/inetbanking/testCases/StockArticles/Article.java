package com.inetbanking.testCases.StockArticles;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.ArticlePage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.testCases.BaseTest;


public class Article extends BaseTest {
	
	HomePage homepage;
	WebDriverWait wait ;
	ArticlePage articlepage; 

	@Test(priority=0)
	
	public void stockManagement() {
		
		try 
		{
			homepage = new HomePage(driver); 
			homepage.ClickOnStockModule();
			logger.info("Stock module is clicked");
			wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
			

			if(driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase("Stock management")) {
			
					System.out.println("We are on Stock Management module ");

				}
			
		}
		
		catch(Exception e) {
			
			
		}
		
	}
	
	
	@Test(priority=1)
	
	public void ArticleTypeCreation() {
		
		try {
			Thread.sleep(5000);
			articlepage = new ArticlePage(driver);
			articlepage.clickArticleSubMenu();
			logger.info("Articles sub menu is selected");
			Thread.sleep(5000);
			articlepage.ClickArticleTypeInsertButton();
			logger.info("ArticleType insert button is clicked");
			Thread.sleep(3000);
			articlepage.CreateArticleTypeRecord("Test2", "Test1_Label");
			logger.info("Articletype record is created");
			
			
		}
		
		catch(Exception e) {
			
			
		}
		
	}
	
	

}
