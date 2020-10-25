package br.test.automation.api;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.test.automation.core.BaseTest;

public class GetUsers extends BaseTest {
	
	@Test
	public void getUsers() {
		given()
		.when()
			.get("/users")
		.then()
			.statusCode(200);
		;


	}
	

}
