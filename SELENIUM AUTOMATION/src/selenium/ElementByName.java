package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementByName {
	WebDriver driver=null;
  @Test
  public void testByName() {
		driver.get("https://testautomation.co/webelements/");
        driver.findElement(By.name("yourname")).sendKeys("Mike");
        List<WebElement> names = driver.findElements(By.name("yourname"));
		names.get(1).sendKeys("Miky");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
