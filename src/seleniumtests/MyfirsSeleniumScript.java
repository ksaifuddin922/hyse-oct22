package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyfirsSeleniumScript {

	public void launchBrowser() throws InterruptedException {

		try {
			String Ecpected = "Facebook – log in";

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Khaja Saifuddin\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			String Actual = driver.getTitle();
			/*
			 * if (Ecpected.equals(Actual)) { System.out.println("Passed"); }else {
			 * System.out.println("Fail"); } System.out.println(driver.getTitle());
			 * driver.navigate().refresh(); driver.quit();
			 */

			// driver.findElement(By.id("email")).sendKeys("admin");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws InterruptedException {
		MyfirsSeleniumScript chromeBrowser = new MyfirsSeleniumScript();
		chromeBrowser.launchBrowser();
	}

}
