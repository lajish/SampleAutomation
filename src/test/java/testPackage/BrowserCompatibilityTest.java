package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserCompatibilityTest {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	@BeforeClass
	public void objectInitialization() {
		js = (JavascriptExecutor)driver;
	}
	
	@Test(enabled=false)
	public void firefoxTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumRelated\\geckodriver_0.23.0_x64.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.xpath("//*[text()='Download Selenium']")).click();;
		Thread.sleep(6000);
		driver.quit();
	}
	
	@Test(enabled=false)
	public void chromeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumRelated\\chromedriver_2.42.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.xpath("//*[text()='Download Selenium']")).click();;
		Thread.sleep(6000);
		driver.quit();
	}
	
	@Test(enabled=true)
	public void internetExplorerTest() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumRelated\\IEDriverServer_Win32_3.14.0.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(5000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[text()='Download Selenium']"))).pause(1500).click().build().perform();
		Thread.sleep(6000);
		driver.quit();
	}
}