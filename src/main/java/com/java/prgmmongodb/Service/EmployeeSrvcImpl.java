package com.java.prgmmongodb.Service;

import com.java.prgmmongodb.Entity.Employee;
import com.java.prgmmongodb.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSrvcImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public String deleteById(String id) {
        employeeRepository.deleteById(id);
        return  id+" Deleted";
    }

    @Override
    public Optional<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        System.out.println("printing employees " + employeeRepository.findAll());
        return employeeRepository.findAll();
    }
}
