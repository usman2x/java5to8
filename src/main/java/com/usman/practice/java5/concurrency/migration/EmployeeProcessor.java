package com.usman.practice.java5.concurrency.migration;

import java.util.concurrent.Callable;

public class EmployeeProcessor implements Callable<Integer> {

    private final Employee employee;
    private final EmployeeDao employeeDao;

    public EmployeeProcessor(Employee employee, EmployeeDao employeeDao) {
        this.employee = employee;
        this.employeeDao = employeeDao;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Executing for employee " + employee.getId());
        Thread.sleep(1000);
        int row = employeeDao.saveEmployee(employee);
        System.out.println(String.format("Employee %s migrated to DB %d", employee.getId(), row));
        return row;
    }
}
