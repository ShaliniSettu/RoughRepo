package com.java.prgmmongodb.Controller;

import com.java.prgmmongodb.Entity.Employee;
import com.java.prgmmongodb.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public Employee postStudent(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee putStudent(@PathVariable String id, @RequestBody Employee employee) {
        Employee employee1=new Employee();
        employee1.setId(id);
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setDoj(employee.getDoj());
        employee1.setSalary(employee.getSalary());
        return employeeService.save(employee1);
    }

    @DeleteMapping("")
    public String deleteStudent(@RequestParam(name = "id")String id) {
        return employeeService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Employee getEmployessEntity(@PathVariable String id) {
        Optional<Employee> optionalEmployeeEntity = employeeService.findById(id);
        return optionalEmployeeEntity.orElse(null);
    }

    @GetMapping("/")
    public List<Employee> getEmployeeEntity() {
        return employeeService.findAll();
    }
}
