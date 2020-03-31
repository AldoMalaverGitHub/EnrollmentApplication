package com.amalaver.enrollment.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amalaver.enrollment.data.entities.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
