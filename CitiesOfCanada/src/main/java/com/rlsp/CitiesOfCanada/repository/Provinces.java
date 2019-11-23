package com.rlsp.CitiesOfCanada.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rlsp.CitiesOfCanada.model.Province;

@Component
public class Provinces {
	
	public List<Province> allProvinces() {
		return Arrays.asList(
				new Province(1L, "AB", "Alberta"),
				new Province(2L, "BC", "British Columbia"),
				new Province(3L, "NB", "New Brunswick"),
				new Province(4L, "MB", "Manitoba"),
				new Province(5L, "NL", "Newfoundland and Labrador"),
				new Province(6L, "NS", "Nova Scotia"),
				new Province(7L, "NT", "Northwest Territories"),
				new Province(8L, "NU", "Nunavut"),
				new Province(9L, "ON", "Ontario"),
				new Province(10L, "PE", "Prince Edward Island"),
				new Province(11L, "QB", "Quebec"),
				new Province(12L, "SK", "Saskatchewan"),
				new Province(13L, "YT", "Yukon"));
	}
	
}
