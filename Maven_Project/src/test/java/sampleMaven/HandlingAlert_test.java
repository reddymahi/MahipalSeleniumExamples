package sampleMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandlingAlert_test {

	public WebDriver driver;

	@Test
	public void testHandlingAlert_test() throws InterruptedException {

		driver.get("http://www.kesinenitravels.com/");
		driver.findElement(By.id("ctl00_ibtnCheckFare")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_cpEndUserMain_ibtnSearch']")).click();
		Thread.sleep(2000);
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Alert message is : "+alertmsg);
		//handle alert
		driver.switchTo().alert().accept(); //to click OK on alert
//		driver.switchTo().alert().dismiss(); //to click Cancel button
		Thread.sleep(5000);

	}
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();//will launch firefox
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();//close window 
	}

}
