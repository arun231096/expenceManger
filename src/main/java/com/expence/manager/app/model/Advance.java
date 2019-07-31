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
	private long id;
	
	@Column
	private long user_id;
	
	@Column
	private long amount;
	
	@Column
	private String currency;
	
	@Column
	private String note;
	
	@Column
	private LocalDateTime date;
}