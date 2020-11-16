package api.tests;

import org.testng.annotations.BeforeMethod;

import loadingConfig.TestLoadManager;

public class APITestBase {

	protected String ROOT_URI;// = "https://reqres.in/";

	@BeforeMethod
	public void beforeMethod() {
		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations();
		ROOT_URI = manager.baseUrl;
	}
}
