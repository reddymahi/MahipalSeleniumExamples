package sampleMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PractTestSample {
	public static WebDriver driver;

	@Test
	public void testSample(){
		try {
			driver.get("htps:www.google.co.uk");
			System.out.println("sample test case for");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new Error("wrong url");
			//url.getMessage();
		}
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
