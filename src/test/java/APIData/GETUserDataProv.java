package APIData;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.ValidatableResponse;

public class GETUserDataProv {
	String api = "api/users/2";

	public ValidatableResponse requestAndCompare(String ROOT_URI, String expectedEmail) {
		return given().when().get(ROOT_URI + "api/users/2").then().body("data.email", equalTo(expectedEmail));
	}
}
