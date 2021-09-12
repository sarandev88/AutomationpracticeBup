package dependencytest;

import org.testng.annotations.Test;


public class DependencyDemo {
	//depends on methods 
	@Test
	private void browserlaunch() {
		System.out.println("Browser Launch");

	}
	@Test 
	private void url() {

System.out.println("amazon.com");

	}
	@Test (dependsOnMethods = "url")
	private void login() {
		System.out.println("login");

	}
	@Test (dependsOnMethods = "login")
	private void searchmobiles() {
		System.out.println("Search Mobiles");

	}

}
