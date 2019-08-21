package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.Expense;
import com.expence.manager.app.repo.ExpenseRepo;

@Service
public class ExpenceServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepo repo;

	@Override
	@Transactional
	public List<Expense> findAll() {
		return this.repo.findAll();
	}

	@Override
	@Transactional
	public Expense save(Expense type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public Expense update(Expense type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public Optional<Expense> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.repo.deleteById(id);
	}

	@Override
	@Transactional
	public List<Expense> findAllById(List<Long> ids) {
		return this.repo.findAllById(ids);
	}

}
