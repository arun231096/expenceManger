package com.expence.manager.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.CashType;
import com.expence.manager.app.repo.CashTypeRepo;

@Service
public class CashTypeServiceImpl implements CashTypeService {

	@Autowired
	CashTypeRepo collegedao;

	@Override
	@Transactional
	public List<CashType> findAll() {

		return this.collegedao.findAll();
	}

	@Override
	@Transactional
	public CashType save(CashType type) {

		return this.collegedao.save(type);
	}

}
