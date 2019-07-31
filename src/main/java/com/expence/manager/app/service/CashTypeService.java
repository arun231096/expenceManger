package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import com.expence.manager.app.model.CashType;

public interface CashTypeService {

	public List<CashType> findAll();
	public CashType save(CashType type);
	public CashType update(CashType type);
	public Optional<CashType> read(long id);
	public void delete(long id);
}
