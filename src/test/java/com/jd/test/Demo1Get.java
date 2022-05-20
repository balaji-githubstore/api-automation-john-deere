package com.jd.test;

import io.restassured.RestAssured;

public class Demo1Get {

	private static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) {
		int path=2122;
		String resource="pet/"+path;
		
		
		RestAssured.given()
		.when().get(baseUrl+resource)
		.then().statusCode(200);
				

	}
}
