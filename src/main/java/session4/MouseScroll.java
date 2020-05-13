package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScroll {

	
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

		driver.get("https://www.dell.com/en-us");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,600)");
		
		
	}






}
