package com.rest.api.employee.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long studentId;
    private String studentName;
    private String studentSurname;
    private String studentEmail;
    private String studentPhone;
}
