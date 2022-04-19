package com.amazon.web.applicaion;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {

		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/dp/B09V4B6K53/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=c5ff115c1ba1d9f7edec86bc8c6a4f99&hsa_cr_id=9638012290402&pd_rd_plhdr=t&pd_rd_r=d050e0de-1fcf-4e64-9d51-1aa0670bcdf0&pd_rd_w=igqJ1&pd_rd_wg=yA87q&ref_=sbx_be_s_sparkle_mcd_asin_0_img");
driver.manage().window().maximize();

LoginFunctionality l=new LoginFunctionality(driver);
l.LoginFunctionality_valid();

searchvalid s=new searchvalid(driver);
s.search_valid();
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
s.product.click();

ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));
js.executeScript("window.scrollBy(0,700)");
Thread.sleep(2000);

s.navigate_addcart();
}
}
