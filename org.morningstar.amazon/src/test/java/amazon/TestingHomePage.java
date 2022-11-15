package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\data\\Selenium-Java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ref=nav_logo"); //https://www.amazon.in/ref=nav_logo
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

}
