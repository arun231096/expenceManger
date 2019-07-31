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

import com.expence.manager.app.model.Advance;
import com.expence.manager.app.service.AdvanceService;

@RestController
public class AdvanceController {
	
	@Autowired
	AdvanceService service;

	@GetMapping(value="/advance")
	public ResponseEntity<List<Advance>> getList() {
		return new ResponseEntity<List<Advance>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/advance/save")
	public ResponseEntity<Advance> saveAdvance(Advance type) {
		return new ResponseEntity<Advance>(this.service.save(type), HttpStatus.OK);
	}

	@PutMapping(value = "/advance/update")
	public ResponseEntity<Advance> updateAdvance (Advance type) {
		return new ResponseEntity<Advance>(this.service.update(type), HttpStatus.OK);
	}

	@GetMapping(value = "/advance/read")
	public ResponseEntity<Optional<Advance>> readAdvance (@PathParam(value = "id") long id) {
		return new ResponseEntity<Optional<Advance>>(this.service.read(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/advance/delete")
	public void delete(@PathParam(value = "id") long id) {
		this.service.delete(id);
	}
}
