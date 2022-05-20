package com.jd.test;

import io.restassured.RestAssured;

public class Demo1Get2 {

	private static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) {
		
		String resource="pet/2122";
		
		
		String result=RestAssured.given()
		.when().get(baseUrl+resource)
		.then().extract().asString();
		
		System.out.println(result);
		System.out.println(result.contains("120"));
	}
}
