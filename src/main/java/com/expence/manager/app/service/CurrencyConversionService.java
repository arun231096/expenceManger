package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.expence.manager.app.model.CurrencyConversion;

@Service
public interface CurrencyConversionService {

	public List<CurrencyConversion> findAll();
	public CurrencyConversion save(CurrencyConversion type);
	public CurrencyConversion update(CurrencyConversion type);
	public Optional<CurrencyConversion> read(long id);
	public void delete(long id);
}
