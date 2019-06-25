package com.testcases.medium;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.medium.AllowsAdminToChangeOrderPOM;

public class AllowsAdminToChangeOrderRTTC_046 {
	
	WebDriver driver;
	Actions action;
	
	//int timeoutInSeconds = 10;
	@Test
	public void verifyUser() throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String path = "E://Selenium Latest Software//chromedriver.exe";
		System.setProperty(key , path);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://retailm1.upskills.in/admin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		AllowsAdminToChangeOrderPOM atco = new AllowsAdminToChangeOrderPOM(driver, action);
		atco.adminEmail("admin");
		atco.adminPass("admin@123");
		atco.clickLogin();
		atco.shoppingIcon();
		atco.clickOrder();
		if(driver.findElement(By.xpath("//tr[1]//td[8]//a[2]")).isDisplayed())
		{
		atco.editIcon();
		//wait = new WebDriverWait(driver, timeoutInSeconds);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='button-customer']")));
		//Thread.sleep(3000);
		}else{
			System.out.println("Element Not FOund: Hence Quit at editIcon()");
			atco.quitNow();
		}
		//WebElement web;//wait = new WebDriverWait(driver, timeoutInSeconds);
		//web = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='button-customer']")));
		Thread.sleep(3000);
		atco.clickContinue();
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//tbody[@id='cart']//td[@class='text-left'][contains(text(),'Nullam sodales in purus vel auctor')]")).isDisplayed())
		{
			atco.removeIcon();
//		}else if(driver.findElement(By.xpath("//tbody[@id='cart']//td[@class='text-left'][contains(text(),'Finger Ring')]")).isDisplayed()){
//			atco.removeIcon();
//			atco.addProduct();
		}else{
			System.out.println("Element not find: HENCE QUit at removeIcon()");
			atco.quitNow();
		}
		atco.chooseProduct("Finger Ring");
		atco.JustClick();
		atco.chooseQuantity(1);
		Thread.sleep(3000);
		atco.addProduct();
		atco.clickContinue();
		String text = driver.findElement(By.xpath("//a[contains(text(),'3. Payment Details')]")).getText();
		if(text.contains("Payment Details")){
			atco.clickContinue();
		}else{
			System.out.println("Not found on page :Payment details ,Hence quit");
			atco.quitNow();
		}
		atco.clickContinue();
		atco.clickSave();
		String msgConfirmText = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(msgConfirmText, "Success: You have modified orders!");
		System.out.println("Successfully Comleted Test Case");
		atco.quitNow();

}
}
