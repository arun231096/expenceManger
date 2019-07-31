package com.expence.manager.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expence.manager.app.model.ExpenceType;

public interface ExpenceTypeRepo extends JpaRepository<ExpenceType, Long>{

}
