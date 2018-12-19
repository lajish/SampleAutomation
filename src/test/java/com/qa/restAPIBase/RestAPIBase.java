package com.qa.restAPIBase;

import java.io.FileInputStream;
import java.util.Properties;

public class RestAPIBase {

	Properties pro;

	public RestAPIBase() {
		pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/qa/restAPIConfig/config.properties");
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
