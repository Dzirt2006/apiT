package api.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import APIData.DeleteDataProv;


public class Delete extends APITestBase{

	DeleteDataProv deleteData;

	@Test
	public void verifyCode() {
		deleteData.reqAndVerifyDeleteCode();
	}

	@Test
	public void getCode() {
		int actual = deleteData.reqAndGetDeleteCode();
		Assert.assertEquals(actual, 204);
	}
	
	@BeforeMethod
	public void inst() {
		deleteData=new DeleteDataProv(ROOT_URI);
	}

}
