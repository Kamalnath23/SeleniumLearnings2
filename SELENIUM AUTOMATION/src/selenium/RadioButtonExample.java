package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RadioButtonExample {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://testautomation.co/webelements/");
		List<WebElement> browserradios = driver.findElements(By.name("browser"));
		//browserradios.get(1).click();
		for(WebElement radio:browserradios)
		{
			System.out.println(radio.getAttribute("value"));
			if (radio.getAttribute("value").equals("ie"))
			{
				radio.click();
			}
				
		}
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
