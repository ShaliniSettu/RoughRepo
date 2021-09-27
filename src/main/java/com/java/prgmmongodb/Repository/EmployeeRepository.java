package com.java.prgmmongodb.Repository;

import com.java.prgmmongodb.Entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository("EmployeeRepository")
public interface EmployeeRepository extends MongoRepository<Employee, String>{
}
