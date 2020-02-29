package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.hrms.utils.APIConstants;

public class GETOneEmployeeAPISteps {
	private Response response;
	private static RequestSpecification request;
	
	@Given("user calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {
		
		request = given().header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token)
		.param("employee_id", POSTCreateEmployeeAPI.employee_ID);
	
	
	}

	@When("User retrieves response for getOneEmployee API")
	public void user_retrieves_response_for_getOneEmployee_API() {
		
		response = request.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);
		response.prettyPrint();
		
	}

	@Then("status code is {int} for getOneEmployee API")
	public void status_code_is_for_getOneEmployee_API(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user validates created employee exists")
	public void user_validates_created_employee_exists() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	

}