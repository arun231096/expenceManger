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
	
	@Column
	private LocalDateTime currency_conversion_date;
	
	@Column
	private String currency_conversion_amount;
	
	@Column
	private String currency_conversion_base_currency_type;
	
	@Column
	private String currency_conversion_converted_currency_type;
	
	@Column
	private String currency_conversion_currency_rate;
	
	@Column
	private String currency_conversion_converted_amount;
	
	@Column
	private String currency_conversion_note;
	
	@Column
	private String currency_conversion_image;
}
