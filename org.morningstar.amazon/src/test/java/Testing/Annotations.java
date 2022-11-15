package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit Annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
	}
	
	@Test
	public void TC01() {
		System.out.println("This is Test Case 01 Annotation");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Annotation");
	}
}
