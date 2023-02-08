package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void frame_function () throws InterruptedException {
		driver.get("file:///C:/Users/devik/OneDrive/Desktop/note%20pad/page2.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'a1']")).sendKeys("adithya");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("a2")).sendKeys("12345678");
	}
}
