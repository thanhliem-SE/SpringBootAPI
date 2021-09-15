package com.nguyenthanhliem.springbootapi.service;

import com.nguyenthanhliem.springbootapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee getEmployee(int employeeID);
    public void saveEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int employeeID);
}
