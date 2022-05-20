package com.jd.test;

import io.restassured.RestAssured;

public class Demo1Delete {

	private static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) {
		
		String resource="pet/2122";
		
		
		String result=RestAssured.given()
		.when().delete(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		System.out.println(result);
		
	}
}
