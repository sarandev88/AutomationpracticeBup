
package com.testNG.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	//stcm simple annotations
	
	@BeforeSuite
	private void browsersetup() {
		System.out.println("SET UP");
		}
	@BeforeTest
	private void browser() {
	System.out.println("chrome");

	}
	
	@BeforeClass
	private void url() {
	System.out.println("amazon");

	}
	
	@BeforeMethod
	private void login() {

System.out.println("log in");

	}
	
	@Test
	private void iphonesearch() {

System.out.println("search iphone");

	}
	
	@Test
	private void addtocart() {

System.out.println("add to cart");

	}
	
	@AfterMethod
	private void logout() {

System.out.println("log out");

	}
	
	@AfterClass
	
	private void close() {

   System.out.println("Browser close");

	}
	@AfterTest
	
	private void verification() {

System.out.println("verification done");

	}
	@AfterSuite
	private void cookies() {

System.out.println("Cookies Deleted");

	}

}
