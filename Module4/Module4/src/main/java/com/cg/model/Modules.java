package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		PropertiesEx.readProperties();
		browser=PropertiesEx.prop.getProperty("browser");
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\madam\\eclipse-workspace\\Module4\\Module4\\src\\main\\java\\chromedriver.exe");
		}
	}
	public static void runTest() {
		driver=new ChromeDriver();
		driver.get(PropertiesEx.prop.getProperty("url"));		
	}
	public static void endTest() {
		driver.quit();
	}
}
