package restAssuredExamples;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetmethodExample {
	@Test
	public void getMethod()

	{	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://fakerestapi.azurewebsites.net/api/v1/";
	//Response res=RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
		Response res=given().when().get("/Activities").then().extract().response();
	//int scode=res.getStatusCode();
	System.out.println(res.getStatusCode());
	String resBody=res.body().prettyPrint();
	
	System.out.println("resBody");
	}

}
