package com.rest.api.employee.mapper;

import com.rest.api.employee.dto.StudentDto;
import com.rest.api.employee.entity.Student;

public class StudentMapper {
    public static StudentDto toStudentDto(Student student) {
        return new StudentDto(
                student.getStudentId(),
                student.getStudentName(),
                student.getStudentSurname(),
                student.getStudentEmail(),
                student.getStudentPhone()
        );
    }

    public static Student toStudent(StudentDto studentDto) {
        return new Student(
                studentDto.getStudentId(),
                studentDto.getStudentName(),
                studentDto.getStudentSurname(),
                studentDto.getStudentEmail(),
                studentDto.getStudentPhone()
        );
    }
}
