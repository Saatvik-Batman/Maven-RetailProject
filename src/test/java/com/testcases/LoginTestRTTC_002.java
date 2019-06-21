package com.testcases;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.All.POM.LoginPOM;

import junit.framework.Assert;

public class LoginTestRTTC_002 {
	
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
		
		LoginPOM login = new LoginPOM(driver);
		login.enterEmail("xyza@gmail.com");
		login.enterPassword("abcd");
		login.waitTo();
		login.clickLogin();
		login.waitTo();
		String name = driver.findElement(By.linkText("munna")).getText();
		Assert.assertEquals(name, "munna");
		System.out.println("The name is verified: "+name);
		login.quit();

}
}
