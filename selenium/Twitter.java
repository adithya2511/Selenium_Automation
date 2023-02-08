package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Twitter {
		public WebDriver driver;
		@BeforeTest
		public void setup () {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	@Test
	public void webElements () throws InterruptedException {
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(3000);
		driver.findElement(By.name("text")).sendKeys("adithyaveldandi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.findElement(By.xpath("//span[@dir='ltr']")).sendKeys("adithya123");
		driver.findElement(By.name("password")).sendKeys("4893483984");
	}
}
