package apeTests;

import static io.restassured.RestAssured.given;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CollectionDeserializing {
	final static String ROOT_URI = "https://reqres.in/";

	@Test
	public void deserialize() {
//		JsonPath json = given().when().get(ROOT_URI + "api/users/2").then().extract().jsonPath();
//		List<DeserializeUser> user = json.get("data", DeserializeUser.class);
//		System.out.println(user);
//		
//		
		Response response = given().when().get(ROOT_URI + "api/users?page=2").then().extract().response();
		JsonParser parser = new JsonParser();
		JsonObject o = (JsonObject) parser.parse(response.asString());
		List<DeserializeUser> users = new ArrayList<DeserializeUser>();

		for (Map.Entry<String, JsonElement> entry : o.entrySet()) {
			try {
				JsonArray array = entry.getValue().getAsJsonArray();
				for (JsonElement elementJSON : array) {
					Gson gson = new Gson();
					System.out.println(elementJSON.toString());
					DeserializeUser tempUser = gson.fromJson(elementJSON, DeserializeUser.class);
					users.add(tempUser);
				}
			} catch (java.lang.IllegalStateException e) {
				continue;
			}
		}
		System.out.println(users.get(0).getEmail());
//		Assert.assertNotEquals(user.getEmail(), null);
	}
}
