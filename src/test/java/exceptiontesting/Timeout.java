package exceptiontesting;

import org.testng.annotations.Test;

public class Timeout {
	
	
	
@Test (timeOut = 5000) // this should not be less tahn thread.sleep (then it shows error)
	private void searchMobile() throws InterruptedException {

System.out.println("login");
Thread.sleep(2000);
System.out.println("search Mobile");

	}
	

}
