package org.nov25.trans.dao;

import org.nov25.jdbc.util.DBConnection;
import org.nov25.trans.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void insert(Employee emp, Connection con) throws SQLException {
        // Step 3 & 4: Create Statement and Execute [cite: 70, 71]
        String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) { // [cite: 165]
            pstmt.setInt(1, emp.getId()); // [cite: 178]
            pstmt.setString(2, emp.getName()); // [cite: 180]
            pstmt.setDouble(3, emp.getSalary()); // [cite: 185]
            pstmt.executeUpdate(); // [cite: 186]
        }
    }
}
