package com.All.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyTheDetailsPOM {
	
	WebDriver driver;
	
	private By EditAccount = By.linkText("Edit your account information");
//	private By FirstName = By.name("firstname");
//	private By LastName = By.xpath("//input[@id='input-lastname']");
//	private By Email = By.xpath("//input[@id='input-email']");
//	private By Telephone
	public ModifyTheDetailsPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	public void editAccount()
	{
		driver.findElement(EditAccount).click();
	}

}
