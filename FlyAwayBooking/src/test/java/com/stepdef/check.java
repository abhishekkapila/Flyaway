package com.stepdef;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class check {
 // public static RestAssured.baseURI = "http://localhost:8080";

public     RequestSpecification given = RestAssured.given();


	@Given("rest")
	public void rest() {
    RestAssured.baseURI = "http://localhost:8080";
//
//	     RequestSpecification given = RestAssured.given();
	     
	     JSONObject reqParam = new JSONObject();

	     reqParam.put("email_id", "user@user.com");

	     reqParam.put("Pwd", "user");
	     given.header("Content-Type", "application/json");
	     given.body(reqParam.toJSONString());
	     Response response1 = given.request(Method.GET, "/FlyAway/home");
	    
	 
	     int statusCode1 = response1.getStatusCode();
	     System.out.println(statusCode1+"POSTrequest");
	     
	     Assert.assertEquals(response1.getStatusCode(), 200);     
	     System.out.println("rest passed");
	}
	@When("user the request is done")
	public void user_the_request_is_done() {
		 RestAssured.baseURI = "http://localhost:8080";
		Response response2 = given.request(Method.POST, "/FlyAway/loginaction?email_id=user%40user.com&pwd=user");
		int statusCode2 = response2.getStatusCode();
	     System.out.println(statusCode2+"GET1request");
		System.out.println(response2.getBody().asString());
		Assert.assertEquals(response2.getStatusCode(), 302); 
		
	     
	System.out.println("user respose body");
	}
	@Then("user shoulld be able to see bookings")
	public void user_shoulld_be_able_to_see_bookings() {
		 RestAssured.baseURI = "http://localhost:8080";
		Response response3 = given.request(Method.GET, "/FlyAway/memberbookings");
	    int statusCode3 = response3.getStatusCode();
	    System.out.println(statusCode3+"GETrequest");		
		System.out.println(response3.getBody().asString());     
	     Assert.assertEquals(response3.getStatusCode(), 200);}

    

}
