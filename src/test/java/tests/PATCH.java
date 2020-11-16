package tests;

import org.testng.annotations.Test;

import APIData.PatchDataProv;

public class PATCH extends APITestBase {

	@Test
	public void patch() {
		new PatchDataProv(ROOT_URI).getPreviousTimeStamp().makeReqBody().requestAndCompare();
	}
}
