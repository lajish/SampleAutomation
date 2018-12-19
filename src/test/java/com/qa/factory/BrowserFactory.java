package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
	static WebDriver driver;

	public static WebDriver startBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumRelated\\chromedriver(2.36).exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("disable-infobars");
			driver = new ChromeDriver(opt);
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			//FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser(String browser){
		
		driver.quit();
		killBrowerInstance(browser);
	}
	
	public static void killBrowerInstance(String browser){ 
		
		if(browser.equalsIgnoreCase("Chrome")){
			try {
				WindowsUtils.killByName("chromedriver(2.36).exe");
			} catch (Exception e) {
				System.out.println("ChromeDriver process not available");
			}
		}
		
		else if(browser.equalsIgnoreCase("IE")){
			try {
				WindowsUtils.killByName("IEDriverServer(2.53.1).exe");
			} catch (Exception e) {
				System.out.println("InternetExplorerDriver process not available");
			}
		}		
		
	}
	
}
