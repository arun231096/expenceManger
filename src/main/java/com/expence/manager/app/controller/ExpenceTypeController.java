package com.expence.manager.app.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.expence.manager.app.model.ExpenceType;
import com.expence.manager.app.service.ExpenceTypeService;

@Controller
public class ExpenceTypeController {

	@Autowired
	private ExpenceTypeService service;
	
	@GetMapping(value="/expencetype")
	public ResponseEntity<List<ExpenceType>> getList() {
		return new ResponseEntity<List<ExpenceType>>(this.service.listToDo(), HttpStatus.OK);
	}
	
	@PostMapping(value="/expencetype/save")
	public ResponseEntity<ExpenceType> saveExpenceType(ExpenceType stud) {
		return new ResponseEntity<ExpenceType>(this.service.save(stud), HttpStatus.OK);
	}
	
	@PutMapping(value = "/expencetype/update")
	public ResponseEntity<ExpenceType> updateExpenceType (ExpenceType type) {
		return new ResponseEntity<ExpenceType>(this.service.update(type), HttpStatus.OK);
	}

	@GetMapping(value = "/expencetype/read")
	public ResponseEntity<Optional<ExpenceType>> readExpenceType (@PathParam(value = "id") long id) {
		return new ResponseEntity<Optional<ExpenceType>>(this.service.read(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/expencetype/delete")
	public void delete(@PathParam(value = "id") long id) {
		this.service.delete(id);
	}
}
