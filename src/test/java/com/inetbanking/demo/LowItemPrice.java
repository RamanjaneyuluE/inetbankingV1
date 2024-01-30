package com.inetbanking.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LowItemPrice {
	
	WebDriver driver;
	WebDriverWait wait;
	String item ="Phones";
	@Test
	public void GetLowPrice() throws Exception
	{
	//WebDriverManager.chromedriver().setup();
	
	//driver = new ChromeDriver();
		 driver = new HtmlUnitDriver();
	driver.get("https://www.demoblaze.com/");
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.className("list-group")));
	if(item.equalsIgnoreCase("Phones")) {
		driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
		Thread.sleep(3000);
		
	}
	else if(item.equalsIgnoreCase("Laptops")) {
		driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
		Thread.sleep(3000);
		
	}
	else if(item.equalsIgnoreCase("Monitors")) {
		driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
		Thread.sleep(3000);
		
	}
	
	List<WebElement> ele = driver.findElements(By.cssSelector(".card-block>h5"));
	String min=ele.get(0).getText().substring(1);
	int minvalue=Integer.parseInt(min);
	
	
	for(int i=1; i<ele.size();i++) {
		
		String price= ele.get(i).getText().substring(1);
		int actualprice =Integer.parseInt(price);
		if(actualprice < minvalue) {
			minvalue=actualprice;
		}
		
		
	}
	
	
	System.out.println("The minimum price of the " + item + " is :" + "$" + minvalue);
	
	
	
	
	
	}
	
	

}
