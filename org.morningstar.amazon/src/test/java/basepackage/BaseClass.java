package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass  {

	static String url = "https://www.amazon.in/";
	public static WebDriver driver;
	
	public static void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\data\\Selenium-Java\\chromedriver_win32(1)\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome is running...");
		}else if(browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\data\\Selenium-Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("FireFox is running...");
		}else if(browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "F:\\data\\Selenium-Java\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Edge is running...");
		}
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
}
