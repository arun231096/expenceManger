package com.expence.manager.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author arunkumar
 *
 */
@Entity
@Table(name="extencetype")
@Data
public class ExpenseType {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long expense_type_id;

	@Column(name = "expense_type_icon")
	private String expense_type_icon;
	
	@Column(name="expense_type_name")
	private String expense_type_name;
}
