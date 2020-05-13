package session5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMTest {
	WebDriver driver;

	public void loginTest() {

		String browser = "firefox";

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\basil\\Winter2020 selenium\\class5\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\basil\\Winter2020 selenium\\class5\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}

}
