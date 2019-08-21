package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import com.expence.manager.app.model.Expense;

public interface ExpenseService {
	public List<Expense> findAll();
	public List<Expense> findAllById(List<Long> ids);
	public Expense save(Expense type);
	public Expense update(Expense type);
	public Optional<Expense> read(long id);
	public void delete(long id);
}
