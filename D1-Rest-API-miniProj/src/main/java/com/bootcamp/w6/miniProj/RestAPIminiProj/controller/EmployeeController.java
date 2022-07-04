package com.bootcamp.w6.miniProj.RestAPIminiProj.controller;

import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import com.bootcamp.w6.miniProj.RestAPIminiProj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

//------------------CREATE/ADD EMPLOYEE------------------------
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return empService.saveEmployee(employee);
    }

//------------------RETRIEVE ALL EMPLOYEE---------------------
    @GetMapping
    public List<Employee> getAllEmployees() {
        return empService.getEmployee();
    }

//------------------UPDATE EMPLOYEE BY ID---------------------------
    @PutMapping("/{id}")
    public Employee updatedEmployeeById(@PathVariable Long id, @RequestBody Employee employee) {
        return empService.updateEmployee(employee, id);
    }
//------------------DELETE EMPLOYEE----------------------------
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        empService.deleteEmployee(id);
    }

//------------------CHECK EMPLOYEE BY ID---------------------------
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return empService.getEmployeeById(id);
    }


}
