package com.expence.manager.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expence.manager.app.model.CashType;

public interface CashTypeRepo extends JpaRepository<CashType, Long> {

}
