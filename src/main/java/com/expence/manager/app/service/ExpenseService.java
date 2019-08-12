package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.expence.manager.app.model.Expense;

@Service
public interface ExpenseService {
	public List<Expense> findAll();
	public Expense save(Expense type);
	public Expense update(Expense type);
	public Optional<Expense> read(long id);
	public void delete(long id);
}
