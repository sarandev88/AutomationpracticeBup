package prioritytest;

import org.testng.annotations.Test;

public class Cardrive {
	
	//priority test  starts from -ve to +ve  -3 -2 -1 0 1 2 3
	@Test (priority=1)
	private void startthrcar() {
System.out.println("start");
	}
	
	@Test (priority = 4)
	private void keyon() {
System.out.println("keyon");
	}
	
	@Test (priority = -1)
	private void firstgear() {
System.out.println("first gear");
	}
	
	@Test (priority = 3)
private void secondgear() {
System.out.println("second gear");
}
	
@Test (priority = 2)
private void offthecar() {
System.out.println("off");
}
}
