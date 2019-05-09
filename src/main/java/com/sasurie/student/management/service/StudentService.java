package com.sasurie.student.management.service;

import java.util.List;

import com.sasurie.student.management.model.Student;

public interface StudentService {

	public List<Student> listToDo();
	public Student save(Student stud);
}
