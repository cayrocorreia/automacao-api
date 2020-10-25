package br.test.automation.api;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.test.automation.core.BaseTest;

public class DeleteUser extends BaseTest{

	@Test
	public void deleteUser() {
		given()
		.when()
			.delete("/users/8")
		.then()
			.statusCode(204)
			;
		
	}
}
