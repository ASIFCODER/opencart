package org.BaseClass;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.Registration_Page;

public class BaseClass {
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public void beforeMethod() {
		if (getDriver() == null) {
			browserLaunch();
			initElements();	}}

	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/upload/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	public void tearDown() {
		driver.close();;
	}

	
	
	public void initElements() {
		PageFactory.initElements(getDriver(),Registration_Page.getIntance());
	}

}
