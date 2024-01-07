package selenium;

import org.testng.annotations.Test;

import bsh.util.Util;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ViratKholi {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search' and @type='text']"));
		searchBox.sendKeys("Virat Kholi");
		WebElement submitSearchBtn = driver.findElement(By.name("btnK"));
		submitSearchBtn.submit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement vk_wikipedia= driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div[1]/div/div/div/span[2]/a"));
		vk_wikipedia.click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }
  

}
