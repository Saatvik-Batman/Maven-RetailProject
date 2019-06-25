package com.pom.medium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllowsAdminToFilterDetailsPOM {

	WebDriver driver;
	Actions action;
	Select dropdown;
	
	private By OrderID = By.xpath("//input[@name = 'filter_order_id' ]");
	private By Filter = By.xpath("//button[@id = 'button-filter']");
	private By DropDownOrderStatus = By.xpath("//select[@id = 'input-order-status']");
	private By DateAddedCalender  = By.xpath("//*[@type = 'button']//following::button[4]");
	private By DateAddedField = By.xpath("//input[@id='input-date-added']");
	private By DateModifiedCalender = By.xpath("//*[@type = 'button']//following::button[5]");
	
	
	
	public AllowsAdminToFilterDetailsPOM(WebDriver driver,Select dropdown)
	{
		this.driver=driver;
		this.dropdown=dropdown;
	}
	public void orderId(int id)
	{
		driver.findElement(OrderID).sendKeys(String.valueOf(id));
	}
	public void clickFilter()
	{
		driver.findElement(Filter).click();
	}
	public void orderStatus(String value)
	{
		WebElement element = driver.findElement(DropDownOrderStatus);
		dropdown = new Select(element);
		dropdown.selectByValue(value);
	}
//	public void dateAddedField(String dateadd)
//	{
//		driver.findElement(DateAddedField).sendKeys(dateadd);
//	}
	public void dateaddedCalender()
	{
		//driver.findElement(DateAddedCalender).clear();
		driver.findElement(DateAddedCalender).click();
	}
	
}
