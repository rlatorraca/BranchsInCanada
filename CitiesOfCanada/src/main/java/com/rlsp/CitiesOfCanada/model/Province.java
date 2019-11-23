package com.rlsp.CitiesOfCanada.model;

public class Province {

	public Long code;
	private String abbr;
	private String name;

	public Province(Long code, String abbr, String name) {
		this.code = code;
		this.abbr = abbr;
		this.name = name;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
