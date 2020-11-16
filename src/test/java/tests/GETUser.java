package tests;

import org.testng.annotations.Test;

import APIData.GETUserDataProv;

public class GETUser extends APITestBase {

	@Test
	public void getUserById() {
		String expectedEmail = "janet.weaver@reqres.in";
		new GETUserDataProv().requestAndCompare(ROOT_URI, expectedEmail);
	}

}
