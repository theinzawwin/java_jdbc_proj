package org.nov25.library.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static final String URL =
            "jdbc:mysql://localhost:3306/nov_25_library";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
