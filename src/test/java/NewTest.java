
import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testng.annotations.AfterMethod;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.net.*;

public class NewTest {

	final static String ROOT_URI = "https://reqres.in/";

	@Test
	public void ffdssf() {
//		URL url = null;
//
//		try {
//			url = new URL(ROOT_URI);
//			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
//		} catch (IOException e) {
//
//		}

		Response response = get(ROOT_URI + "api/users/2");
//	Response response = get("https://api.chucknorris.io/jokes/random");
//		response.then().statusCode(200).body("value", equalTo("janet.weaver@reqres.in"));
//		get(ROOT_URI + "/api/users/2").then().body("data.email", equalTo("janet.weaver@reqres.in"));
		given().when().get(ROOT_URI + "api/users/2").then().body("data.email", equalTo("janet.weaver@reqres.in"));
	}

//
//	@Test
//	public void f() {
//		Response response = get(ROOT_URI + "/api/users/2");
////		Response response = get("https://api.chucknorris.io/jokes/random");
//		System.out.println(response.get);
//		
////		// Specify the base URL to the RESTful web service
////		 RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
////		 
////		 // Get the RequestSpecification of the request that you want to sent
////		 // to the server. The server is specified by the BaseURI that we have
////		 // specified in the above step.
////		 RequestSpecification httpRequest = RestAssured.given();
////		 
////		 // Make a request to the server by specifying the method Type and the method URL.
////		 // This will return the Response from the server. Store the response in a variable.
////		 Response response = httpRequest.request(Method.GET, "/Hyderabad");
////		 
////		 // Now let us print the body of the message to see what response
////		 // we have recieved from the server
////		 String responseBody = response.getBody().asString();
////		 System.out.println("Response Body is =>  " + responseBody);
//	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
