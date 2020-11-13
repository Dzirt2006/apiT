package apeTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeTest;

public class BAseSetUp {
  @Test
  public void f() {
		RestAssured.baseURI="https://reqres.in";
  }
  @BeforeTest
  public void beforeTest() {
  }

}
