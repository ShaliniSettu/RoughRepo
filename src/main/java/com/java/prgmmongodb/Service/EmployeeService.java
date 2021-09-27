package com.java.prgmmongodb.Service;

import com.java.prgmmongodb.Entity.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee save(Employee employee);

    String deleteById(String id);

    Optional<Employee> findById(String id);

    List<Employee> findAll();
}
