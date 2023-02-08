package selenium;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsClass {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void contextClick () throws InterruptedException, AWTException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("adithyaveldandi");
		Actions action = new Actions(driver);
		action.contextClick(username).perform();
		Thread.sleep(3000);
	}
	@Test
	public void dragAndDrop () throws InterruptedException {
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement dragLoc = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropLoc = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = new Actions(driver);
//		actions.dragAndDrop(dragLoc, dropLoc).perform();
//		actions.moveToElement(dragLoc).clickAndHold().release(dropLoc).perform();
		actions.doubleClick(dragLoc).clickAndHold().release(dropLoc).perform();
	}
}
