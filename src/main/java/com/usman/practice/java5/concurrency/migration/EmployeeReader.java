package com.usman.practice.java5.concurrency.migration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeReader {

    private String filePath;

    public EmployeeReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Employee> readEmployeeFile() throws IOException {
        return readEmployeeFile(this.filePath);
    }

    public List<Employee> readEmployeeFile(String filepath) throws IOException {
        Path path = Paths.get(filepath);
        System.out.println(path.toAbsolutePath());
        return Files.lines(Paths.get(filepath)).map(emp -> {
            String[] employeeTokens = emp.split(",");
            Employee employee = new Employee();
            employee.setId(employeeTokens[0]);
            employee.setName(employeeTokens[1]);
            employee.setDepartment(employeeTokens[2]);
            employee.setDesignation(employeeTokens[3]);
            return employee;
        }).collect(Collectors.toList());
    }
}