package com.sasurie.student.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasurie.student.management.model.Student;

public interface StudentDao extends JpaRepository<Student, Long>{

}
