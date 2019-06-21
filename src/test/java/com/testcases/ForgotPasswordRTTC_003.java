package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.All.POM.ForgotPasswordPOM;

public class ForgotPasswordRTTC_003 {
	
	WebDriver driver;
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
		
		ForgotPasswordPOM fp = new ForgotPasswordPOM(driver);
		fp.enterEmail("xyza@gmail.com");
		fp.enterPassword("saatvik");
		fp.clickLogin();
		WebElement falsemsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		String text1 = falsemsg.getText();
		if(falsemsg.isDisplayed() && text1.contains("Warning: No match for E-Mail Address and/or Password."))
		{
			System.out.println("String mached and found for warning");
		}
		else
		{
			System.out.println("String not matched");
		}
		fp.clickForgotPassword();
		fp.enterMyEmail("xyza@gmail.com");
		fp.clickContinue();
		String text2 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		if(text2.contains("An email with a confirmation link has been sent your email address."))
		{
			System.out.println("String mached and found for confirmation");
		}
		else
		{
			System.out.println("String not matched / found on page");
		}
		fp.quit();
		}
		
				

}

