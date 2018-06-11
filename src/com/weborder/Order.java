package com.weborder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ivka/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx ");

	}

}
