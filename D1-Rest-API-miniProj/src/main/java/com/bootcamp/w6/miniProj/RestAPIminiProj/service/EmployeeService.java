package com.bootcamp.w6.miniProj.RestAPIminiProj.service;

import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import java.util.List;

public interface EmployeeService {

    //--------CREATE EMPLOYEE---------
    Employee saveEmployee(Employee employee);

    //--------RETRIEVE EMPLOYEE---------
    List<Employee> getEmployee();

    //--------UPDATE EMPLOYEE---------
    Employee updateEmployee(Employee employee, Long id);

    //--------DELETE EMPLOYEE---------
    void deleteEmployee(Long id);

    //--------GET EMPLOYEE BY ID---------
    Employee getEmployeeById(Long id);

}
