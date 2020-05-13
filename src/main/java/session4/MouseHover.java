package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {


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
		WebElement PRODUCT_MENU_LOCATOR = driver.findElement(By.xpath("//button[@id='11']"));
 		WebElement NETWORKING_MENU_LOCATOR = driver.findElement(By.xpath("//a[@id=\"11_5\"]/span"));
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(PRODUCT_MENU_LOCATOR).build().perform();
		Thread.sleep(1000);
		action.moveToElement(NETWORKING_MENU_LOCATOR).build().perform();
		
		
	}








}
