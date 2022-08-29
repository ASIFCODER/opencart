package org.BaseClass;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import WebDriverManager.WebDriverConfig;
import pageObjectModel.Registration_Page;

public class BaseClass {

	public void SendKeysAction(WebElement element, String Input) {

		element.sendKeys(Input);

	}
	public void ClickAction(WebElement element) {
		element.click();
		
	}

}
