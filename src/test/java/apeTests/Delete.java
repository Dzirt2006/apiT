package apeTests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Delete {

	final static String ROOT_URI = "https://reqres.in/";
	String email = "eve.holt@reqres.in";
	String password = "cityslicka";
	String expectedToken = "QpwL5tke4Pnpja7X4";

	@Test
	public void verifyCode() {
		given().when().delete(ROOT_URI + "api/users/2").then().statusCode(204);
	}

	@Test
	public void getCode() {
		Response response = given().delete(ROOT_URI + "api/users/2");
		int actual = response.getStatusCode();
		Assert.assertEquals(actual, 204);
	}

}
