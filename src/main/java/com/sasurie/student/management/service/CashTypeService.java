package com.sasurie.student.management.service;

import java.util.List;

import com.sasurie.student.management.model.CashType;

public interface CashTypeService {

	public List<CashType> findAll();
	public CashType save(CashType type);
}
