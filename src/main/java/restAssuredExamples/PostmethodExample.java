package restAssuredExamples;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PostmethodExample {
	
	@Test
	public void putExample()
	{
		RestAssured.baseURI= "https://reqres.in";
		given().log().all().header("Content-Type","application/json").body("\r\n"
				+ "    \"name\": \"ram\",\r\n"
				+ "    \"job\": \"cricketer\"\r\n"
				+ "").when().post("/api/users").then().log().all().statusCode(201);
	}

}
