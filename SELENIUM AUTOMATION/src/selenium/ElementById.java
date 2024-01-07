package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementById {
	WebDriver driver = null;
  @Test
  public void testById() {
	  driver.get("https://testautomation.co/webelements/");
		WebElement name = driver.findElement(By.id("legalname"));
		name.sendKeys("John");
		name.clear();
		name.sendKeys("John Doe");
		System.out.println("Name is dispalyed: "+name.isDisplayed());
		System.out.println("Name is enabled: "+name.isEnabled());
		System.out.println("Name is selected: "+name.isSelected());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
