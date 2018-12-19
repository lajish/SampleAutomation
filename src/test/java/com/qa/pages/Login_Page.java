package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DataProviderFactory;
import com.qa.utils.Utility;

public class Login_Page {
	
	WebDriver driver;
	
	By username = By.xpath("//*[@name='pf.username' or @id='userInput']");
	By nextButton = By.xpath("//*[@name='login-button' or @id='login-button' or @type='submit']");
	By password = By.xpath("//*[@id='passwordInput' or @name='pf.pass']");
	By loginButton = By.xpath("//*[@id='login-button' or @name='login-button']");
	
	public Login_Page(WebDriver tempdriver){
		
		this.driver = tempdriver;
		
	}
	
	
	public void username(){
		
		Utility.checkElementClick(driver, username).sendKeys(DataProviderFactory.getDataProperty().getValue("Username"));
		Utility.checkElementClick(driver, nextButton).click();
		
	}
	
	public void password(){
		
		Utility.checkElementClick(driver, password).sendKeys(DataProviderFactory.getDataProperty().getValue("Password"));
		
	}
	
	public void loginButton(){
		
		Utility.checkElementClick(driver, loginButton).click();
				
	}
	
	
	
	
	

}
