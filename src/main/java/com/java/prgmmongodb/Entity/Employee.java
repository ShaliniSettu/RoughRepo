package com.java.prgmmongodb.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Employee")
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String doj;
    private String salary;
}