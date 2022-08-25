package testCases;

import static org.testng.Assert.assertEquals;

import org.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjectModel.Registration_Page;

public class TC_RF_001 extends BaseClass {
	
	@Test
	public void validating_With_Mandatry_Field() throws InterruptedException {
		Registration_Page.getInstance().getMyAccount().click();
		Registration_Page.getInstance().getREGISTER().click();
		String currentTitle = BaseClass.getDriver().getTitle();
		assertEquals(currentTitle, "Register Account");
		Registration_form();
	}
	
	private void Registration_form() throws InterruptedException {
		Registration_Page.getInstance().getFIRST_NAME().sendKeys("MOHAMMED");
		Registration_Page.getInstance().getLAST_NAME().sendKeys("ASIF");
		Registration_Page.getInstance().getEMAIL().sendKeys("mohaideenasif90@yahoo.com");
		Registration_Page.getInstance().getPASSWORD().sendKeys("asifana");
		
		Registration_Page.getInstance().getPRIVACY_POLICY().click();
				
		Registration_Page.getInstance().getCONTINUE().click();
		String afterRegFormFill = BaseClass.getDriver().getTitle();
		System.out.println(afterRegFormFill);
		System.out.println();
	}
	
	
	

}
