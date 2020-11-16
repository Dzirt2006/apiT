package APIData;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import frameworks.JSONDeserializing;
import io.restassured.response.Response;

public class CollectionDatProv implements JSONDeserializing {
	String api = "api/users?page=2";
	JsonObject jsonObj;
	JsonParser parser;
	String ROOT_URI;
	Response response;
	List<DeserializeUser> users;

	{
		parser = new JsonParser();
		users = new ArrayList<DeserializeUser>();
	}

	public CollectionDatProv(String ROOT_URI) {
		this.ROOT_URI = ROOT_URI;
	}

	public CollectionDatProv deserializeToCollection() {
		jsonObj = (JsonObject) parser.parse(response.asString());
		deserializeFromList(users, jsonObj);
		return this;
	}

	public CollectionDatProv request() {
		response = given().when().get(ROOT_URI + "api/users?page=2").then().extract().response();
		return this;
	}

	public String getEmail() {
		return users.get(0).getEmail();
	}

}
