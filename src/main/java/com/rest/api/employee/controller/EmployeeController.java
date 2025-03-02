package com.rest.api.employee.controller;

import com.rest.api.employee.dto.EmployeeDto;
import com.rest.api.employee.entity.Employee;
import com.rest.api.employee.mapper.EmployeeMapper;
import com.rest.api.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto saved_employee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saved_employee, HttpStatus.CREATED);
    }

//    get employee rest api
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> GetEmployeeById(@PathVariable("id") Integer id) {
        EmployeeDto employeeDto = employeeService.GetEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> GetAllEmployees() {
        List<EmployeeDto> employeeDto = employeeService.GetAllEmployees();
        return ResponseEntity.ok(employeeDto);
    }

//    Update employee rest Api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> UpdateEmployee(@PathVariable("id") Integer id , @RequestBody EmployeeDto updatedEmployeeDto) {
        EmployeeDto employeeDto = employeeService.UpdateEmployee(id, updatedEmployeeDto);

        return ResponseEntity.ok(employeeDto);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> DeleteEmployee(@PathVariable("id") Integer id) {
        employeeService.DeleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}
