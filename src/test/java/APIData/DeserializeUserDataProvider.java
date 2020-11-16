package APIData;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;

public class DeserializeUserDataProvider {
	String api = "api/users/2";
	DeserializeUser user;
	JsonPath json;

	public DeserializeUserDataProvider request(String ROOT_URI) {
		json = given().when().get(ROOT_URI + api).then().extract().jsonPath();
		return this;
	}
	public DeserializeUserDataProvider deserializeObj() {
		user = json.getObject("data", DeserializeUser.class);
		System.out.println(user.toString());
		return this;
	}
	public String getUserEmail() {
		return user.getEmail();
	}
	

}
