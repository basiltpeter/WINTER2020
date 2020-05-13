package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

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

		driver.get("http://techfios.com/test/billing/?ng=admin/");
		Thread.sleep(2000);

		WebElement USERNAME_ELEMENT = driver.findElement(By.id("username"));
		
		//identifying the username box and passing username
		USERNAME_ELEMENT.clear();
		USERNAME_ELEMENT.sendKeys("techfiosdemo@gmail.com");

		// identifying the password box and passing password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identifying the login button and click it
		//driver.findElement(By.name("login")).click();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();
		
		
		
		
		
		

	}

}
