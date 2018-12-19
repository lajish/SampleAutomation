package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.library.ActionActivities;
import com.qa.utils.Utility;

public class Home_Page {
	
	WebDriver driver;
	
	By FirstWelcomeCloseButton = By.xpath("(//*[contains(@class,'x-button')])[2]");
	By SecondWelcomeCloseButton = By.xpath("(//*[contains(@class,'x-button')])[1]");
	By UserMenu = By.xpath("//*[@class='user-name']/parent::a");
	By SignOut1 = By.xpath("(//a[text()='Sign Out'])[1]");
	By SignOut2 = By.xpath("(//a[text()='Sign Out'])[2]");
	
	public Home_Page(WebDriver tempdriver){
		
		this.driver = tempdriver;
		
	}
	
	
	public void closeWelcomeWindow(){
		
		Utility.wait(22000);
		Utility.checkElementClick(driver, FirstWelcomeCloseButton).click();
		Utility.wait(2500);
		Utility.checkElementClick(driver, SecondWelcomeCloseButton).click();
		
		
	}
	
	public void userMenu(){
		
		ActionActivities.moveToElementClick(driver, UserMenu);
				
	}
	
	public void signOut(){
		
		try{
			Utility.checkElementClick(driver, SignOut1).click();
		}catch(Exception e){
			Utility.checkElementClick(driver, SignOut2).click();
		}
		
	}
	
	

}
