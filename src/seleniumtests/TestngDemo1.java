package seleniumtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo1 {
	@Test(groups = "Sanity")
	public void method3() {

		System.out.println("Sanity");

	}

	@Test(groups = "Regression")
	public void method4() {

		System.out.println("Regression");

	}

	@BeforeMethod
	public void method41() {

		System.out.println("Before Method");

	}

	@AfterMethod
	public void method12() {

		System.out.println("after Method");

	}
}
