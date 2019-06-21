package com.testcases;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.All.POM.RegistrationPOM;

public class RegistrationTestRTTC_001 {
	
	WebDriver driver;
	Select dropdown;
	//WebElement finder;
	@Test
	public void createUser() throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String path = "E://Selenium Latest Software//chromedriver.exe";
		System.setProperty(key , path);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://retailm1.upskills.in/account/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		RegistrationPOM rp = new RegistrationPOM(driver, dropdown);//, finder);
		rp.firstName("saatvik");
		rp.lastName("sharma");
		rp.enterEmail("saatvik.one@xyz.com");
		rp.enterTelephone(874465700);
		rp.enterAdress1("this is a testing string");
		rp.enterAddress2("This is again a testing string");
		rp.enterCity("Banglore");
		rp.postCode(244001);
		rp.dropCountry("Australia");
		rp.dropRegionOrState("Karnataka");
		rp.enterPassword("saatvik");
		//rp.enterPassword2("saatvik");
		rp.tickNewsLetter();
		rp.privacePolicy();
		rp.clickContinue();
		Thread.sleep(5000);
		rp.quit();
		
	}

}
