package com.expence.manager.app.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "currency_conversion")
@Data
public class CurrencyConversion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long currency_conversion_id;
	
	@Column(name="currency_conversion_date")
	private LocalDateTime currency_conversion_date;
	
	@Column(name="currency_conversion_amount")
	private String currency_conversion_amount;
	
	@Column(name="currency_conversion_base_currency_type")
	private String currency_conversion_base_currency_type;
	
	@Column(name="currency_conversion_converted_currency_type")
	private String currency_conversion_converted_currency_type;
	
	@Column(name="currency_conversion_currency_rate")
	private String currency_conversion_currency_rate;
	
	@Column(name="currency_conversion_converted_amount")
	private String currency_conversion_converted_amount;
	
	@Column(name="currency_conversion_note")
	private String currency_conversion_note;
	
	@Column(name="currency_conversion_image")
	private String currency_conversion_image;
	
	@Column(name="currency_conversion_status")
	private boolean currency_conversion_status;
}
