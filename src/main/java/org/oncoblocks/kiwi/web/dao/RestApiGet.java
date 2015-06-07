package main.java.org.oncoblocks.kiwi.web.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestApiGet {
	
	private String summary;

	public String getSummary() {
		return summary;
	}
	
	

}
