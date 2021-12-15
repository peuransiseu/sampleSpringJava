/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CSA.sampleFullStack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String main;
    private String department;
    private String location;

    public Employee(Long employeeId, String main, String department, String location) {
        this.employeeId = employeeId;
        this.main = main;
        this.department = department;
        this.location = location;
    }

    public Employee(){

    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getMain() {
        return main;
    }

    public String getDepartment() {
        return department;
    }

    public String getLocation() {
        return location;
    }


}
