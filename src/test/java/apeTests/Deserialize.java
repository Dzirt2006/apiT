package apeTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Deserialize {
	final static String ROOT_URI = "https://reqres.in/";

	@Test
	public void deserialize() {
//		Response json = given().when().get(ROOT_URI + "api/users/2").then().extract().path("data");
		Response json = given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
				.when().get(ROOT_URI + "api/users/2").then().contentType(ContentType.JSON).extract().response();
		
		System.out.println(json.asString());

//		Gson gson = new Gson();
//		DeserializeUser user = gson.fromJson(json, DeserializeUser.class);
//		System.out.println(user.getEmail());


	}
}
