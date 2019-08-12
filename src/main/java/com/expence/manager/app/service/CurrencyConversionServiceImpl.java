package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.manager.app.model.CurrencyConversion;
import com.expence.manager.app.repo.CurrencyConversionRepo;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	CurrencyConversionRepo repo;

	@Override
	public List<CurrencyConversion> findAll() {
		return this.repo.findAll();
	}

	@Override
	public CurrencyConversion save(CurrencyConversion type) {
		return this.repo.save(type);
	}

	@Override
	public CurrencyConversion update(CurrencyConversion type) {
		return this.repo.save(type);
	}

	@Override
	public Optional<CurrencyConversion> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	public void delete(long id) {
		this.repo.deleteById(id);
	}

}
