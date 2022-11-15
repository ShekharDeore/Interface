package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg1 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Test
	public void TC01() {
		System.out.println("Test Case 01");
	}
	@Test
	public void TC02() {
		System.out.println("Test Case 02");
	}
	@Test
	public void TC03() {
		System.out.println("Test Case 03");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
}

