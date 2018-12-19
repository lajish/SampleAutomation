package com.qa.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.utils.Utility;

public class SelectActivites {

	public static void selectByText(WebDriver driver, By locator, String textToSelect){
		
		new Select(Utility.checkElementClick(driver, locator)).selectByVisibleText(textToSelect);
	}
	
	public static void deSelectByText(WebDriver driver, By locator, String textToSelect){
		
		new Select(Utility.checkElementClick(driver, locator)).deselectByVisibleText(textToSelect);		
	}
	
	public static void deSelectByText(WebDriver driver, By locator){
		
		new Select(Utility.checkElementClick(driver, locator)).deselectAll();		
	}
	
	
}