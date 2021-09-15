package com.nguyenthanhliem.springbootapi.repository;

import com.nguyenthanhliem.springbootapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
