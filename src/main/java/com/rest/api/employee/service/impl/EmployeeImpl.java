package com.rest.api.employee.service.impl;

import com.rest.api.employee.dto.EmployeeDto;
import com.rest.api.employee.entity.Employee;
import com.rest.api.employee.exception.ResourceNotFoundException;
import com.rest.api.employee.mapper.EmployeeMapper;
import com.rest.api.employee.repository.EmployeeRepository;
import com.rest.api.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.toEmployee(employeeDto);
        Employee saved_employee = employeeRepository.save(employee);
        return EmployeeMapper.toEmployeeDto(saved_employee);
    }

    @Override
    public EmployeeDto GetEmployeeById(Integer id) {

        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found " + id));
        return EmployeeMapper.toEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> GetAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();
//        return employees.stream().map(EmployeeMapper::toEmployeeDto).collect(Collectors.toList());
        return employees.stream().map(EmployeeMapper::toEmployeeDto).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto UpdateEmployee(Integer id, EmployeeDto updatedEmployeeDto) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with given id: " + id));

        employee.setName(updatedEmployeeDto.getName());
        employee.setAddress(updatedEmployeeDto.getAddress());
        employee.setPhone(updatedEmployeeDto.getPhone());
        employee.setEmail(updatedEmployeeDto.getEmail());
        Employee updatedEmployeeObj = employeeRepository.save(employee);
        return EmployeeMapper.toEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void DeleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee Not Exist with given id: " + id));

        employeeRepository.deleteById(id);
    }


}
