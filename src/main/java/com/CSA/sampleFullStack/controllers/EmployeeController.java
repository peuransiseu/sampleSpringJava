package com.CSA.sampleFullStack.controllers;


import com.CSA.sampleFullStack.entity.Employee;
import com.CSA.sampleFullStack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired //spring - dependency injection
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeFromId(@PathVariable Long employeeId){
        return employeeRepository.findById(employeeId).get();
    }
    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long employeeId){
        employeeRepository.deleteById(employeeId);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
