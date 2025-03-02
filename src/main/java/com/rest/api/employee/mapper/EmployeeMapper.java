package com.rest.api.employee.mapper;

import com.rest.api.employee.dto.EmployeeDto;
import com.rest.api.employee.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto toEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getName(),
                employee.getAddress(),
                employee.getEmail(),
                employee.getPhone()
        );
    }

    public static Employee toEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getAddress(),
                employeeDto.getEmail(),
                employeeDto.getPhone()
        );
    }
}
