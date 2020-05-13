package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
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

		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.linkText("java.applet")).click();
		Thread.sleep(2000);

		//driver.switchTo().frame(1);
		//driver.findElement(By.linkText("AppletContext")).click();
		
		driver.switchTo().parentFrame();
		String str = driver.findElement(By.xpath("/html/body/div[3]/h1/text()[1]")).getText();
		System.out.println(str);
		
		
		
	
	}




}
