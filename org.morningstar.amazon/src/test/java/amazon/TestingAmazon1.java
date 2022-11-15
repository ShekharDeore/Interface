package amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import util.UtilityClass;

public class TestingAmazon1 extends BaseClass{

	
//	WebDriver driver;
	String homePageTitle;
	LoginPage loginPage;
	LogOut logOut;
	HomePage homePage;
	
	@BeforeClass
	@Parameters({"browser"})
	public void beforeClass(String browserValue) {
		launchBrowser(browserValue);
//		launchBrowser("FireFox");
//		launchBrowser("edge");
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		loginPage = new LoginPage(driver);
//		UtilityClass uc = new UtilityClass();
		loginPage.moveCursorOnSign();
		loginPage.clickOnSignIn();
		loginPage.enterEmailId(UtilityClass.fetchDataFromExecl(0, 0));
		loginPage.clickOnContinueButton();
		loginPage.enterPassword(UtilityClass.fetchDataFromExecl(0, 1));
		loginPage.clickOnsignInSubmit();
		homePageTitle = driver.getTitle();
		
	}
	
	@Test
	public void testCase() throws InterruptedException, IOException {
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
//		homePage.clickOnSelectQuantityNumber();
		homePage.clickOnProceedToCheckout();
		homePage.clickOnUseThisAddress();
//		UtilityClass.takeScreenShot(driver);
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
	public void afterMethod() throws InterruptedException, IOException{
//System.out.println("afterMethod");
		logOut = new LogOut(driver);
//		logOut.clickOnAmazonIn();
		logOut.switchTO1();
		loginPage.moveCursorOnSign();
		logOut.clickOnSignOut();
	}
	@AfterClass
	public void afterClass() {
//		System.out.println("after class");
		driver.quit();
	}
	
}
