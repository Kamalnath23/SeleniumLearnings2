package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ImplicitTestNG {
	WebDriver driver = null;
  @Test
  public void f() {
	  driver.get("https://testautomation.co/webelements/");
		driver.findElement(By.id("link2courses")).click();
	 // driver.findElement(By.xpath("//*[@id="link2courses"]"));
			  
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.close();
  }

}
