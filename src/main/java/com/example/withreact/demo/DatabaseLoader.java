package com.example.withreact.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.withreact.demo.model.Employee;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Autowired // constructor injection and autowiring to get Spring Data’s automatically created repo
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Abu", "Naufal", "Where are youuuu?"));
    }
    
}
