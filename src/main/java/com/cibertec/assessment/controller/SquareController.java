package com.cibertec.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.assessment.model.Square;
import com.cibertec.assessment.service.SquareService;

@RequestMapping
@RestController
public class SquareController {

	@Autowired
	SquareService squaservi;
	
	public Square create(Square s) {
		return squaservi.create(s) ;
	}

	@Override
	public List<Square> list() {
		return squaservi.list();
	}
	
}
