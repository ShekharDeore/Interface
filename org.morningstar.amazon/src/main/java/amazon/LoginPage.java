package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav-link-accountList']")
	private WebElement movingCursorTosignIn;

	@FindBy(xpath= "//span[text()='Sign in']")
	private WebElement signIn;
	
	@FindBy(xpath= "//input[@type='email']")
	private WebElement emailId;
	
	
	@FindBy(xpath= "//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath= "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath= "//input[@id='signInSubmit']")
	private WebElement signInSubmit;
	
	public void moveCursorOnSign() {
		Actions act = new Actions(driver);
		act.moveToElement(movingCursorTosignIn).perform();
	}
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void enterEmailId(String userName) {
//		emailId.sendKeys("7248915615");
		emailId.sendKeys(userName);
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public void enterPassword(String pass) {
//		emailId.sendKeys("nikhilshekhar@17");
		password.sendKeys(pass);
	}
	
	public void clickOnsignInSubmit() {
		signInSubmit.click();
	}
}
