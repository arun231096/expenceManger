package com.expence.manager.app.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expence.manager.app.model.CashType;
import com.expence.manager.app.service.CashTypeService;

@RestController
public class CashTypeController {

	@Autowired
	private CashTypeService service;
	
	@GetMapping(value="/cashtype")
	public ResponseEntity<List<CashType>> getList() {
		return new ResponseEntity<List<CashType>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/cashtype/save")
	public ResponseEntity<CashType> saveCashType(CashType type) {
		return new ResponseEntity<CashType>(this.service.save(type), HttpStatus.OK);
	}

	@PutMapping(value = "/cashtype/update")
	public ResponseEntity<CashType> updateCashType (CashType type) {
		return new ResponseEntity<CashType>(this.service.update(type), HttpStatus.OK);
	}

	@GetMapping(value = "/cashtype/read")
	public ResponseEntity<Optional<CashType>> readCashType (@PathParam(value = "id") long id) {
		return new ResponseEntity<Optional<CashType>>(this.service.read(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/cashtype/delete")
	public void delete(@PathParam(value = "id") long id) {
		this.service.delete(id);
	} 
}
