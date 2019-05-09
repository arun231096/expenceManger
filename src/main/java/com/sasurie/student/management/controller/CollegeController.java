package com.sasurie.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sasurie.student.management.model.College;
import com.sasurie.student.management.service.CollegeService;

@Controller
public class CollegeController {

	@Autowired
	private CollegeService service;
	
	@GetMapping(value="/clg")
	public ResponseEntity<List<College>> getList() {
		return new ResponseEntity<List<College>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/clg/save")
	public ResponseEntity<College> saveClg(College clg) {
		return new ResponseEntity<College>(this.service.save(clg), HttpStatus.OK);
	}
}
