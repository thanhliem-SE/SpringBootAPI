package com.nguyenthanhliem.springbootapi.controller;

import com.nguyenthanhliem.springbootapi.entity.Employee;
import com.nguyenthanhliem.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return employeeService.getEmployee(id);
    }

    @PostMapping
    public void saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
    }
}
