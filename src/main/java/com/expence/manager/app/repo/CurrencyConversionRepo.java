package com.expence.manager.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expence.manager.app.model.CurrencyConversion;

public interface CurrencyConversionRepo extends JpaRepository<CurrencyConversion, Long>{

}
