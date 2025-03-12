package com.genricUtlity;

import org.openqa.selenium.WebDriver;

public class WebdriverUtlity {
	WebDriver driver;
	public void CloseBrowser(WebDriver driver) {
		driver.close();
	}
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	public void getUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	public static void main(String[] args) {
		System.out.println("this is the webdriver utlity");
		System.out.println("This line is created by vishnu");
		System.out.println("Hi==>Anjali");
		System.out.println("my name is sumit");
		
		
	}

}
