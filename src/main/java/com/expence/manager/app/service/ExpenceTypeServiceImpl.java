package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.ExpenseType;
import com.expence.manager.app.repo.ExpenseTypeRepo;

@Service
public class ExpenceTypeServiceImpl implements ExpenseTypeService {
	
	@Autowired
	private ExpenseTypeRepo repo;

	@Override
	@Transactional
	public List<ExpenseType> listToDo() {
		return this.repo.findAll();
	}

	@Override
	@Transactional
	public ExpenseType save(ExpenseType type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public ExpenseType update(ExpenseType type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public Optional<ExpenseType> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.repo.deleteById(id);
	}

}
