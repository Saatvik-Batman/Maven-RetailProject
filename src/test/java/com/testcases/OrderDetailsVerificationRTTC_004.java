package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.All.POM.LoginPOM;
import com.All.POM.OrderDetailsPOM;

public class OrderDetailsVerificationRTTC_004 {
	
	WebDriver driver;
	Actions action;
	@Test
	public void verifyUser() throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String path = "E://Selenium Latest Software//chromedriver.exe";
		System.setProperty(key , path);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://retailm1.upskills.in/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPOM lp = new LoginPOM(driver);
		lp.enterEmail("xyza@gmail.com");
		lp.enterPassword("abcd");
		lp.clickLogin();
		
		OrderDetailsPOM od = new OrderDetailsPOM(driver, action);
		od.hoverIcon();
		od.clickOrders();
		od.clickViewIcon();
		String texts = driver.findElement(By.xpath("//td[contains(text(),'Order Details')]")).getText();
		if(texts.contains("Order Details")){
			System.out.println("String Matched : Successful");
		}else{
			System.out.println("Not matched");
		}
		od.quit();
	
	
	}
}
