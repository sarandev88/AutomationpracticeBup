package ignoreTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoretest {
	@Ignore
	@Test
	private void Red() {
System.out.println("RED");
	}
	
	@Test(enabled = false)
	private void Green() {
System.out.println("Green");
}
	
	@Test
private void Yellow() {
	System.out.println("Yellow");
}
}
