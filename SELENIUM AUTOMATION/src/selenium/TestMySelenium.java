package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMySelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium");
		
		System.setProperty("webdriver.chrome.driver", "D:\\IT Skill Up Zone - Practicals\\SELENIUM AUTOMATION FROM BASICS\\Chrome\\chromedriver.exe");
		System.out.println("Chrome property defined");
		
		// WebdriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Initiate google chrome");
		
		driver.get("https://www.google.com");
		System.out.println("Google website opened.");
		
		WebElement mail=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
		mail.click();
		//driver.quit();
		//System.out.println("Quit Chrome");
	}

}
