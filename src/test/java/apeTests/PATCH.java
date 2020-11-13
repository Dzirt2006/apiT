package apeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class PATCH {
	final static String ROOT_URI = "https://reqres.in/";
	String name = "morpheus";
	String job = "zion resident";

	@Test
	public void token() {

		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", name);
		jsonObject.addProperty("job", job);
		System.out.println(jsonObject.toString());
		String currentTime=new SimpleDateFormat("HH:mm").format(new Date());
		given().header("Content-Type", "application/json").body(jsonObject.toString()).when()
				.patch(ROOT_URI + "api/users/2").then().statusCode(200).assertThat().body("updatedAt",
						equalTo(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date())));
//				.log().all();

	}
}