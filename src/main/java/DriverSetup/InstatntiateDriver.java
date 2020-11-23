package DriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InstatntiateDriver {
	public static WebDriver driver;
	public WebDriver setPath() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00422mh\\eclipse-workspace\\DemoBlaze\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
}
