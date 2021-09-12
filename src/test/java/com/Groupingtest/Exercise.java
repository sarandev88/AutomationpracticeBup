package com.Groupingtest;

import org.testng.annotations.Test;

public class Exercise {
	
	//scenario ---> red, blue, black, red, blue, black
	
	
	@Test (groups = "RED")
	private void red() {
System.out.println("red");
	}

	@Test (groups = "RED")
	
	private void red1() {
System.out.println("red1");
	}
	
	@Test (groups = "Blue")
	private void blue() {
System.out.println("blue");
	}
	
	@Test (groups = "Blue")
	private void blue1() {
System.out.println("blue1");
	}

	@Test (groups = "Black")
	private void black() {
System.out.println("black");
	}
	
	@Test (groups = "Black")
	private void black1() {
System.out.println("black1");
	}

}

