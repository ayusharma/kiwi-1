package org.oncoblocks.web.dao;

public class Gene {
	private int id;
	private String geneid;
	private String summary;
	
	public Gene() {
		
	}

	public Gene(int id, String geneid, String summary) {
		this.id = id;
		this.geneid = geneid;
		this.summary = summary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneid() {
		return geneid;
	}

	public void setGeneid(String geneid) {
		this.geneid = geneid;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Gene [id=" + id + ", geneid=" + geneid + ", summary=" + summary
				+ "]";
	}
}
