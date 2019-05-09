package com.sasurie.student.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author arunkumar
 *
 */
@Entity
@Table(name="student")
@JsonAutoDetect
@Data
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@ManyToOne
	@JoinColumn(name="college_id")
	private College clg;
	
}
