package dependencytest;

import org.testng.annotations.Test;

public class Depend_1 {
	
	@Test
	private void browserlaunch() {
System.out.println("browser launch");
	}
	
	@Test
	private void url() {
System.out.println("URL");
	}
	
	@Test (dependsOnMethods = "url")
	private void login() {
System.out.println("Login");
	}
	
	@Test (dependsOnMethods = "login")
	private void searchmobile() {
System.out.println("search mobile");
	}
	
	@Test (dependsOnMethods = "searchmobile")
	private void logou() {
System.out.println("logout");
	}
	}

