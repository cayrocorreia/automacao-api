package br.test.automation.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


import org.junit.Test;

import br.test.automation.core.BaseTest;

public class LoginUnsuccessful extends BaseTest{

	@Test
	public void loginUnsuccessful() {
		String loginJson = "{\"email\":\"peter@klaven\",\"password\": \"\"}";
		
			given()
			.body(loginJson)
		.when()
			.post("/login")
		.then()
			.statusCode(400)
			.body("error", equalTo("Missing password"))
			;
		
	}
}
