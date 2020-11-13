package apeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;

public class PATCH {
	final static String ROOT_URI = "https://reqres.in/";
	String name = "morpheus2";
	String job = "zion resident";

	@Test
	public void patch() {

		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", name);
		jsonObject.addProperty("job", job);
//		System.out.println(jsonObject.toString());
//		String currentTime=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date());
//		given().header("Content-Type", "application/json").body(jsonObject.toString()).when()
//				.patch(ROOT_URI + "api/users/2").then().statusCode(200).assertThat().body("name", equalTo("morpheus2")).body("updatedAt",
//						not(currentTime));
////						equalTo(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date())));
////				.log().all();
//		

		String oldTimeStamp = RestAssured.given().header("Content-Type", "application/json").body("")
				.patch(ROOT_URI + "api/users/2").then().extract().path("updatedAt");

		RestAssured.given().header("Content-Type", "application/json").body(jsonObject.toString())
				.patch(ROOT_URI + "api/users/2").then().assertThat().statusCode(200).body("name", equalTo("morpheus2"))
				.body("updatedAt", equalTo(oldTimeStamp));

	}
}
