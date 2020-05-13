package session5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {

		// setting the properties for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// creating web driver object
		driver = new ChromeDriver();
		// maximizing window
		driver.manage().window().maximize();

		// delete cookies
		driver.manage().deleteAllCookies();
		// implicitywait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		
		
		driver.getTitle();
		
		
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[@id='header-desktop-search-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
	
	
	
	for(String i : driver.getWindowHandles()) {
		System.out.println(i);
		driver.switchTo().window(i);
	}
	
	
	
	}
}
