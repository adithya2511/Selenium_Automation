package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void  enterText_intoDisabledTextbox () throws InterruptedException {
		driver.get("file:///C:/Users/devik/OneDrive/Desktop/note%20pad/java.html");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementByid('t1').value='adithya'");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('t2').value = ' ' ");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('t2').value = 'Before button' ");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('t2').value = 'Next button' ");
	}
	@Test
	public void scrollByActions () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(100,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(100,-1000)");
	}
}
