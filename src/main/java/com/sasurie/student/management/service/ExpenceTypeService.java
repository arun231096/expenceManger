package com.sasurie.student.management.service;

import java.util.List;

import com.sasurie.student.management.model.ExpenceType;

public interface ExpenceTypeService {

	public List<ExpenceType> listToDo();
	public ExpenceType save(ExpenceType type);
}
