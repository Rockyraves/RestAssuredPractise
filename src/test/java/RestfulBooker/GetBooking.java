package RestfulBooker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetBooking {

	@Test
	public void getBooking()
	{
		RestAssured
			.given()
				.log().all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/{id}")
				.pathParam("id",20)
			.when()
				.get()
			.then()
				.log().all()
				.assertThat()
				.statusCode(200);
	}
	
}
