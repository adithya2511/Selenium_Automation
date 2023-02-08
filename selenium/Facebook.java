package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void getTitle () throws InterruptedException {
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Titile = " + title);
//		driver.close();
	}
	@Test
	public void getSourceCode () throws InterruptedException {
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String source = driver.getPageSource();
		System.out.println(source);
//		driver.close();
	}
	@Test
	public void getUrl () throws InterruptedException {
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println("url = " +url);
//		driver.close();
	}
	@Test
	public void navigationPages () throws InterruptedException   {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://twitter.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void Locators () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("adithya");
		username.clear();
		Thread.sleep(3000);
		username.sendKeys("adithyasachin123@gmail.com");
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("adithya");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("9381260035");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8'][@id='u_0_8_nT']")).click();
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	}
	
	@Test
	public void linkText () {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgotten password?")).click();
	}
	@Test
	public void partialLinkText () {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Forgott")).click();
	}
	@Test
	public void screenShot () throws IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("adithya");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File sFile = screen.getScreenshotAs(OutputType.FILE);
		File dFile = new File("C:\\Users\\devik\\eclipse-workspace\\Selenium_auto\\FaceBook_ScreenShot\\" + "FaceBook_ScreenShot.png");
		FileHandler.copy(sFile, dFile);
	}
	@Test
	public void xpathLocator () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
