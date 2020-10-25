package br.test.automation.core;

import io.restassured.http.ContentType;

public interface Constantes {
	String APP_BASE_URL = "https://reqres.in/api";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 3000L;

}
