package com.qa.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.qa.library.GenericFunctions;

public class Helper {

	public static String screenshot(WebDriver driver, String testName) {
		String destinationPath = System.getProperty("user.dir") + "/Screenshots/" + testName + "_"
				+ GenericFunctions.currentDateTime() + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(destinationPath));
		}
		catch (IOException e) {
			System.out.println("Error happened while saving screenshot");
		}
		return destinationPath;
	}

	public static void scrollToView(WebDriver driver, By locator) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", Utility.checkElement(driver, locator));
	}

	public static void jsClick(WebDriver driver, By locator) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Utility.checkElementClick(driver, locator));
	}

	public static void jsSendkeys(WebDriver driver, By locator, String data) {
		JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
		myExecutor.executeScript("arguments[0].value='" + data + "';", Utility.checkElementClick(driver, locator));
	}
}
