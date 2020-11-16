package api.tests;

import static io.restassured.RestAssured.given;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import APIData.CollectionDatProv;
import APIData.DeserializeUser;
import io.restassured.response.Response;

public class CollectionDeserializing extends APITestBase {
//	final static String ROOT_URI = "https://reqres.in/";

	@Test
	public void deserialize() {
//
//		Response response = given().when().get(ROOT_URI + "api/users?page=2").then().extract().response();
//		JsonParser parser = new JsonParser();
//		JsonObject jsonObj = (JsonObject) parser.parse(response.asString());
//		List<DeserializeUser> users = new ArrayList<DeserializeUser>();
//
//		for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
//			try {
//				JsonArray array = entry.getValue().getAsJsonArray();
//				for (JsonElement elementJSON : array) {
//					Gson gson = new Gson();
//					System.out.println(elementJSON.toString());
//					DeserializeUser tempUser = gson.fromJson(elementJSON, DeserializeUser.class);
//					users.add(tempUser);
//				}
//			} catch (java.lang.IllegalStateException e) {
//				continue;
//			}
//		}

		String actual = new CollectionDatProv(ROOT_URI).request().deserializeToCollection().getEmail();
		Assert.assertNotEquals(actual, null);
	}
}
