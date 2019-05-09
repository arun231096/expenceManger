package com.sasurie.student.management.service;

import java.util.List;

import com.sasurie.student.management.model.College;

public interface CollegeService {

	public List<College> findAll();
	public College save(College clg);
}
