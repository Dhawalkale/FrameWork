package RestAPITesting;

import org.testng.annotations.Test;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;

public class PostMethodTest {
@Test
	public void Post() {
		String url = "https://reqres.in/";
		String Payload = "{\n" + "    \"name\": \"morpheus\",\n" + "    \"job\": \"leader\",\n"
				+ "    \"id\": \"598\",\n" + "    \"createdAt\": \"2022-09-21T12:19:40.119Z\"\n" + "}";
		String Resoureces = "https://reqres.in/api/user";
		RestAssured.baseURI = url;
		given().body(Payload).when().post(Resoureces).then().log().all();
	    

	}

	

}
