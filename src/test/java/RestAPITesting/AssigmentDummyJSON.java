package RestAPITesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class AssigmentDummyJSON {

	void verifyTitle() {
		String url = "https://dummyjson.com/";
		String Resources = "/products/category/smartphones";
		RestAssured.baseURI = url;

		String res = given().when().get(Resources).then().extract().response().asString();
		System.out.println(res);

		JsonPath Js = new JsonPath(res);

		String Title = Js.getString("products.title");
		System.out.print(Title);

	}

	void ProductAllData() {
		String url = "https://dummyjson.com/";
		String Resource = "/products/1";
		RestAssured.baseURI = url;
		String res = given().when().get(Resource).then().extract().asString();
		System.out.println(res);
		JsonPath Js = new JsonPath(res);
		String id = Js.getString("id");
		String Title = Js.getString("title");
		String Rating = Js.getString("rating");
		String TitleExpect = "iPhone 9";
		String Expect = "1";
		String ExpectRating = "4.69";

		if (Expect.equalsIgnoreCase(id)) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		if (TitleExpect.equalsIgnoreCase(Title)) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}
		if (ExpectRating.equalsIgnoreCase(Rating)) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case fail");
		}

	}

	public static void main(String[] args) {

		AssigmentDummyJSON obj = new AssigmentDummyJSON();
		obj.verifyTitle();

		// obj.ProductAllData();
	}

}
