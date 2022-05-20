package com.jd.test;

import io.restassured.RestAssured;

public class Demo1GetQP {

	private static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) {
		
		String resource="pet/findByStatus";
		
		String result=RestAssured.given().queryParam("status", "sold")
		.when().get(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		
		System.out.println(result);
	}
}
