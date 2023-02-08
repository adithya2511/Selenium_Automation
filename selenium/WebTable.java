package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void rowCount () {
		driver.get("file:///C:/Users/devik/OneDrive/Desktop/note%20pad/WebTable.html");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int totalRows = rows.size();
		System.out.println("Total rows = " + totalRows);
	}
	@Test
	public void ColumnCount () {
		driver.get("file:///C:/Users/devik/OneDrive/Desktop/note%20pad/WebTable.html");
		driver.manage().window().maximize();
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		int totalColumns = columns.size();
		System.out.println("Total Columns = " + totalColumns);
	}
	@Test
	public void CellsCount () {
		driver.get("file:///C:/Users/devik/OneDrive/Desktop/note%20pad/WebTable.html");
		List<WebElement> cells = driver.findElements(By.xpath("//th | //td"));
		int totalCells = cells.size();
		System.out.println("Total cells present in the table = " + totalCells);
	}
}
