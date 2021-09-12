package parametertesting;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//parameter test ---> single set of data
public class Parametertest {
	//xml--? parameter
	
	//testng test ---> optional
	
	
@Test
@Parameters({"name"})
	public void empUserName(@Optional("QUEEN")String name) {
System.out.println("User Name:" + name);
	}


@Test
@Parameters({"pass"})
	public void empPassword(@Optional("123")String pass) {
System.out.println("Password:" +pass);
	}
}
