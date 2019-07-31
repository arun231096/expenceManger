package com.expence.manager.app.service;

import java.util.List;

import com.expence.manager.app.model.CashType;

public interface CashTypeService {

	public List<CashType> findAll();
	public CashType save(CashType type);
}
