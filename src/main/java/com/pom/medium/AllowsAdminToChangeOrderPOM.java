package com.pom.medium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AllowsAdminToChangeOrderPOM {
	
	WebDriver driver;
	Actions action;
	
	
	private By AdminEmail = By.xpath("//input[@id='input-username']");
	private By AdminPassword = By.xpath("//input[@id='input-password']");
	private By ClickLogin = By.xpath("//button[@class='btn btn-primary']");
	private By ShoppingIcon = By.xpath("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-sale']/a[1]");
	private By Orders = By.linkText("Orders");
	private By EditIcon = By.xpath("//tr[1]//td[8]//a[2]");
	private By Continue = By.xpath("//button[@id='button-customer']");
	private By RemoveIcon = By.xpath("//button[@class='btn btn-danger']");
	private By ChooseProduct = By.name("product");
	private By ChooseQuantity = By.name("quantity");
	private By AddProduct = By.id("button-product-add");
	private By Savebutton = By.id("button-save");
	private By JustClick = By.xpath("//li[@class='active']//a[contains(text(),'Products')]");
	
	
	
	public AllowsAdminToChangeOrderPOM(WebDriver driver, Actions action)
	{
		this.driver=driver;
		this.action=action;
	}
	//LOAD THE PROPERTIES FILE
	
	
	public void adminEmail(String aemail)
	{
		driver.findElement(AdminEmail).sendKeys(aemail);
	}
	public void adminPass(String pwd)
	{
		driver.findElement(AdminPassword).sendKeys(pwd);
	}
	public void clickLogin()
	{
		driver.findElement(ClickLogin).click();;
	}
	public void shoppingIcon()
	{
		WebElement element = driver.findElement(ShoppingIcon);
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void clickOrder()
	{
		driver.findElement(Orders).click();
	}
	public void editIcon()
	{
		driver.findElement(EditIcon).click();
	}
	public void clickContinue()
	{
		driver.findElement(Continue).click();
	}
	public void removeIcon()
	{
		driver.findElement(RemoveIcon).click();
	}
	public void chooseProduct(String product)
	{
		driver.findElement(ChooseProduct).clear();
		driver.findElement(ChooseProduct).sendKeys(product);
	}
	public void chooseQuantity(int quantity)
	{
		driver.findElement(ChooseQuantity).clear();
		driver.findElement(ChooseQuantity).sendKeys(String.valueOf(quantity));
	}
	public void addProduct()
	{
		driver.findElement(AddProduct).click();
	}
	public void clickSave()
	{
		driver.findElement(Savebutton).click();
	}
	public void JustClick()
	{
		driver.findElement(JustClick).click();
	}
	public void quitNow()
	{
		driver.quit();
	}
}
