package movieDB.quickstart;

import org.apache.commons.lang3.StringUtils;

public class TestUtils {

	/**
	 * Get a system property, throw exception if not present
	 *
	 * @param propertyName
	 * @return
	 */
	public static String getTMDBBaseURL(){

		final String propertyName = "movieDB-service.base.url";

		String propertyValue = System.getProperty(propertyName);

		if(StringUtils.isBlank(propertyValue)){
			throw new IllegalStateException(
					"Could not find required system property [" + propertyName + "]");
		}

		return propertyValue;
	}
}


