package frameworks;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.response.Response;

public interface JsonParser {
	default JsonObject jsonFromResponse(Response response) {
		JsonParser parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) parser.parse(response.asString());
		return jsonObj;
	}
}
