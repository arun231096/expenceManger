package com.expence.manager.app.model;

import java.sql.Date;

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
	long expense_id;
	
	@Column
	Date expence_date;
	
	@Column
	long expense_cash;
	
	@Column
	String expense_currency_type;
	
	@Column
	String expense_note;
	
	@Column
	String expense_type;
	
	@Column
	String expense_payment_mode;
	
	@Column
	String expense_image;
}
