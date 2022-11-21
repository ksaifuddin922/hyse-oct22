package seleniumtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {

	@BeforeSuite
	public void method1() {
		try {
			System.out.println("before Suite");
			System.out.println("");
			
		} catch (Exception e) {
			
		}

		

	}
	@BeforeTest
	public void method2() {

		System.out.println("Before Test");

	}

	@Test
	public void method3() {

		System.out.println("Test case1");

	}
	@Test
	public void method4() {

		System.out.println("Test case2");

	}
	@BeforeMethod
	public void method41() {

		System.out.println("Before Method");

	}
	@AfterMethod
	public void method12() {

		System.out.println("after Method");

	}

	@AfterTest
	public void method5() {

		System.out.println("after test");

	}
@AfterSuite
	public void method6() {

		System.out.println("after suite");

	}
}
