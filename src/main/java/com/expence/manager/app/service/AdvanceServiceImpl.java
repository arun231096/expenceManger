package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.manager.app.model.Advance;
import com.expence.manager.app.repo.AdvanceRepo;

@Service
public class AdvanceServiceImpl implements AdvanceService {

	@Autowired
	AdvanceRepo repo;
	
	@Override
	@Transactional
	public List<Advance> findAll() {
		return this.repo.findAll();
	}

	@Override
	@Transactional
	public Advance save(Advance data) {
		return this.repo.save(data);
	}

	@Override
	@Transactional
	public Advance update(Advance data) {
		return this.repo.save(data);
	}

	@Override
	@Transactional
	public Optional<Advance> read(long id) {
		return this.repo.findById(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.repo.deleteById(id);
	}

}
