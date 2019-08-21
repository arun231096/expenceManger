package com.expence.manager.app.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expence.manager.app.model.ExpenseType;
import com.expence.manager.app.service.ExpenseTypeService;

@RestController
@CrossOrigin
public class ExpenceTypeController {

	@Autowired
	private ExpenseTypeService service;
	
	@GetMapping(value="/expencetype")
	public ResponseEntity<List<ExpenseType>> getList() {
		return new ResponseEntity<List<ExpenseType>>(this.service.listToDo(), HttpStatus.OK);
	}
	
	@PostMapping(value="/expencetype/save")
	public ResponseEntity<ExpenseType> saveExpenceType(ExpenseType stud) {
		return new ResponseEntity<ExpenseType>(this.service.save(stud), HttpStatus.OK);
	}
	
	@PutMapping(value = "/expencetype/update")
	public ResponseEntity<ExpenseType> updateExpenceType (ExpenseType type) {
		return new ResponseEntity<ExpenseType>(this.service.update(type), HttpStatus.OK);
	}

	@GetMapping(value = "/expencetype/read")
	public ResponseEntity<Optional<ExpenseType>> readExpenceType (@PathParam(value = "id") long id) {
		return new ResponseEntity<Optional<ExpenseType>>(this.service.read(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/expencetype/delete")
	public void delete(@PathParam(value = "id") long id) {
		this.service.delete(id);
	}
}
