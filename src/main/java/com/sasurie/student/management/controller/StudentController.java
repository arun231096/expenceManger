package com.sasurie.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sasurie.student.management.model.Student;
import com.sasurie.student.management.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping(value="/")
	public ResponseEntity<List<Student>> getList() {
		return new ResponseEntity<List<Student>>(this.service.listToDo(), HttpStatus.OK);
	}
}
