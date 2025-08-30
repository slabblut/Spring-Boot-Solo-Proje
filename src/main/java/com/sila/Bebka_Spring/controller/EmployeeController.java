package com.sila.Bebka_Spring.controller;

import com.sila.Bebka_Spring.model.Employee;
import com.sila.Bebka_Spring.repository.EmployeeRepository;
import com.sila.Bebka_Spring.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/search/by-name")
    public List<Employee> searchByName(@RequestParam String name) {
        return employeeService.searchByName(name);
    }

}
