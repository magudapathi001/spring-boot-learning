package com.rest.api.employee.controller;


import com.rest.api.employee.dto.StudentDto;
import com.rest.api.employee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        StudentDto saved_student = studentService.CreateStudent(studentDto);
        return new ResponseEntity<>(saved_student, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long id) {
        StudentDto student_data = studentService.GetStudentById(id);
        return new ResponseEntity<>(student_data, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> GetAllStudents() {
        List<StudentDto> student_date = studentService.GetAllStudents();
        return new ResponseEntity<>(student_date, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") Long id, @RequestBody StudentDto studentDto) {
        StudentDto updated_data = studentService.UpdatedStudent(id, studentDto);
        return new ResponseEntity<>(updated_data, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> DeleteStudent(@PathVariable("id") Long id) {
        studentService.DeleteStudent(id);
        return ResponseEntity.ok("Student deleted");
    }

}