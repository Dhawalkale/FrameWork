package RestAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.runtime.io.Resource;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class GetMethod {
	
	public void GetListOfUsers() {
		String url = "https://reqres.in/";
		String resources = "https://reqres.in/api/users?page=2";
		RestAssured.baseURI = url;
		given().when().get(resources).then().log().all();

	}

	@Test
	public void PostMethod() {
		String url = "https://reqres.in/";
		String payload = "{\n" + "    \"name\": \"morpheus\",\n" + "    \"job\": \"leader\",\n"
				+ "    \"id\": \"40\",\n" + "    \"createdAt\": \"2022-09-21T10:56:48.889Z\"\n" + "}";
		String resources = "https://reqres.in/api/users";
		RestAssured.baseURI = url;
		given().body(payload).when().post(resources).then().log().all();

	}

	
	

	
	public void NewMethod() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httpReq = RestAssured.given();
		Response response = httpReq.request(Method.GET, "/api/users?page=2");
		String ResponseBody = response.getBody().asPrettyString();
		System.out.println(ResponseBody);
		int statuscode = response.getStatusCode();
		System.out.println("Statuscode :" + statuscode);
		Assert.assertEquals(200, "statuscode");
	}

	

}
