package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class ExplicitTestNG {
	WebDriver driver= null;
	
  @Test
  public void f() {
	  driver.get("https://testautomation.co/webelements/");
	 // WebDriverWait wait= new WebDriverWait(driver, "10");
	  //object wait is created
	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("explibutton")));
	  driver.findElement(By.id("explibutton")).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
