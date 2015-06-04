package org.oncoblocks.web.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestApiGet {
	
	private String summary;

	public String getSummary() {
		return summary;
	}
	
	

}
