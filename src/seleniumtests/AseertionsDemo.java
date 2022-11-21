package seleniumtests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AseertionsDemo {

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("THis is my before method ");
		throw new ArithmeticException("Trying ");

	}

	@Test
	public void myTest1() {
		String ExpetedResult = "Test Automation";
		System.out.println("myTest1 ");
		Assert.assertEquals("Test", ExpetedResult);

	}

	@Test
	public void myTest2() {
		System.out.println("myTest2 ");
		String ExpetedResult = "Test Automation";
		System.out.println("myTest1 ");
		Assert.assertEquals("Test Automation", ExpetedResult);

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("afterMethod ");

	}

}
