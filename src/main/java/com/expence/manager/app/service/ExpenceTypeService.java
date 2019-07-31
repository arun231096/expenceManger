package com.expence.manager.app.service;

import java.util.List;

import com.expence.manager.app.model.ExpenceType;

public interface ExpenceTypeService {

	public List<ExpenceType> listToDo();
	public ExpenceType save(ExpenceType type);
}
