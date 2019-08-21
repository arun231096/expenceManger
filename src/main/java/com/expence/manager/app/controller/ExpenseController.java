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

import com.expence.manager.app.model.Expense;
import com.expence.manager.app.service.ExpenseService;

@RestController
@CrossOrigin
public class ExpenseController {

	@Autowired
	ExpenseService service;
	
	@GetMapping(value="/expense")
	public ResponseEntity<List<Expense>> getList() {
		return new ResponseEntity<List<Expense>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/expense/save")
	public ResponseEntity<Expense> saveExpense(Expense type) {
		return new ResponseEntity<Expense>(this.service.save(type), HttpStatus.OK);
	}

	@PutMapping(value = "/expense/update")
	public ResponseEntity<Expense> updateExpense (Expense type) {
		return new ResponseEntity<Expense>(this.service.update(type), HttpStatus.OK);
	}

	@GetMapping(value = "/expense/read")
	public ResponseEntity<Optional<Expense>> readExpense (@PathParam(value = "id") long id) {
		return new ResponseEntity<Optional<Expense>>(this.service.read(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/expense/delete")
	public void delete(@PathParam(value = "id") long id) {
		this.service.delete(id);
	}
}
