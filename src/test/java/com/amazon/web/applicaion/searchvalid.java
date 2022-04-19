package com.amazon.web.applicaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchvalid {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchtext;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchbutton;
	
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	WebElement product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addcart;
	
	public searchvalid(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search_valid() throws InterruptedException
	{
		searchtext.sendKeys("iphone");
		Thread.sleep(2000);
		searchbutton.click();
		Thread.sleep(2000);
		//product.click();
	}
	public void navigate_addcart()
	{
		addcart.click();
	}
}
