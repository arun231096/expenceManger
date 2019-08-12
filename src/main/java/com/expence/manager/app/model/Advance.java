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
@Table(name = "advance")
@Data
public class Advance {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long advance_id;
	
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "advance_amount")
	private long advance_amount;
	
	@Column(name = "advance_currency_type")
	private String advance_currency_type;
	
	@Column(name = "advance_note")
	private String advance_note;
	
	@Column(name = "advance_date")
	private LocalDateTime advance_date;
	
	@Column(name = "advance_status")
	private boolean advance_status;
}
