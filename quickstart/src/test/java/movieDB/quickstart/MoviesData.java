package movieDB.quickstart;

import entities.Movie;

public class MoviesData {

	/**
	 * File containing sample test data to query against and verify endpoints are returning correct info.
	 */
	public static final Movie fakeMovie = new Movie();

	static {
		runMoviesData();
	}

	private static void runMoviesData() {
		fakeMovie.adult = false;
		fakeMovie.original_title = "Harry Potter";
		fakeMovie.original_language = "en";
		fakeMovie.overview = "This is a test";
		fakeMovie.title = "Harry Potter";
	}


}
