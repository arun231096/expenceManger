package com.expence.manager.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expence.manager.app.model.ExpenceType;
import com.expence.manager.app.repo.ExpenceTypeRepo;

@Service
public class ExpenceTypeServiceImpl implements ExpenceTypeService {
	
	@Autowired
	private ExpenceTypeRepo ToDoDAO;

	@Override
	@Transactional
	public List<ExpenceType> listToDo() {
		return this.ToDoDAO.findAll();
	}

	@Override
	@Transactional
	public ExpenceType save(ExpenceType type) {
		// TODO Auto-generated method stub
		return this.ToDoDAO.save(type);
	}

}
