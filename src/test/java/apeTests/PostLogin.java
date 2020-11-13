package apeTests;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class PostLogin {

	final static String ROOT_URI = "https://reqres.in/";
	String email = "eve.holt@reqres.in";
	String password = "cityslicka";
	String expectedToken = "QpwL5tke4Pnpja7X4";

	@Test
	public void token() {

		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("email", email);
		jsonObject.addProperty("password", password);
		System.out.println(jsonObject.toString());
		given().header("Content-Type","application/json").body(jsonObject.toString()).when()
		.post(ROOT_URI + "api/login").then().statusCode(200).assertThat().body("token",
				equalTo(expectedToken));

	}

//	{
//	    "email": "eve.holt@reqres.in",
//	    "password": "cityslicka"
//	}
}
