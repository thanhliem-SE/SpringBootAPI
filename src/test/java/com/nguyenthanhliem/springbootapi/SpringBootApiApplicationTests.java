package com.nguyenthanhliem.springbootapi;

import com.nguyenthanhliem.springbootapi.entity.Employee;
import com.nguyenthanhliem.springbootapi.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootApiApplicationTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
        Employee employee = new Employee();
        employee.setEmployeeName("Nguyen Thanh Liem");
        employee.setEmployeeAge(21);
        employeeService.saveEmployee(employee);
        System.out.println(employeeService.getEmployees());
    }

}
