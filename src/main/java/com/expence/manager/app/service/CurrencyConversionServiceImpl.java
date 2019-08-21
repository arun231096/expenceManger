package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.CurrencyConversion;
import com.expence.manager.app.repo.CurrencyConversionRepo;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	CurrencyConversionRepo repo;

	@Override
	@Transactional
	public List<CurrencyConversion> findAll() {
		return this.repo.findAll();
	}

	@Override
	@Transactional
	public CurrencyConversion save(CurrencyConversion type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public CurrencyConversion update(CurrencyConversion type) {
		return this.repo.save(type);
	}

	@Override
	@Transactional
	public Optional<CurrencyConversion> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.repo.deleteById(id);
	}

	@Override
	@Transactional
	public List<CurrencyConversion> findAllById(List<Long> id) {
		return this.repo.findAllById(id);
	}

}
