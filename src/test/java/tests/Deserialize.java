package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import APIData.DeserializeUserDataProvider;
import frameworks.JSONDeserializing;

public class Deserialize extends APITestBase implements JSONDeserializing {

	@Test
	public void deserialize() {
		String expected = "janet.weaver@reqres.in";
		String actual = new DeserializeUserDataProvider().request(ROOT_URI).deserializeObj().getUserEmail();
		Assert.assertEquals(actual, expected);
	}
}
