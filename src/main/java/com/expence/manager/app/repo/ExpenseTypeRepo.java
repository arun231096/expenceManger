package com.expence.manager.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expence.manager.app.model.ExpenseType;

public interface ExpenseTypeRepo extends JpaRepository<ExpenseType, Long>{

}
