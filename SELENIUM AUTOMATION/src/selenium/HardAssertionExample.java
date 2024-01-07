package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class HardAssertionExample {
	WebDriver driver;
  @Test
  public void testHardAssertion() {
	  driver.get("https://www.google.com");
	  	
	  
		String titleOfGoogleHomePage = driver.getTitle();
		System.out.println("Actual title "+titleOfGoogleHomePage);
		
      String expectedTitleOfGoogleHomePate = "Google";
     
      //searchTerm = "TestAutomation.co";
      Assert.assertEquals(expectedTitleOfGoogleHomePate, titleOfGoogleHomePage);	
      
      /**
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search' and @type='text']"));
		Assert.assertNotNull(searchTerm);
		searchBox.sendKeys(searchTerm);
		WebElement submitSearchBtn = driver.findElement(By.name("btnK"));
		submitSearchBtn.submit(); **/
  }
  
  @Test
  public void testHardAssertion2() {
	  driver.get("https://www.google.com");
	  String searchTerm = null;
	  WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	  
	  searchBox.click();
	  searchBox.sendKeys("Virat Kholi");
	  
	  
	  WebElement vk= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div"));
	  vk.click();
	  //  /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
	  // //input[@title='Search' and @type='text']
	/**	Assert.assertNotNull(searchTerm);
		searchBox.sendKeys(searchTerm);
		WebElement submitSearchBtn = driver.findElement(By.name("btnK"));
		submitSearchBtn.submit(); **/
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
