package com.usman.practice.java5.concurrency.migration;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MigrationRunner {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        EmployeeReader employeeReader = new EmployeeReader("src/main/resources/employee.txt");
        EmployeeDao employeeDao = new EmployeeDao();
        try {
            List<Employee> employees = employeeReader.readEmployeeFile();
            employees.forEach(employee -> {
                executorService.submit(new EmployeeProcessor(employee, employeeDao));
            });
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                DBConnection.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
