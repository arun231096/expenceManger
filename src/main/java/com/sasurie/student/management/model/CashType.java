package com.sasurie.student.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="college")
@Data
public class CashType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;

	@Column(name="name")
	private String name;
}
