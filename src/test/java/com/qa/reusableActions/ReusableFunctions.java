package com.qa.reusableActions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.Home_Page;
import com.qa.pages.Login_Page;

public class ReusableFunctions {

	public static void loginAction(WebDriver driver){
		
		Login_Page oLogin_Page = new Login_Page(driver);
		oLogin_Page.username();
		oLogin_Page.password();
		oLogin_Page.loginButton();
		
	}
	
	public static void signOutAction(WebDriver driver){
		
		Home_Page oHome_Page = new Home_Page(driver);
		oHome_Page.userMenu();
		oHome_Page.signOut();
	}
	
}
