package com.rlsp.CitiesOfCanada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rlsp.CitiesOfCanada.model.Province;
import com.rlsp.CitiesOfCanada.repository.Provinces;

@RestController
@RequestMapping("/provinces")
public class EstadosController {
	
	@Autowired
	private Provinces province;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Province> todos() {
		return province.allProvinces();
	}
	
}
