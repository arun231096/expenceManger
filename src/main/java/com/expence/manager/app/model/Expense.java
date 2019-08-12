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
	
	@Column
	private String user_id;
	
	@Column
	private LocalDateTime expence_date;
	
	@Column
	private long expense_cash;
	
	@Column
	private String expense_currency_type;
	
	@Column
	private String expense_note;
	
	@Column
	private String expense_type;
	
	@Column
	private String expense_payment_mode;
	
	@Column
	private String expense_image;
	
	@Column
	private boolean expense_status;
}
