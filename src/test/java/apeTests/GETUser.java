package apeTests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import org.testng.annotations.AfterMethod;
import static org.hamcrest.Matchers.equalTo;


public class GETUser {

	final static String ROOT_URI = "https://reqres.in/";

	@Test
	public void getUserById() {
		String expectedEmail="janet.weaver@reqres.in";
		given().when().get(ROOT_URI + "api/users/2").then().body("data.email", equalTo(expectedEmail));
	}


	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
