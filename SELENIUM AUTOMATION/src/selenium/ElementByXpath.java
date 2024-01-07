package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementByXpath {
	WebDriver driver=null;
  @Test
  public void testByXpath() {
	  driver.get("https://testautomation.co/webelements/");
		//driver.findElement(By.xpath("//*[@id=\"formsubmit\"]/table/tbody/tr[6]/td[1]/input")).click();;
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//xpath detected by me: //*[@id="formsubmit"]/table/tbody/tr[8]/td[1]/input
		// //*[@id="formsubmit"]/table/tbody/tr[8]/td[1]/input
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
