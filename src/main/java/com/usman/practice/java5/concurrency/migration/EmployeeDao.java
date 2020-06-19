package com.usman.practice.java5.concurrency.migration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
    public int saveEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection()
                    .prepareStatement("insert into employee (employee_id, name, department, designation) values(?,?,?,?)");
            preparedStatement.setString(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getDepartment());
            preparedStatement.setString(4, employee.getDesignation());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
