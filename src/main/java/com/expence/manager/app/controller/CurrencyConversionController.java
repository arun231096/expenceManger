package com.expence.manager.app.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expence.manager.app.model.CurrencyConversion;
import com.expence.manager.app.service.CurrencyConversionService;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyConversionService service;
	
	@GetMapping(value="/currencyconversion")
	public ResponseEntity<List<CurrencyConversion>> getList() {
		return new ResponseEntity<List<CurrencyConversion>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/currencyconversion/save")
	public ResponseEntity<CurrencyConversion> saveCurrencyConversion(CurrencyConversion type) {
		return new ResponseEntity<CurrencyConversion>(this.service.save(type), HttpStatus.OK);
	}

	@PutMapping(value = "/currencyconversion/update")
	public ResponseEntity<CurrencyConversion> updateCurrencyConversion (CurrencyConversion type) {
		return new ResponseEntity<CurrencyConversion>(this.service.update(type), HttpStatus.OK);
	}

	@GetMapping(value = "/currencyconversion/read")
	public ResponseEntity<Optional<CurrencyConversion>> readCurrencyConversion (@PathParam(value = "id") long id) {
		return new ResponseEntity<Optional<CurrencyConversion>>(this.service.read(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/currencyconversion/delete")
	public void delete(@PathParam(value = "id") long id) {
		this.service.delete(id);
	}
}
