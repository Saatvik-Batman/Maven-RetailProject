package com.testcases.medium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pom.medium.AllowsAdminToChangeOrderPOM;
import com.pom.medium.AllowsAdminToFilterDetailsPOM;

public class AllowAdminToFilterDetailsRTTC_047 {
	
	WebDriver driver;
	Actions action;
	Select dropdown;
	
	//int timeoutInSeconds = 10;
	@Test
	public void verifyAdmin() throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String path = "E://Selenium Latest Software//chromedriver.exe";
		System.setProperty(key , path);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://retailm1.upskills.in/admin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		AllowsAdminToChangeOrderPOM atc = new AllowsAdminToChangeOrderPOM(driver, action);
		atc.adminEmail("admin");
		atc.adminPass("admin@123");
		atc.clickLogin();
		atc.shoppingIcon();
		atc.clickOrder();
		
		AllowsAdminToFilterDetailsPOM at = new AllowsAdminToFilterDetailsPOM(driver, dropdown);
		at.dateaddedCalender();
		driver.findElement(By.xpath("//td[text()='24']")).click();
		Thread.sleep(5000);
		at.clickFilter();
		Thread.sleep(5000);
		driver.quit();
		
	}	

}
