package com.rest.api.employee.repository;

import com.rest.api.employee.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    boolean existsByStudentName(String studentName);
}