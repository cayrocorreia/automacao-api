package br.test.automation.api;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.test.automation.core.BaseTest;

public class GetUserNotFound extends BaseTest{

	
	@Test
	public void getUserNotFound() {
		given()
		.when()
			.get("/users/23")
		.then()
			.statusCode(404)
			;
		
	}
}
