package movieDB.quickstart;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.junit.Test;

import io.restassured.response.Response;

public class Movies extends Base_RT {

	private static final int movieID = 76341;

	/**
	 * Basic happy path response test. This tests that the service returns a valid response.
	 */
	@Test
	public void tmdb() {
		Response response = when().get(
				getTmdbBaseUrl() + "/movie/" + movieID + "?api_key=" + getParamApiKey() );

		assertThat(response.getStatusCode())
		.as("When calling endpoint, "
				+ "do we get the expected http status code?")
		.isEqualTo(200);
	}

	/**
	 * Basic non-happy path response test (Unauthorized). This tests that access is denied with
	 * an invalid request.
	 *
	 */
	@Test
	public void tmdbInvalid() {
		Response response = when().get(
				getTmdbBaseUrl() + "/movie/" + movieID + "?api_key=" + "/" + getParamApiKey() );

		assertThat(response.getStatusCode())
		.as("When calling endpoint, "
				+ "do we get the expected http status code?")
		.isEqualTo(401);
	}


	/**
	 * Checks that JSON for alternative titles contains Chinese text
	 * to verify they are rendered correctly.
	 */
	@Test
	public void testAlternativeNames() {
		given().when().get(getTmdbBaseUrl() + "/movie/" + movieID + "/alternative_titles?api_key=" + getParamApiKey())
		.then()
		.body(containsString("冲锋飞"));
	}
}
