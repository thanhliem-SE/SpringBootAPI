package com.nguyenthanhliem.springbootapi.repository;

import com.nguyenthanhliem.springbootapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
