package testPackage;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(“webdriver.chrome.driver”, “D:\\Library\\chromedriver.exe”);
		/*LoggingPreferences logs = new LoggingPreferences();
		logs.enable(LogType.BROWSER, Level.SEVERE);
		
		ChromeOptions opt = new ChromeOptions();
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
		desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);

		//WebDriver driver = new FirefoxDriver(desiredCapabilities);
		WebDriver driver = new ChromeDriver(desiredCapabilities);
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		for (LogEntry entry : logEntries) {
		System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
		}
		// Maximizing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Entering URL
		driver.get("https://www.freecrm.com");
		// Entering Credentials
		driver.findElement(By.name("username")).sendKeys("chandan4crm");
		driver.findElement(By.name("password")).sendKeys("chandan@crm");
		Thread.sleep(1000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//input[@value='Login']"))).pause(1000).click().build().perform();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value='Quick Search']")).sendKeys("Chandan");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(5000);
		driver.quit();*/
		
		System.out.println(ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT));
		System.out.println(ZonedDateTime.now().toLocalDate());
		System.out.println(ZonedDateTime.now());

	}

}
