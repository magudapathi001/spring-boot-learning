package com.rest.api.employee.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true, length = 50)
    private String name;
    @Column(nullable = true, length = 50)
    private String address;
    @Column(nullable = true, length = 50)
    private String phone;
    @Column(nullable = true, length = 50)
    private String email;
}