package com.expence.manager.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="cashtype")
@Data
public class CashType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long cash_type_id;

	@Column(name="cash_type_name")
	private String cash_type_name;
}
