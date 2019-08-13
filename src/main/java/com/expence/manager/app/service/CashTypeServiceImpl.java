package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.CashType;
import com.expence.manager.app.repo.CashTypeRepo;

@Service
public class CashTypeServiceImpl implements CashTypeService {

	@Autowired
	CashTypeRepo repo;

	@Override
	@Transactional
	public List<CashType> findAll() {

		return this.repo.findAll();
	}

	@Override
	@Transactional
	public CashType save(CashType type) {

		return this.repo.save(type);
	}

	@Override
	@Transactional
	public CashType update(CashType type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public Optional<CashType> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.repo.deleteById(id);
	}

}
