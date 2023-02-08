package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Select_ListBox {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void getOptions () {
		driver.get("file:///C:/Users/devik/OneDrive/Desktop/note%20pad/cricket.html");
		WebElement list = driver.findElement(By.id("abc"));
		Select select = new Select(list);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("number of elements in the table = " + size);
	}
}