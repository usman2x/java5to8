package com.usman.practice.java5.concurrency.migration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private DBConnection() {
    }

    public static Connection getConnection() {
        return DBConnectionHolder.getConnection();
    }

    private static class DBConnectionHolder {
        private static Connection getConnection() {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }
}
