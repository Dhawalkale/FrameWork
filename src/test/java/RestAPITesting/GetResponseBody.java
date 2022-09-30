package RestAPITesting;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetResponseBody {

	public void NewMethod() {

		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httReq = RestAssured.given();
		Response res = httReq.request(Method.GET, "/api/users?page=2");
		String responsebody = res.getBody().asPrettyString();
		System.out.println(responsebody);
		Assert.assertEquals(responsebody.contains("Michae"), true);
	}

	public void GetDataExtract() {

		String url = "https://reqres.in/";
		String Resources = "https://reqres.in/api/users?page=2";
		RestAssured.baseURI = url;
		String res = given().when().get(Resources).then().extract().response().asString();
		System.out.println(res);
		JsonPath Js = new JsonPath(res);
		String title = Js.getString("data[1].first_name");
		System.out.println(title);

	}

	public void ToCheckGetMethod() {
		String url = "https://dummyjson.com/";
		String Resources = "/products/category/smartphones";
		RestAssured.baseURI = url;
		String res = given().when().get(Resources).then().extract().response().asString();
		System.out.println(res);
		JsonPath Js = new JsonPath(res);
		String title = Js.getString("products.title");
		System.out.println(title);

	}

	
}
