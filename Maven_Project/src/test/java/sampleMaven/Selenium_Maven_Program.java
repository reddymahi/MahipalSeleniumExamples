package sampleMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Selenium_Maven_Program {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://rightstart.com/");
	 driver.findElement(By.linkText("Sign In")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
