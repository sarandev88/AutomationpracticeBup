package prioritytest;

import org.testng.annotations.Test;

//priority test  ( -4 -3 -2 -1 0 1 2 3 4) (no priority given it assumes as 0)
//runs all
public class Cardriving {
	@ Test (priority = 4)
	private void startthecar() {
	System.out.println("Car Started");

	}
	@Test (priority = -2)
	private void firstgear() {

System.out.println("First Gear");

	}
	
	@Test (priority = 3)
	private void secondgear() {
	System.out.println("Second Gear");

	
	}
	
	@Test  // (priority = -2)
	private void stopthecar() {
System.out.println("stop the car");


	}
	@Test (priority = -4)
	private void keyoff() {

System.out.println("Off the car");

	}
		
		
	}


