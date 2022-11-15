package amazon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	JavascriptExecutor js;
	WebElement dropdown;
	String dropdownValue;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		js=((JavascriptExecutor)driver);
	}
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBar;
	
	@FindBy(xpath="//span[text()='Apple iPhone 13 Pro (256GB) - Sierra Blue']")
	private WebElement selectProduct;
	
	@FindBy(xpath="//p[text()='256GB']")
	private WebElement selectSize;
	
	@FindBy(xpath="//img[@alt='Gold']")
	private WebElement selectColor;
	
	@FindBy(xpath="//span[text()='With Exchange']")
	private WebElement selectWithExchange;
	
	@FindBy(xpath="//span[text()='Without Exchange']")
	private WebElement selectWithOutExchange;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCartButton;
	
	
	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	private WebElement cartPopUpClose;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement cartLink;
	
//	@FindBy(xpath="//span[@class='a-button a-button-dropdown quantity']")
	@FindBy(xpath="//select[@name='quantity']")
	private WebElement selectQuantity;
	
	
	@FindBy(xpath="//a[@id='quantity_1']")
	private WebElement selectQuantityNumber;
	
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToCheckout;

	@FindBy(xpath="//input[@aria-labelledby='shipToThisAddressButton-announce']")
	private WebElement useThisAddress;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	private WebElement selectCardPayment;
	
	@FindBy(xpath="//a[text()='Enter card details']")
	private WebElement enterCardDetails;
	
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	private WebElement iframeCardDetails;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement cardNo;
	
	@FindBy(xpath="//input[@name='ppw-accountHolderName']")
	private WebElement cardName;

	@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
	private WebElement monthDropdown;
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
	private WebElement yearDropdown;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement submitCardDetails;
	
	@FindBy(xpath="//button[@class=' a-button-close a-declarative']")
	private WebElement cancleCardDetails;
	
	
	public void scrollDown() {
		js.executeScript("window.scollBy(0,1800)");
	}
	
	public void scrollUp() {
		js.executeScript("window.scollBy(1800,0)");
	}
	
	public void sendValueInSearchBar() {
		searchBar.sendKeys("iphone13+pro");
		searchBar.submit();
	}
	
	public void clickOnProduct() {
		selectProduct.click();
	}

	public void goToProductWindow() {
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
	}
	
	public void clickOnSelectSize() {
		selectSize.click();
	}
	public void clickOnSelectColor() {
		selectColor.click();
	}
	public void clickOnSelectWithExchange() {
		selectWithExchange.click();
	}
	
	public void clickOnSelectWithOutExchange() {
		selectWithOutExchange.click();
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public void clickOnCartPopUpClose() {
		cartPopUpClose.click();	
	}
	
	public void clickOnCartLink() {
		js.executeScript("arguments[0].click()", cartLink);
	}
	
	public void clickOnSelectQuantity() {
		Select select = new Select(selectQuantity);
		select.selectByValue("2");
		
//		selectQuantity.click();
	}
	
	public void clickOnSelectQuantityNumber() {
		selectQuantityNumber.click();
	}
	
	public void clickOnProceedToCheckout() {
		proceedToCheckout.click();
	}
	
	public void clickOnUseThisAddress() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='shipToThisAddressButton-announce']")));
		
		useThisAddress.click();
		Thread.sleep(3333);
//		js.executeScript("arguments[0].click()", useThisAddress);
	}
	
	public void ClickOnSelectCardPayment() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='SelectableAddCreditCard']"))).click();		
		System.out.println("here2");
		selectCardPayment.click();
		System.out.println("her3");
	}
	
	public void ClickOnEnterCardDetails() {
		enterCardDetails.click();
	}
	
	public void switchToIframeCardDetails() {
		driver.switchTo().frame(iframeCardDetails);	
	}
	
	
	public void enterCardNo() {
		cardNo.clear();
		cardNo.sendKeys("123456789101");
	}
	
	public void enterCardName() {
		cardName.clear();
		cardName.sendKeys("Shekhar Deore");
	}
	
	
//	public void selectMonthYear(int number, String value) {
//		
//		if(number==1) {
//			dropdown=monthDropdown;
//			dropdownValue=value;
//			
//		}else {
//			dropdown=yearDropdown;
//			dropdownValue=value;
//		}
//		
//		Select select = new Select(dropdown);
//		select.selectByVisibleText(dropdownValue);
//	}
	
	public void selectMonthDropdown() {
		Select select = new Select(monthDropdown);
		select.selectByVisibleText("07");
	}

	public void selectYearDropdown() {
		Select select = new Select(yearDropdown);
		select.selectByVisibleText("2030");
	}
	
	public void ClickOnsubmitEnterCardDetails() {
		submitCardDetails.click();	
	}
	
	public void clickOnCloseCardDetailsPopup() {
		cancleCardDetails.click();	
	}
}
