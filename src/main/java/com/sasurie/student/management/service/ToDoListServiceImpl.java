package com.sasurie.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sasurie.student.management.dao.StudentDao;
import com.sasurie.student.management.model.Student;

@Service
public class ToDoListServiceImpl implements ToDoListService {
	
	@Autowired
	private StudentDao ToDoDAO;

	@Override
	@Transactional
	public List<Student> listToDo() {
		return this.ToDoDAO.findAll();
	}

}
