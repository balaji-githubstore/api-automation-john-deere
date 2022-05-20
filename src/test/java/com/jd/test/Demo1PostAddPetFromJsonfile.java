package com.jd.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Demo1PostAddPetFromJsonfile {

	private static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String resource="pet";
		
		FileInputStream file=new FileInputStream("target/data.json");
		JsonPath json=new JsonPath(file);
		
		String jsonBody=json.prettify();
		
		RestAssured.given()
		.headers("Content-Type","application/json")
		.body(jsonBody)
		.when().post(baseUrl+resource)
		.then().log().all().statusCode(200);
	}
}
