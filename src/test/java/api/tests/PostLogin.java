package api.tests;

import org.testng.annotations.Test;

import APIData.PostLoginDataProv;

public class PostLogin extends APITestBase {

	@Test
	public void token() {
		new PostLoginDataProv(ROOT_URI).makeReqBody().requestAndCompareToken();
	}

}
