package restAssuredExamples;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostmethodusingJSonObject {
	
	@Test
	public void getJsonData()
	{
		RestAssured.baseURI="https://reqres.in";
		
		JSONObject obj=new JSONObject();
		obj.put("name", "jamesbond");
		obj.put("job","detective");
		
		given().header("Content-Type","application/json").body(obj.toString()).post("/api/users")
		.then().statusCode(201);
		
	}

}
