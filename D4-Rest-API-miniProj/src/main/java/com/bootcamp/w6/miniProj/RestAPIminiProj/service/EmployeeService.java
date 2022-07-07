package com.bootcamp.w6.miniProj.RestAPIminiProj.service;

import com.bootcamp.w6.miniProj.RestAPIminiProj.exception.RecordNotFoundException;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    //--------CREATE EMPLOYEE---------
    Employee saveEmployee(Employee employee);

    //--------RETRIEVE EMPLOYEE---------
    Page<Employee> getEmployee(Pageable empPageable);

    //--------UPDATE EMPLOYEE---------
    Employee updateEmployee(Employee employee, Long id) throws RecordNotFoundException;

    //--------DELETE EMPLOYEE---------
    String deleteEmployee(Long id) throws RecordNotFoundException;

    //--------GET EMPLOYEE BY ID---------
    Employee getEmployeeById(Long id) throws RecordNotFoundException;

}
