package com.testNG.com;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.logging.LogCombiner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browlaunch {
	@BeforeSuite
	private void browsersetup() {
System.out.println("Browser setup");
	}
@BeforeTest
 private void Browser() {
System.out.println("Chrome");
}
 @BeforeClass
 private void URL() {
System.out.println("Amazon");
 }


@BeforeMethod
private void login() {
System.out.println("login");	
}
@Test
private void iphonesearch() {
System.out.println("apple");
}
@Test
private void addtocart() {
System.out.println("add to cart");
}

@AfterMethod
private void logout() {
System.out.println("logout");

}

@AfterTest
private void Close() {
System.out.println("close");	
}

@AfterClass
private void verification() {
System.out.println("logout");
}
@AfterSuite
private void cookies() {
System.out.println("cookies");
}

}
