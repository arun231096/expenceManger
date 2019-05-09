package com.sasurie.student.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasurie.student.management.model.College;

public interface CollegeDao extends JpaRepository<College, Long> {

}
