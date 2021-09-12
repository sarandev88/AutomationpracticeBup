package com.Groupingtest;

import org.testng.annotations.Test;

// scenario==> red, blue, black, red, blue, back
public class GroupingTest {
	@Test (groups = "RED")
private void Red() {
System.out.println("RED");
}
	@Test (groups = "RED")
private void Red1() {
		
System.out.println("RED1");
}
	@Test (groups = "Blue")
private void Blue() {
System.out.println("blue");
}
 @Test (groups = "blue")
	
private void Blue1() {
System.out.println("BLUE1");
}

@Test (groups="black")
private void black() {
System.out.println("Black");
}

@Test (groups="black")
private void black1() {
	System.out.println("Black1");

}
}
