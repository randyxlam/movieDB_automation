package movieDB.quickstart;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Base_RT {

	private static final String TMDB_base_url = "https://api.themoviedb.org/3";

	//The commented out code below can replaces the base url as another option for initializing the base url.

	//TestUtils.getTMDBBaseURL();

	//parameterized API key
	private static final String PARAM_API_KEY = "3d1f4ae096c3ba2868ca941ecd1c865d";

	/**
	 * Creates a temporary request token to validate a session.
	 */
	@Test
	public void test_requestToken() {

	}

	/**
	 * Creates sessionID with valid request token. This is on the base class because it can be used in a variety of other places
	 * This test is useful because it allows you to test authenicated and unauthenticated sessions. Many other endpoints
	 * on the API seem to need an authenticated user. You'll likely also want to create something to rollback the accountdata after
	 * the tests are finished to avoid cluttering the database.
	 *
	 * The test should return an OK HTTP status code if the authentication is successful.
	 */
	@Test
	public void test_Session() {
		//you'll need to pass in an api_key and a request token.
	}




	public static String getTmdbBaseUrl() {
		return TMDB_base_url;
	}

	public static String getParamApiKey() {
		return PARAM_API_KEY;
	}
}

