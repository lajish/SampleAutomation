package com.qa.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports report;
	static ExtentTest logger;
	
	public static void ExtentReportSetUp(String ScenarioWithTimeStamp){
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/"+ScenarioWithTimeStamp+".html");
		report = new ExtentReports ();
		report.attachReporter(htmlReporter);
		//report.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		//report.setSystemInfo("Environment", "Automation Testing");
		report.setSystemInfo("User Name", "Bala");
		 
		htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
		htmlReporter.config().setReportName("Name of the Report Comes here");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		
	}
	
	public static void finishReport(){
		
		report.flush();
		
	}

}
