package invocation;

import org.testng.annotations.Test;

public class Multipletimes {
	//invocation count
	@Test (invocationCount = 5)
	private void searchlaptop() {
	System.out.println("click the search button");

	}
	@Test (invocationCount = 3)
	private void searchmobile() {
		System.out.println("search mobile");

	}

}
