package com.expence.manager.app.service;

import java.util.List;
import java.util.Optional;

import com.expence.manager.app.model.Advance;

public interface AdvanceService {

	public List<Advance> findAll();
	public List<Advance> findAllById(List<Long> id);
	public Advance save(Advance data);
	public Advance update(Advance data);
	public Optional<Advance> read(long id);
	public void delete(long id);
}
