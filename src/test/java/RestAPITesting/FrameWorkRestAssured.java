package RestAPITesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class FrameWorkRestAssured {
  @Test
  
		public void TestCaseOne() {
			String url = "https://reqres.in/";
			
			String Resources = " https://reqres.in/api/unknown";
			
			RestAssured.baseURI = url;
			
			String resopnse = given().when().get(Resources).then().extract().asString();
			
			JsonPath Js = new JsonPath(resopnse);
			
			String ExpectedResult = Js.getString("data[2].name");
			
			System.out.println(ExpectedResult);
			
			String ActualResult = "true red";

			if (ExpectedResult.equalsIgnoreCase(ActualResult)) 
			{
				System.out.println("Test Case is Pass");
			} 
			else
			{
				System.out.println("Test Case is Fail");
			}

		}
  }

