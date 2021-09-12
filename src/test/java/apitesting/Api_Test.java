package apitesting;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Test {

	
	@Test
	private void read_Data() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
        Response response = request.get("api/users/2");
        String res = response.asString();
        System.out.println("Response:  " +res);
		
	}
	

}
