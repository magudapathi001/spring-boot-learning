package com.rest.api.employee.service;

import com.rest.api.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto GetEmployeeById(Integer id);

    List<EmployeeDto> GetAllEmployees();

    EmployeeDto UpdateEmployee(Integer id ,EmployeeDto UpdatedemployeeDto);

    void DeleteEmployee(Integer id);
}
