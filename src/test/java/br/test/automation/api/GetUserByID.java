package br.test.automation.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

import br.test.automation.core.BaseTest;

public class GetUserByID extends BaseTest{
	
	@Test
	public void getUserByID() {
		given()
		.when()
			.get("/users/8")
		.then()
			.statusCode(200)
			.body("data.id", equalTo(8))
			.body("data.email", equalTo("lindsay.ferguson@reqres.in"))
			.body("data.first_name", equalTo("Lindsay"))
			.body("data.last_name", equalTo("Ferguson"))
			.body("data.avatar", equalTo("https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg"))
			
			.body("ad.company", equalTo("StatusCode Weekly"))
			.body("ad.url", equalTo("http://statuscode.org/"))
			.body("ad.text", equalTo("A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things."))	
		;
			
	}
	
	@Test
	public void getUserByID2() {
		given()
		.when()
			.get("/users/4")
		.then()
			.statusCode(200)
			.body("data.id", equalTo(4))
			.body("data.email", equalTo("eve.holt@reqres.in"))
			.body("data.first_name", equalTo("Eve"))
			.body("data.last_name", equalTo("Holt"))
			.body("data.avatar", equalTo("https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg"))
			
			.body("ad.company", equalTo("StatusCode Weekly"))
			.body("ad.url", equalTo("http://statuscode.org/"))
			.body("ad.text", equalTo("A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things."))	
		;
			
	}

}
