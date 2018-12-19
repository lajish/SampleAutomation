package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("1. I am into BeforeMethod annotated method");
	}
	
	@Test
	public void actualTest() {
		System.out.println("2. I am into Test annotated method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("3. I am into AfterMethod annotated method");
	}
	
}
