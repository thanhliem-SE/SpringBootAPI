package com.nguyenthanhliem.springbootapi.service;

import com.nguyenthanhliem.springbootapi.entity.Employee;
import com.nguyenthanhliem.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int employeeID) {
        return employeeRepository.getById(employeeID);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeID) {
        employeeRepository.deleteById(employeeID);
    }
}
