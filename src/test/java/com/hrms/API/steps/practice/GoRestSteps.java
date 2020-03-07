package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import static org.hamcrest.Matchers.equalTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
public class GoRestSteps {
	private static RequestSpecification request;
	private Response response;
	
	
	@When("I provide the request data")
	public void i_provide_the_request_data() {
		request=given().header("Content-Type","Application/json").
		header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODIzODk1MjQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjUwNDcyNCwidXNlcklkIjoiMjQ0In0.zwsaPDrNHBWzdnlxp7GR5goC514pe7aynij0WUgXlD4");
	request.log().all();
	}

	@When("I make a call to albums API")
	public void i_make_a_call_to_albums_API() {
		int albumId=4;
	  request.when().get("https://gorest.co.in/public-api/albums/"+albumId);
	}

	@Then("I validate that {int} is status code")
	public void i_validate_that_is_status_code(int expectedStatus) {
	  
		//1st way
//		response.then().assertThat().statusCode(expectedStatus);
//2nd way	
		int actualCode= response.statusCode();
		Assert.assertEquals(expectedStatus, actualCode);
	}
		

	@Then("I validate the response body")
	public void i_validate_the_response_body() {
	  response.then().body("_meta.message", Matchers.equalTo("Ok. Everything worked as expected."));
	
	
	}


}
