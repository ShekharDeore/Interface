package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingAmazon {

	String url = "https://www.amazon.in/";
	WebDriver driver;
	String homePageTitle;
	LoginPage loginPage;
	LogOut logOut;
	HomePage homePage;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "F:\\data\\Selenium-Java\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		loginPage = new LoginPage(driver);
		loginPage.moveCursorOnSign();
		loginPage.clickOnSignIn();
		loginPage.enterEmailId();
		loginPage.clickOnContinueButton();
		loginPage.enterPassword();
		loginPage.clickOnsignInSubmit();
		homePageTitle = driver.getTitle();
	}
	
	@Test
	public void testCase() throws InterruptedException {
		System.out.println(homePageTitle + " = nevigating to home page so test case pass");
		homePage = new HomePage(driver);
		homePage.sendValueInSearchBar();
		homePage.clickOnProduct();
		homePage.goToProductWindow();
		homePage.clickOnSelectSize();
		homePage.clickOnSelectColor();
		homePage.clickOnSelectWithExchange();
		homePage.clickOnSelectWithOutExchange();
		Thread.sleep(3333);
		homePage.clickOnAddToCartButton();
		homePage.clickOnCartPopUpClose();
		homePage.clickOnCartLink();
		homePage.clickOnSelectQuantity();
		homePage.clickOnSelectQuantityNumber();
		homePage.clickOnProceedToCheckout();
		homePage.clickOnUseThisAddress();
		Thread.sleep(5555);
		homePage.ClickOnSelectCardPayment();
		Thread.sleep(5555);
		homePage.ClickOnEnterCardDetails();
		homePage.switchToIframeCardDetails();
		homePage.enterCardNo();
		homePage.enterCardName();
//		homePage.selectMonthYear(1, "07");
//		homePage.selectMonthYear(2, "2030 ");
		homePage.selectMonthDropdown();
		homePage.selectYearDropdown();
		homePage.ClickOnsubmitEnterCardDetails();
		homePage.clickOnCloseCardDetailsPopup();
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException{
//System.out.println("afterMethod");
		logOut = new LogOut(driver);
//		logOut.clickOnAmazonIn();
		loginPage.moveCursorOnSign();
		logOut.clickOnSignOut();
	}
	@AfterClass
	public void afterClass() {
//		System.out.println("after class");
		driver.quit();
	}
	
}
