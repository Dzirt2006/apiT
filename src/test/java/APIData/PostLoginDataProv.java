package APIData;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.google.gson.JsonObject;

public class PostLoginDataProv {
	String email = "eve.holt@reqres.in";
	String password = "cityslicka";
	String expectedToken = "QpwL5tke4Pnpja7X4";
	String api = "api/login";
	String oldTimeStamp;
	String ROOT_URI;
	JsonObject jsonObject;

	public PostLoginDataProv(String ROOT_URI) {
		this.ROOT_URI = ROOT_URI;
	}

	public PostLoginDataProv makeReqBody() {
		jsonObject = new JsonObject();
		jsonObject.addProperty("email", email);
		jsonObject.addProperty("password", password);
		return this;
	}

	public void requestAndCompareToken() {
		given().header("Content-Type", "application/json").body(jsonObject.toString()).when().post(ROOT_URI + api)
				.then().statusCode(200).assertThat().body("token", equalTo(expectedToken));
	}
}
