package com.testNG.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_providertest {
	
	@Test (dataProvider= "MY DATA")
	public void login(String name, String pass) {
		System.out.println("user name::"+ name);
		System.out.println("password ::"+ pass);
	}
	
	@DataProvider(name="MY DATA1")
	public Object[][] testData() {
     return new Object[][] {
    	 {"bhavini", "567"}, {"saran", "586"}, {"sairam", "891"}, {"xxx", "123"}
     };
     }
	@DataProvider(name="MY DATA")
	public Object[][] testData1() {
     return new Object[][] {
    	 {"saran", "123"}, {"bhava", "567"}, {"xxx", "789"}, {"sert", "589"}
    	 
     };
	}
	@DataProvider(name="data1")
    public Object[][] testdata2() {
     return new Object[][] {
    	 {"send", "589"}, {"der", "892"}, {"derf" , "895"},{"jui", "895"}	 
	};     
	}
	}

	

	
	


