package com.qa.tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest {

	private WebDriver driver;
	By username = By.xpath("//*[@name='txtUsername']");
	By password = By.xpath("//*[@name='txtPassword']");
	By loginButton = By.xpath("//*[@name='Submit']");

	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeMethod(String browser) {
		System.out.println("1. I am into BeforeMethod annotated method");
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", getResource(browser));
			System.out.println("Path is "+getResource(browser));
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", getResource(browser));
			System.out.println("Path is "+getResource(browser));
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void actualTest() {
		System.out.println("2. I am into Test annotated method");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(username).click();
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).click();
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginButton).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("3. I am into AfterMethod annotated method");
		driver.quit();
	}

	private String getResource(String browser) {
		File file = null;
		ClassLoader classLoader = getClass().getClassLoader();
		if (browser.equals("Chrome")) {
			file = new File(classLoader.getResource("chromedriver.exe").getFile());
		}
		else if (browser.equals("Firefox")) {
			file = new File(classLoader.getResource("geckodriver_0.23.0_x64.exe").getFile());
		}
		return file.getAbsolutePath();
	}

}
