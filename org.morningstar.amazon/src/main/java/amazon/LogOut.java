package amazon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut {

	WebDriver driver;
	JavascriptExecutor js ;

	public LogOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		js = ((JavascriptExecutor)driver);
	}


//	@FindBy(xpath = "//i[@class='a-icon a-icon-domain-in a-icon-domain clickable-heading']")
//	private WebElement amazonInForHomePage;

	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signOut;

	
//	public void clickOnAmazonIn() {
		//		js = ((JavascriptExecutor)driver);
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='a-icon a-icon-domain-in a-icon-domain clickable-heading']")));
//		js.executeScript("arguments[0].click()", wb);
//		amazonInForHomePage.click();
//	}
	
	public void switchTO1() {
		ArrayList<String> allId =  new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allId.get(0));

//		String str = driver.getWindowHandle();
//		driver.switchTo().window(str);
//		System.out.println("1");
		
	}

	public void clickOnSignOut() {
		signOut.click();
	}
}
