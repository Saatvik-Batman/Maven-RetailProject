package com.All.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPOM {
	
	WebDriver driver;
	
	private By Email = By.xpath("//input[@id='input-email']");
	private By Password = By.xpath("//input[@id='input-password']");
	private By Login = By.xpath("//input[@class='btn btn-primary']");
	private By ForgotPassword = By.linkText("Forgotten Password");
	private By MyEmail = By.xpath("//input[@id='input-email']");
	private By ContinueButton = By.xpath("//input[@class='btn btn-primary']");
	
	
	public ForgotPasswordPOM(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enterEmail(String emailE)
	{
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys(emailE);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(pwd);
	}
	public void waitTo() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void clickLogin()
	{
		driver.findElement(Login).click();
	}
	public void clickForgotPassword()
	{
		driver.findElement(ForgotPassword).click();
	}
	public void enterMyEmail(String memail)
	{
		driver.findElement(MyEmail).sendKeys(memail);
	}
	public void clickContinue()
	{
		driver.findElement(ContinueButton).click();
	}
	public void quit()
	{
		driver.quit();
	}

}
