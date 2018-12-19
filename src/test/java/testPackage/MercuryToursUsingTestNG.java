package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MercuryToursUsingTestNG {
	WebDriver driver;
	
	@BeforeClass
	@Test(priority=1,description="Browser launch")
	public void startBrowser() {
		//System.setProperty("webdriver.gecko.driver","D:\\IT-New\\RajITLearningSetup\\Library\\geckodriver.exe");
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setCapability("marionette", true);
        
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Broswer started");
	}
	
	@Test(priority=2, dependsOnMethods="startBrowser",description="App launched")
	public void startApp() {
        driver.get("http://newtours.demoaut.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
        System.out.println("App loaded");
     }
     
	@Test(priority=3, dependsOnMethods="startApp",description="Login method")
	public void loginApp() {
		//Login
    	driver.findElement(By.name("userName")).sendKeys("tutorial");
    	driver.findElement(By.name("password")).sendKeys("tutorial");
    	driver.findElement(By.name("login")).click();
    	
    	Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
    	System.out.println("Login successful");
    	}
	
	@Test(priority=4, dependsOnMethods="loginApp",description="Flight Finder page")
	public void flightFinder() {
		driver.findElement(By.name("tripType")).click();

        Select s1 = new Select(driver.findElement(By.name("passCount")));
        s1.selectByVisibleText("2");
        
        Select s2= new Select(driver.findElement(By.name("toPort")));
        s2.selectByIndex(2);
        
        Select s3= new Select(driver.findElement(By.name("fromMonth")));
        s3.selectByIndex(2);
        
        Select s4 = new Select(driver.findElement(By.name("toPort")));
        s4.selectByIndex(5);
        
        Select s5 =new Select(driver.findElement(By.name("toMonth")));
        s5.selectByIndex(11);
        
        driver.findElement(By.name("servClass")).click();
        
        Select s6 = new Select(driver.findElement(By.name("airline")));
        s6.selectByIndex(1);
        
        driver.findElement(By.name("findFlights")).click();
        
  //      Assert.assertEquals("Select a Flight: Mercury Tours", driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Select a Flight: Mercury Tours"));

	}
     
	@Test(priority=5, dependsOnMethods="flightFinder",description="Logout from App")
	public void logoutApp(){
		//Code goes here
		System.out.println("Logout successful");
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
		System.out.println("App closed");
	}
}

