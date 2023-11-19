package com.example.withreact.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.withreact.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}
