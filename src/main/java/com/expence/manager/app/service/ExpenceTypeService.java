package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import com.expence.manager.app.model.ExpenceType;

public interface ExpenceTypeService {

	public List<ExpenceType> listToDo();
	public ExpenceType save(ExpenceType type);
	public ExpenceType update(ExpenceType type);
	public Optional<ExpenceType> read(long id);
	public void delete(long id);
}
