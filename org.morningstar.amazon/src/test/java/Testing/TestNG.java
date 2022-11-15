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

public class TestNG {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit TestNG");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test TestNG");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test TestNG");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite TestNG");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod TestNG");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod TestNG");
	}
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass TestNG");
	}
	
	@Test
	public void TC01() {
		System.out.println("Test Case 01 TestNG");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass TestNG");
	}
}
