package br.test.automation.api;

import static io.restassured.RestAssured.given;



import org.junit.Test;

import br.test.automation.core.BaseTest;

public class LoginSuccessful extends BaseTest{

	@Test
	public void loginSuccessful() {
		String loginJson = "{\"email\":\"eve.holt@reqres.in\",\"password\": \"cityslicka\"}";
	
		String token = given()
			.body(loginJson)
		.when()
			.post("/login")
		.then()
			.statusCode(200)
			.extract().path("token");
			System.out.println("TOKEN GERADO AO EFETUAR O LOGIN COM SUCESSO: " + token);
		
	}
}
