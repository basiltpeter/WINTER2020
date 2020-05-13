package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

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

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		
		String alertMessage = driver.switchTo().alert().getText();
		
		
		System.out.println(alertMessage);
		
		driver.switchTo().alert().accept();
		
	
	}

}
