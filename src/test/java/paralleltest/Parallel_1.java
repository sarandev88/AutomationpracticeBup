package paralleltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parallel_1 {
	
	private void facebook() {
		System.setProperty("webdriver.chrome.driver", "D:\\saranya\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
 
	}
	
	private void insta() {
		System.setProperty("webdriver.chrome.driver", "D:\\saranya\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

}