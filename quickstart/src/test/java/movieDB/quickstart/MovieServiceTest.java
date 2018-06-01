package movieDB.quickstart;

import org.junit.Test;

public class MovieServiceTest extends Base_RT{

	/**
	 * TODO: Create call into movie service and request summary of movie in a different language. This ensures that the service is returning correct
	 * information on the request. All these tests can be asserted against the MovieData class to ensure accurate responses.
	 *
	 * /movie/{movie_id}/translations
	 */
	@Test
	public void test_summaryLanguage() {

	}

	/**
	 * TODO: This would test using the HTTP POST call through hashmaps to pass in values for rating.
	 * This test is to ensure that an authenticated user or guest
	 * can post a rating to a movie. You can also write a separate test passing in a non integer and verify that a 401 is returned
	 * as an invalid scenario for postRating.
	 *
	 * /movie/{movie_id}/rating
	 */
	@Test
	public void test_postRating() {

		//create an authenticated session or guest session

		//create a hashmap with the name the JSON is expecting and a integer rating

		//assert that the http status code returned is OK or alternatively assert that rating matches rating passed in
	}

	/**
	 * TODO: This would test using the HTTP DELETE call through hashmaps to pass in values for rating for a specific movie.
	 * This test is to ensure that am authenticated user or guest
	 * can delete a rating to a movie.
	 *
	 * Ideally this endpoint works as above and on a returned JSON the rating is deleted.
	 *
	 * /movie/{movie_id}/rating
	 */
	@Test
	public void test_deleteRating() {

		//create an authenticated session or guest session

		//create a hashmap with the name the JSON is expecting and a integer rating

		//assert that the http status code returned is OK or alternatively assert that rating is empty.
	}

	/**
	 * TODO: Create call into movie service and request upcoming titles
	 *
	 * You can use this test to assert that a list of titles containing something in the future is returned.
	 *
	 *  /movie/upcoming
	 */
	@Test
	public void test_upcomingTitles() {

	}

	/**
	 * TODO: Create call into movie service and request credits.
	 *
	 * You can query here that the JSON contains a specific actor to verify that the endpoint is returning valid information
	 */
	@Test
	public void test_getCredits() {

	}

	/**
	 * TODO: Create call into movie service and request release dates
	 *
	 * You can query here for specific dates set up on your testMoviesData to verify that the endpoint is returning valid information
	 */
	@Test
	public void test_releaseDates() {

	}

	/**
	 * TODO: Gets changes for a movie.
	 *
	 * You can setup to query to get changes over a range of days and ensure the correct JSON is returned.
	 *
	 *  /movie/{movie_id}/changes
	 */
	@Test
	public void test_getChanges() {

	}
}
