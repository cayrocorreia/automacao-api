package br.test.automation.api;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.test.automation.core.BaseTest;

public class PostUser extends BaseTest{
	
	@Test
	public void postUser() {
		String postJson = "{\"name\":\"Cayro Correia\",\"job\": \"QA Analyst\"}";
		
		given()
			.body(postJson)
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			;
		
		
		
		
	}
	

}
