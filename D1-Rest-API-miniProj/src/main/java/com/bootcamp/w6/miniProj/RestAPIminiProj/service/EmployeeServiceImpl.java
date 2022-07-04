package com.bootcamp.w6.miniProj.RestAPIminiProj.service;

import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import com.bootcamp.w6.miniProj.RestAPIminiProj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository empRepository;

    //-----------------------------------CREATE EMPLOYEE--------------------------------------
    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    //-----------------------------------RETRIEVE EMPLOYEE-------------------------------------
    @Override
    public List<Employee> getEmployee() {
        return empRepository.findAll();
    }

    //------------------------------------UPDATE EMPLOYEE--------------------------------------
    @Override
    public Employee updateEmployee(Employee employee, Long id){

        Optional<Employee> employeeOptional = empRepository.findById(id);
        if (employeeOptional.isPresent()) {
            employeeOptional.get().setName(employee.getName());
            employeeOptional.get().setLevel(employee.getLevel());
            employeeOptional.get().setEmail(employee.getEmail());
            employeeOptional.get().setCommunity(employee.getCommunity());
            employeeOptional.get().setStatus(employee.getStatus());
          return empRepository.save(employeeOptional.get());
        }
    return null;
    }

    //--------------------------------------DELETE EMPLOYEE-----------------------------------
    @Override
    public void deleteEmployee(Long personId) {
        Optional<Employee>  employeeOptional = empRepository.findById(personId);
        if (employeeOptional.isPresent()) {

            empRepository.delete(employeeOptional.get());
        }
    }

    //--------------------------------------GET EMPLOYEE BY ID----------------------------------
    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee>  employeeOptional = empRepository.findById(id);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();
        }
        return null;
    }
}
