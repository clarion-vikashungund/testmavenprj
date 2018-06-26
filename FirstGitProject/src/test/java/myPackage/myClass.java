package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class myClass {
WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		String chromedriverpath = "/myGitRepo/FirstGitProject/BrowserDrivers/chromedriver_2.33.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void openGoogle() {
		System.out.println(driver.getTitle());
		System.out.println("Hello Google !!!");
		System.out.println("Welcome to  Google !!!");
		
	}
	
	
	@AfterClass
	public void afterClass() {	
		driver.close();
	}

}
