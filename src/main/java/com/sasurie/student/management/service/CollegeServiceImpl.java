package com.sasurie.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sasurie.student.management.dao.CollegeDao;
import com.sasurie.student.management.model.College;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeDao collegedao;

	@Override
	@Transactional
	public List<College> findAll() {

		return this.collegedao.findAll();
	}

	@Override
	public College save(College clg) {

		return this.collegedao.save(clg);
	}

}
