package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.CommonUtilities;
import org.utilities.Constance;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConfig {

	public static WebDriver driver;

 @BeforeSuite
	public void BeforeClass() {
		try {
			browserLaunch();
			String url = CommonUtilities.getinstance().propertyFileConfiguration().getProperty("URL");
				driver.get(url);
				} catch (Exception e) {
		}
	}

	public void browserLaunch() {

		try {

			switch ("Chrome") {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

				break;

			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();

			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
