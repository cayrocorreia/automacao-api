package br.test.automation.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

import br.test.automation.core.BaseTest;

public class PutUser extends BaseTest{
	@Test
	public void pustUser() {
		String pJson = "{\"name\":\"Cayro Correia\",\"job\": \"QA Analyst\"}";
		
		given()
			.body(pJson)
		.when()
			.put("/users/2")
		.then()
			.statusCode(200)
			.body("name", equalTo("Cayro Correia"))
			.body("job", equalTo("QA Analyst"))
			;
		
		
		
		
	}

}
