package com.cibertec.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.assessment.model.Polygon;
import com.cibertec.assessment.service.PolygonService;

@RequestMapping
@RestController
public class PolygonController {
	
	@Autowired
	PolygonService polyservice;
	
	@Override
	public void create(Polygon p) {
		polyservice.create(p);
	}

	@Override
	public void create(List<Polygon> lp) {
		polyservice.create(lp);
	}

}
