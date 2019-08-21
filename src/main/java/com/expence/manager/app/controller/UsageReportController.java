package com.expence.manager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.expence.manager.app.service.AdvanceService;
import com.expence.manager.app.service.CurrencyConversionService;
import com.expence.manager.app.service.ExpenseService;

@RestController
public class UsageReportController {

	@Autowired
	ExpenseService expenceService;
	@Autowired
	CurrencyConversionService conversionService;
	@Autowired
	AdvanceService advanceService;
}
