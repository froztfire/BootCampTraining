package com.bootcamp.w6.miniProj.RestAPIminiProj.repository;

import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    String FILTER_EMPLOYEE_ON_NAME_QUERY = "select b from Employee b where UPPER(b.name) like CONCAT('%',UPPER(?1),'%')";

    @Query(FILTER_EMPLOYEE_ON_NAME_QUERY)
    Page<Employee> findByFirstNameLike(String nameFilter, Pageable pageable);

}
