package com.expence.manager.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.expence.manager.app.model.CashType;
import com.expence.manager.app.service.CashTypeService;

@Controller
public class CashTypeController {

	@Autowired
	private CashTypeService service;
	
	@GetMapping(value="/cashtype")
	public ResponseEntity<List<CashType>> getList() {
		return new ResponseEntity<List<CashType>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/cashtype/save")
	public ResponseEntity<CashType> saveCashType(CashType clg) {
		return new ResponseEntity<CashType>(this.service.save(clg), HttpStatus.OK);
	}
}
