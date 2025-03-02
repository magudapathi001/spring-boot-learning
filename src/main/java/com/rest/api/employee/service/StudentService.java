package com.rest.api.employee.service;

import com.rest.api.employee.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto CreateStudent(StudentDto studentDto);

    StudentDto GetStudentById(Long id);

    List<StudentDto> GetAllStudents();

    StudentDto UpdatedStudent(Long id,StudentDto studentDto);

    void DeleteStudent(Long id);
}
