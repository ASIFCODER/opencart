package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import WebDriverManager.WebDriverConfig;

public class CommonUtilities {
	private static CommonUtilities instance;

	private CommonUtilities() {
	}

	public static CommonUtilities getinstance() {
		if (instance == null) {
			instance = new CommonUtilities();

		}

		return instance;

	}

	public void ScreenShotTaken() throws IOException {
		try {
			File imagefile = ((TakesScreenshot) WebDriverConfig.driver).getScreenshotAs(OutputType.FILE);
			File destionationPlace = new File("C:\\Users\\Asif\\eclipse-workspace\\OpenCart\\Screenshot");
			FileUtils.copyDirectory(imagefile, destionationPlace);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Properties propertyFileConfiguration() throws IOException {

		FileInputStream file = new FileInputStream("./PropertiFiles\\confiq.properties");
		Properties properties = new Properties();
		properties.load(file);
		return properties;
		
		
		
		
	}
	
	
	
	
	
	
	

}
