package com.qa.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestDataProvider {

	Properties pro;

	public TestDataProvider() {
		File src = new File("./TestData/Data.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Error while looking for Data.properties file");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Error in reading Data.properties file");
			System.exit(0);
		}
	}
	
	/**
	 * Returns value from Data.properties file against given key
	 * 
	 * @param key
	 * @return
	 */
	public String getValue(String key) {
		return pro.getProperty(key);
	}
}
