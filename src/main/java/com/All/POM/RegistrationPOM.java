package com.All.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM {
	
	WebDriver driver;
	Select dropdown;
	//WebElement finder;
	
private	By FirstName = By.xpath("//input[@id='input-firstname']");
private	By LastName = By.xpath("//input[@id='input-lastname']");
private	By Email = By.xpath("//input[@id='input-email']");
private	By Telephone = By.xpath("//input[@id='input-telephone']");
private	By Address1 = By.xpath("//input[@id='input-address-1']");
private	By Address2 = By.xpath("//input[@id='input-address-2']");
private	By City = By.xpath("//input[@id='input-city']");
private	By PostCode = By.xpath("//input[@id='input-postcode']");
private	By DropDownCountry = By.name("country_id");
private	By DropDownRegionOrState = By.name("zone_id");
private	By Password = By.xpath("//input[@id='input-password']");
private	By PasswordConf = By.xpath("//input[@id='input-confirm']");
private	By NewsLetter = By.xpath("//label[contains(text(),'No')]");
private	By PrivacyPolicy = By.xpath("//input[@name='agree']");
private	By Continue = By.xpath("//input[@class='btn btn-primary']");
	
	public RegistrationPOM(WebDriver driver, Select dropdown)//, WebElement finder)
	{
		this.driver = driver;
		this.dropdown = dropdown;
	}
	public void firstName(String fname)
	{
		driver.findElement(FirstName).clear();
		driver.findElement(FirstName).sendKeys(fname);;
	}
	public void lastName(String lname)
	{
		driver.findElement(LastName).clear();
		driver.findElement(LastName).sendKeys(lname);;
	}
	public void enterEmail(String emailE)
	{
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys(emailE);;
	}
	public void enterTelephone(long etele)
	{
		driver.findElement(Telephone).clear();
		driver.findElement(Telephone).sendKeys(String.valueOf(etele));
	}
	public void enterAdress1(String eadd1)
	{
		driver.findElement(Address1).sendKeys(eadd1);
	}
	public void enterAddress2(String eadd2)
	{
		driver.findElement(Address2).sendKeys(eadd2);
	}
	public void enterCity(String ecity)
	{
		driver.findElement(City).sendKeys(ecity);
	}
	public void postCode(int pcode)
	{
		driver.findElement(PostCode).clear();
		driver.findElement(PostCode).sendKeys(String.valueOf(pcode));
	}
	public void dropCountry(String dcountry)
	{
		WebElement finder = driver.findElement(DropDownCountry);
		dropdown = new Select(finder);
		dropdown.selectByVisibleText(dcountry);
	}
	public void dropRegionOrState(String dregionorstate)
	{
		WebElement finder1 = driver.findElement(DropDownRegionOrState);
		dropdown = new Select(finder1);
		dropdown.selectByVisibleText(dregionorstate);
	}
	public void enterPassword(String pwd1)
	{
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(pwd1);
	}
	public void enterPassword2(String pwd2)
	{
		driver.findElement(PasswordConf).sendKeys(pwd2);
	}
	public void tickNewsLetter()
	{
		driver.findElement(NewsLetter).click();
	}
	public void privacePolicy()
	{
		driver.findElement(PrivacyPolicy).click();
	}
	public void clickContinue()
	{
		driver.findElement(Continue).click();
	}
	public void quit()
	{
		driver.quit();
	}
	

}
