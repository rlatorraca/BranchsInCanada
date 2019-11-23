package com.rlsp.CitiesOfCanada.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rlsp.CitiesOfCanada.model.City;

@Component
public class Cities {

	public List<City> byAbbrProvince(String abbr) {
		
		List<City> citiesFilteredByProvince = null;
		switch (abbr) {
		case "AB":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Edmonton (Province Capital)"),
					new City(2L, "Calgary"),
					new City(3L, "Red Deer"),
					new City(4L, "Lethbridge"),
					new City(5L, "St. Albert"),
					new City(6L, "Medicine Hat"),
					new City(7L, "Grande Prairie"));
			break;
		case "BC":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Victory (Province Capital)"),
					new City(2L, "Vancouver"),
					new City(3L, "Surrey"),
					new City(4L, "Burnaby"),
					new City(5L, "Richmond"),
					new City(6L, "Abbotsford"),
					new City(7L, "Coquitlam"),
					new City(8L, "Saanich"),
					new City(9L, "Langley"),
					new City(10L, "Delta"));
			break;
		
		case "MB":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Winnipeg (Province Capital)"),
					new City(2L, "Brandon"),
					new City(3L, "Steinbach"),
					new City(4L, "Portage la Prairie"),
					new City(5L, "Steinbach"),
					new City(6L, "Thompson"));
			break;
		
		case "NB":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Frederiction (Province Capital)"),
					new City(2L, "Moncton"),
					new City(3L, "St John"),
					new City(4L, "Miramichi"),
					new City(5L, "Bathrust"));
			break;
		
		case "NL":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "St John's (Province Capital)"),
					new City(2L, "Conception Bay South"),
					new City(3L, "Mount Pearl"),
					new City(4L, "Paradise"),
					new City(5L, "Corner Brook"));	
			break;
		case "NS":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Halifax (Province Capital)"),
					new City(2L, "Sydney"),
					new City(3L, "Kentville"),
					new City(4L, "Truro"),
					new City(5L, "Pictou"));
			break;
		
		case "NT":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Yellowknife (Province Capital)"),
					new City(2L, "Fort Simpson"),
					new City(3L, "Inuvik"),
					new City(4L, "Sachs Harbour"));
			break;	

		case "NU":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Iqaluit (Province Capital)"),
					new City(2L, "Rankin Inlet"),
					new City(3L, "Arviat"),
					new City(4L, "Cambridge Bay"),
					new City(5L, "Pond Inlet"));
			break;
		
		case "ON":
			citiesFilteredByProvince = Arrays.asList(					
					new City(1L, "Ottawa (National Capital"),
					new City(2L, "Toronto (Province Capital)"),
					new City(3L, "Hamilton"),
					new City(4L, "Kitchener"),
					new City(5L, "London"),
					new City(6L, "St. Catharines"),
					new City(7L, "Oshawa"),
					new City(8L, "Windsor"),
					new City(9L, "Barrie "),
					new City(10L, "Sudbury"));					
			break;
		
		case "PE":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Charlottetown (Province Capital)"),
					new City(2L, "Summerside"),					
					new City(3L, "Stratford"),
					new City(4L, "Cornwall"),
					new City(5L, "Montague"),
					new City(6L, "Kensington"),
					new City(7L, "Souris"),
					new City(8L, "Alberton"),
					new City(8L, "Tignish"),
					new City(8L, "Georgetown"));
			break;	
		
		case "QB":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Quebec City (Province Capital)"),
					new City(2L, "Montreal"),
					new City(3L, "Gatinueau"),
					new City(4L, "Sherbrooke"),
					new City(5L, "Saguenay"),
					new City(6L, "Trois-Rivières"),
					new City(7L, "Saint-Jean-sur-Richelieu"),
					new City(8L, "Drummondville"),
					new City(9L, "Granby"),
					new City(10L, "Saint-Hyacinthe"));
			break;	
		
		case "SK":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Regina (Province Capital)"),
					new City(2L, "Saskatoon"),
					new City(3L, "Prince Albert"),
					new City(4L, "Moose Jaw"),
					new City(5L, "Swift Current"),
					new City(6L, "Yorkton"));
			break;	
				
			
		case "YT":
			citiesFilteredByProvince = Arrays.asList(
					new City(1L, "Whitehorse (Capital)"),
					new City(2L, "Watson Lake"),
					new City(3L, "Dawson"),
					new City(4L, "Haines Junction"),
					new City(5L, "Carmacks"));
			break;
	
			
			
			
		default: 
			throw new IllegalArgumentException("Province doesn't exist or not mapped.");
		}
		
		return citiesFilteredByProvince;
	}
	
}
