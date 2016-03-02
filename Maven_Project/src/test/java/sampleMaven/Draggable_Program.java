package sampleMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Draggable_Program {
	
	public WebDriver driver;
	
  @Test
  public void testDraggable_Program() throws InterruptedException {
	  
	  driver.get("http://jqueryui.com/");
	  driver.findElement(By.linkText("Draggable")).click();
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement drag=driver.findElement(By.id("draggable"));
	  Actions a = new  Actions(driver);
	  a.dragAndDropBy(drag, 150, 250).perform();
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
