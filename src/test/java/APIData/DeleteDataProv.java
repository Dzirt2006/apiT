package APIData;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class DeleteDataProv {
	String api = "api/users/2";
	String ROOT_URI;

	public DeleteDataProv(String ROOT_URI) {
		this.ROOT_URI = ROOT_URI;
	}

	public void reqAndVerifyDeleteCode() {
		given().when().delete(ROOT_URI + api).then().statusCode(204);
	}

	public int reqAndGetDeleteCode() {
		Response response = given().delete(ROOT_URI + api);
		return response.getStatusCode();
	}

}
