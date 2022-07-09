package com.bootcamp.w6.miniProj.RestAPIminiProj.service;

import com.bootcamp.w6.miniProj.RestAPIminiProj.exception.RecordNotFoundException;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import com.bootcamp.w6.miniProj.RestAPIminiProj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepository;

    //++++++++++++++++++++++++++++++++++++++++CREATE EMPLOYEE++++++++++++++++++++++++++++++++++++++++++
    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    //+++++++++++++++++++++++++++++++++++++++RETRIEVE EMPLOYEES++++++++++++++++++++++++++++++++++++++++
    @Override
    public Page<Employee> getEmployee(Pageable empPageable) {
        return empRepository.findAll(empPageable);
    }

    //+++++++++++++++++++++++++++++++++++++++UPDATE EMPLOYEE++++++++++++++++++++++++++++++++++++++++++++
    @Override
    public Employee updateEmployee(Employee employee, Long id) throws RecordNotFoundException {
        return  empRepository.findById(id).map(emp -> {
            emp.setName(employee.getName());
            emp.setLevel(employee.getLevel());
            emp.setEmail(employee.getEmail());
            emp.setCommunity(employee.getCommunity());
            emp.setStatus(employee.getStatus());
            emp.setUpdatedDate(LocalDateTime.now());
            return empRepository.save(emp);
        }).orElseThrow(() ->new RecordNotFoundException("Employee not Found"));
    }
    //+++++++++++++++++++++++++++++++++++++++-DELETE EMPLOYEE-++++++++++++++++++++++++++++++++++++++++++
    @Override
    public String deleteEmployee(Long personId) throws RecordNotFoundException {

        Optional<Employee> employeeOptional = empRepository.findById(personId);
        if (employeeOptional.isPresent()) {
            empRepository.delete(employeeOptional.get());
            return "User with ID" + personId + " has been deleted";
        } else throw new RecordNotFoundException("Employee not found!!" + personId);
    }

    //++++++++++++++++++++++++++++++++++++++GET EMPLOYEE BY ID++++++++++++++++++++++++++++++++++++++++++
    @Override
    public Employee getEmployeeById(Long id) throws RecordNotFoundException {
        return empRepository.findById(id).orElseThrow(RecordNotFoundException::new);
    }

    //+++++++++++++++++++++++++++++++++ SEARCH EMPLOYEE BY NAME +++++++++++++++++++++++++++++++++++++++
    public Page<Employee> fetchFilteredEmployeeDataAsList(String nameFilter, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return empRepository.findByFirstNameLike(nameFilter,pageable);
    }

}