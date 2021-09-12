
package exceptiontesting;

import org.testng.annotations.Test;

public class Runall {
	
	//Run all
	
	@Test (expectedExceptions = ArithmeticException.class)
	private void Divide() {
System.out.println("DIVISION");
System.out.println(10/0);
	}

}
