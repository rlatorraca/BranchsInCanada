package com.rlsp.CitiesOfCanada.model;

public class City {

	private Long code;
	private String name;
	
	public City(long code, String name) {
		this.code = code;
		this.name = name;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
