package com.expence.manager.app.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expence.manager.app.model.Advance;
import com.expence.manager.app.model.CurrencyConversion;
import com.expence.manager.app.model.Expense;
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

	@SuppressWarnings("rawtypes")
	@GetMapping("/report")
	public ResponseEntity<Map<String, List>> getUsageReport(@PathParam(value = "id") long id) {
		List<Long> ids = new ArrayList<Long>();
		ids.add(id);
		List<Expense> expenseList = this.expenceService.findAllById(ids);
		List<CurrencyConversion> conversionList = this.conversionService.findAllById(ids);
		List<Advance> advanceList = this.advanceService.findAllById(ids);
		
		Map<String, List> usagereport = new LinkedHashMap<String, List>();
		usagereport.put("expenseList", expenseList);
		usagereport.put("conversionList", conversionList);
		usagereport.put("advanceList", advanceList);
		
		return new ResponseEntity<Map<String,List>>(usagereport, HttpStatus.OK);
	}
}
