package com.qa.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.utils.Utility;

public class ActionActivities {

	public static void moveToElementClick(WebDriver driver, By locator){
		
		new Actions(driver).moveToElement(Utility.checkElementClick(driver, locator)).pause(1500).click().build().perform();
		
	}
	
	public static void doubleClick(WebDriver driver, By locator) {
		
		new Actions(driver).doubleClick(Utility.checkElementClick(driver, locator)).build().perform();
		
	}
	
}
