package apeTests;

import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;

public class Deserialize {
	final static String ROOT_URI = "https://reqres.in/";

	@Test
	public void deserialize() {
		JsonPath json = given().when().get(ROOT_URI + "api/users/2").then().extract().jsonPath();
		DeserializeUser user = json.getObject("data", DeserializeUser.class);
		System.out.println(user.toString());
		Assert.assertNotEquals(user.getEmail(), null);
	}
}
