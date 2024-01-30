package com.inetbanking.testCases.DataManagement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.inetbanking.testCases.BaseTest;

public class Site extends BaseTest {
	

	WebDriverWait wait ;
	@Test
	
	public void siteCreation() throws Exception {
		
		 
		WebElement ele = driver.findElement(By.xpath("//label[contains(text(),'Data management')]"));
		ele.click();
		
		
	    Thread.sleep(3000);
	    
	    String parentWindow = driver.getWindowHandle();
	    for(int i=1; i<144 ; i++) {
	    	
	    	
	    	
	    	driver.switchTo().frame("menu");
		    driver.findElement(By.linkText("Sites")).click();
		    driver.switchTo().defaultContent();
	    	
	    driver.switchTo().frame("corps");
	    
	    
	    
	    driver.findElement(By.id("_lnk")).click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(1000);
	    Set<String> windows = driver.getWindowHandles();
	    for(String window : windows) {
	    	
	    	if(!window.equalsIgnoreCase(parentWindow)) {
	    		driver.switchTo().window(window);
	    		
	    	}
	    	
	    }
	    
  		    driver.switchTo().frame("gda_corps");
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("sit_code")).sendKeys("TestT" + i );
	    	driver.findElement(By.name("sit_libelle")).sendKeys("TestLabel" + i);
	    	driver.findElement(By.xpath("//a[@title='Validate']")).click();
	    	driver.switchTo().defaultContent();
	    	driver.close();
	    	driver.switchTo().window(parentWindow);
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
	
	
	

}
