package amazon;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\data\\Selenium-Java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();   

		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.moveCursorOnSign();
		loginpage.clickOnSignIn();
		loginpage.enterEmailId();
		loginpage.clickOnContinueButton();
		loginpage.enterPassword();
		loginpage.clickOnsignInSubmit();
		
		
		
		

	}

}
