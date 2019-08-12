package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import com.expence.manager.app.model.ExpenseType;

public interface ExpenseTypeService {

	public List<ExpenseType> listToDo();
	public ExpenseType save(ExpenseType type);
	public ExpenseType update(ExpenseType type);
	public Optional<ExpenseType> read(long id);
	public void delete(long id);
}
