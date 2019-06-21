package com.All.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrderDetailsPOM {
	
	WebDriver driver;
	Actions action;
	
	private By Icon = By.xpath("//i[@class='fa fa-user-o']");
	private By Orders = By.xpath("//span[contains(text(),'MY ORDERS')]");
	private By ViewIcon = By.xpath("//td[@class='text-right']//a[@class='btn btn-default tb_no_text']");
	
	public OrderDetailsPOM(WebDriver driver, Actions action)
	{
		this.driver = driver;
		this.action = action;
	}
	public void hoverIcon()
	{
		WebElement element = driver.findElement(Icon);
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void clickOrders()
	{
		driver.findElement(Orders).click();
	}
	public void clickViewIcon()
	{
		driver.findElement(ViewIcon).click();
	}
	public void quit()
	{
		driver.quit();
	}

}
