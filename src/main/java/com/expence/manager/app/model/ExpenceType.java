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
@Table(name="student")
@Data
public class ExpenceType {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="name")
	private String name;
}
