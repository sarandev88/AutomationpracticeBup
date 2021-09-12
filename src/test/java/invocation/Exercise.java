package invocation;

import org.testng.annotations.Test;

public class Exercise {
	
	@Test (invocationCount = 2)
	private void searchmobile() {
System.out.println("Search mobile");
	}
	@Test (invocationCount = 6)
	private void searchlaptop() {
System.out.println("search laptop");
	}

	
	
}
