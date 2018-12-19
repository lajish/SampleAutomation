package com.qa.factory;

import com.qa.dataprovider.TestDataProvider;

public class DataProviderFactory {

	
	public static TestDataProvider getDataProperty(){
		
		return new TestDataProvider();
		
	}
	
}
