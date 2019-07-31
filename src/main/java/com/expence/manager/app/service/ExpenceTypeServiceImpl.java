package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.ExpenceType;
import com.expence.manager.app.repo.ExpenceTypeRepo;

@Service
public class ExpenceTypeServiceImpl implements ExpenceTypeService {
	
	@Autowired
	private ExpenceTypeRepo repo;

	@Override
	@Transactional
	public List<ExpenceType> listToDo() {
		return this.repo.findAll();
	}

	@Override
	@Transactional
	public ExpenceType save(ExpenceType type) {
		return this.repo.save(type);
	}

	@Override
	public ExpenceType update(ExpenceType type) {
		return this.repo.save(type);
	}

	@Override
	public Optional<ExpenceType> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	public void delete(long id) {
		this.repo.deleteById(id);
	}

}
