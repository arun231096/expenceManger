package com.sasurie.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasurie.student.management.model.Student;
import com.sasurie.student.management.service.StudentService;

@RestController
public class DemoController {

	@Autowired
	private StudentService service;
	
	@GetMapping(value="/")
	public ResponseEntity<List<Student>> getList() {
		return new ResponseEntity<List<Student>>(this.service.listToDo(), HttpStatus.OK);
	}
}
