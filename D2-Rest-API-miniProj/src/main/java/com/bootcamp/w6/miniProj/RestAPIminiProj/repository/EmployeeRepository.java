package com.bootcamp.w6.miniProj.RestAPIminiProj.repository;

import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
