package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println("Its page source - " + driver.getPageSource());
		// WebElement searchBox = driver.findElement(By.name("q"));
		// input[@title='Search' and @type='text']
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search' and @type='text']"));
		searchBox.sendKeys("TestAutomation.co");
		WebElement submitSearchBtn = driver.findElement(By.name("btnK"));
		submitSearchBtn.submit();
//		
		driver.quit();
	}

}
