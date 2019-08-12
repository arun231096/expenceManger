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
	
	@Column
	private String user_id;
	
	@Column
	private long advance_amount;
	
	@Column
	private String advance_currency_type;
	
	@Column
	private String advance_note;
	
	@Column
	private LocalDateTime advance_date;
	
	@Column
	private boolean advance_status;
}
