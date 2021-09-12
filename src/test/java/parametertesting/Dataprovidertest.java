


package parametertesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	//
	@Test(dataProvider = "MY DATA")
	
public void login(String name, String pass) {
	
	System.out.println("user name::"+name);
	System.out.println("password:::"+pass);

}
	// data provider return type is 2d array [][]
	
	@DataProvider (name="MY DATA")
	private Object[][] testData() {
		return new Object [][] {
			{"name", "pass"},{"sar","123"},{"theep", "568"}
	};
	}
	@DataProvider(name= "team test")
	private Object[][] testData1() {
   return new Object[][] {
	   {"bharani", "143"}, {"saran", "568",},{"veni", "569"}, {"king","891"} 
   };
	}
	@DataProvider(name= "MY Data1")
	private Object[][] testData3() {
return new Object[][] {
	{"sairam","234"},{"dert","896"},{"sert","569"}
	
	};
}
}
