package com.amazon.web.applicaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality {

	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signin;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continu;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement login;
	
	public LoginFunctionality(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
    public void Signin()
    {
    	signin.click();
    }
    public void LoginFunctionality_valid() throws InterruptedException
    {
    	signin.click();
    	email.sendKeys("8297108555");
    	Thread.sleep(2000);
    	continu.click();
    	pwd.sendKeys("14111984");
    	Thread.sleep(2000);
    	login.click();
    }

}

