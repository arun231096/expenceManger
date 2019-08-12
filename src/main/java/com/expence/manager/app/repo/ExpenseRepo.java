package com.expence.manager.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expence.manager.app.model.Expense;

public interface ExpenseRepo extends JpaRepository<Expense, Long>{

}
