package com.rest.api.employee.service.impl;

import com.rest.api.employee.dto.StudentDto;
import com.rest.api.employee.entity.Student;
import com.rest.api.employee.exception.ResourceNotFoundException;
import com.rest.api.employee.mapper.StudentMapper;
import com.rest.api.employee.repository.StudentRepository;
import com.rest.api.employee.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentImpl implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public StudentDto CreateStudent(StudentDto studentDto) {
        Student student = StudentMapper.toStudent(studentDto);
        Student saved_student = studentRepository.save(student);
        return StudentMapper.toStudentDto(saved_student);
    }

    @Override
    public StudentDto GetStudentById(Long id) {
        Student student  = studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Student not found"));
        return StudentMapper.toStudentDto(student);
    }

    @Override
    public List<StudentDto> GetAllStudents() {
        List<Student> student = studentRepository.findAll();
        return student.stream().map(StudentMapper::toStudentDto).collect(Collectors.toList());
    }

    @Override
    public StudentDto UpdatedStudent(Long id, StudentDto studentDto) {
        Student student = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student not exist with given id: " + id));

        student.setStudentName(studentDto.getStudentName());
        student.setStudentSurname(studentDto.getStudentSurname());
        student.setStudentEmail(studentDto.getStudentEmail());
        student.setStudentPhone(studentDto.getStudentPhone());
        Student updateObj = studentRepository.save(student);
        return StudentMapper.toStudentDto(updateObj);
    }

    @Override
    public void DeleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student not found with given id: " + id));
        studentRepository.deleteById(id);

    }


}
