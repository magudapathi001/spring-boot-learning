package com.rest.api.employee.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false, length = 50)
    private String studentName;
    @Column(nullable = true , length = 50)
    private String studentSurname;
    @Column(nullable = true , length = 50)
    private String studentEmail;

    @Column(nullable = true , length = 50)
    private String studentPhone;

}

