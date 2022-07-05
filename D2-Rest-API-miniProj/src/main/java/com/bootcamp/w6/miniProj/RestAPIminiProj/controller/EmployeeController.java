package com.bootcamp.w6.miniProj.RestAPIminiProj.controller;

import com.bootcamp.w6.miniProj.RestAPIminiProj.exception.RecordNotFoundException;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import com.bootcamp.w6.miniProj.RestAPIminiProj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

//------------------CREATE/ADD EMPLOYEE------------------------
    @PostMapping
    ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(empService.saveEmployee(employee), HttpStatus.CREATED);
    }

//------------------RETRIEVE ALL EMPLOYEE---------------------
    @GetMapping
    ResponseEntity<Page<Employee>> getAllEmployees(Pageable empPageable) {
        return new ResponseEntity<>(empService.getEmployee(empPageable), HttpStatus.OK);
    }

//------------------UPDATE EMPLOYEE BY ID---------------------------
    @PutMapping("/{id}")
    ResponseEntity<Employee> updatedEmployeeById(@PathVariable Long id, @RequestBody Employee employee) throws RecordNotFoundException {
        return new ResponseEntity<>(empService.updateEmployee(employee, id), HttpStatus.ACCEPTED);
    }
//------------------DELETE EMPLOYEE----------------------------
    @DeleteMapping("/{id}")
    ResponseEntity <Void> deleteEmployee(@PathVariable Long id) throws RecordNotFoundException {
        empService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

//------------------CHECK EMPLOYEE BY ID---------------------------
    @GetMapping("/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) throws RecordNotFoundException {
        return new ResponseEntity<>(empService.getEmployeeById(id), HttpStatus.OK);
    }
}
