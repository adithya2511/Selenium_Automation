package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpLoadPopup {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@Test
	public void fileUpLoad () throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\devik\\OneDrive\\Desktop\\note pad\\Project.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-success btn-xs']")).click();
	}
	@Test
	public void fileUpLoad1 () throws InterruptedException, IOException {
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\devik\\OneDrive\\Desktop\\note pad\\FileUpdate.exe");
	}	
}
