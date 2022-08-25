package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page {
	private static Registration_Page instance;
	private Registration_Page() {
	}
	public static Registration_Page getIntance() {		
		if (instance==null) {
			instance=new Registration_Page();			
		}
		return instance;
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private  WebElement MyAccount;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement REGISTER;
	public static Registration_Page getInstance() {
		return instance;
	}
	


	@FindBy(id="input-firstname")
	private WebElement FIRST_NAME;
	@FindBy(id="input-lastname")
	private WebElement LAST_NAME;
	@FindBy(id="input-email")
	private WebElement EMAIL;
	@FindBy(id="input-password")
	private WebElement PASSWORD;
	@FindBy(xpath="//div[@class='col-sm-10']//following::input[@id='input-newsletter-yes']")
	private WebElement NEWS_LETTER;
	@FindBy(xpath="//input[@name='agree']")
	private WebElement PRIVACY_POLICY;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement CONTINUE;
	
	
	public WebElement getMyAccount() {
		return MyAccount;
	}
	public WebElement getREGISTER() {
		return REGISTER;
	}
	public WebElement getFIRST_NAME() {
		return FIRST_NAME;
	}
	public WebElement getLAST_NAME() {
		return LAST_NAME;
	}
	public WebElement getEMAIL() {
		return EMAIL;
	}
	public WebElement getPASSWORD() {
		return PASSWORD;
	}
	public WebElement getNEWS_LETTER() {
		return NEWS_LETTER;
	}
	public WebElement getPRIVACY_POLICY() {
		return PRIVACY_POLICY;
	}
	public WebElement getCONTINUE() {
		return CONTINUE;
	}

	

	
}
