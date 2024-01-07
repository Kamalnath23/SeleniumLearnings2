package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ImplicitWait2 {
	WebDriver driver= null;
  @Test
  public void f() {
	  
		driver.get("https://www.google.com");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println("Its page source - " + driver.getPageSource());
		//WebElement searchBox = driver.findElement(By.name("q"));
		//input[@title='Search' and @type='text']
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search' and @type='text']"));
		searchBox.sendKeys("TestAutomation.co");
		WebElement submitSearchBtn = driver.findElement(By.name("btnK"));
		submitSearchBtn.submit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
