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
@Table(name = "expense")
@Data
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long expense_id;
	
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "expence_date")
	private LocalDateTime expence_date;
	
	@Column(name = "expense_cash")
	private long expense_cash;
	
	@Column(name = "expense_currency_type")
	private String expense_currency_type;
	
	@Column(name = "expense_note")
	private String expense_note;
	
	@Column(name = "expense_type")
	private String expense_type;
	
	@Column(name = "expense_payment_mode")
	private String expense_payment_mode;
	
	@Column(name = "expense_image")
	private String expense_image;
	
	@Column(name = "expense_status")
	private boolean expense_status;
}
