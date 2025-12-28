package org.nov25.trans.service;

import org.nov25.trans.util.DBConnection;
import org.nov25.trans.dao.EmployeeDAO;
import org.nov25.trans.dao.EmployeeDAOImpl;
import org.nov25.trans.model.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmployeeTransactionService implements Runnable {

    private List<Employee> employeeList;
    private EmployeeDAO dao = new EmployeeDAOImpl();

    public EmployeeTransactionService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        Connection con = DBConnection.getConnection();
        if (con == null) return;

        try {
            // Start Transaction: Disable AutoCommit [cite: 128, 152]
            con.setAutoCommit(false);

            System.out.println("Thread " + Thread.currentThread().getId() + " starting transaction...");

            for (Employee emp : employeeList) {
                dao.insert(emp, con);
            }

            // Commit all changes if successful [cite: 129, 156]
            con.commit();
            System.out.println("Transaction Committed successfully!");

        } catch (SQLException e) {
            System.err.println("Error occurred, rolling back changes...");
            try {
                // Rollback if any part fails [cite: 130, 144]
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                // Step 5: Close connection [cite: 107, 131]
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
