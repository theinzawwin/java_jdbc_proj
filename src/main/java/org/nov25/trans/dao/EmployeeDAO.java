package org.nov25.trans.dao;

import org.nov25.trans.model.Employee;

import java.sql.Connection;
import java.sql.SQLException;

public interface EmployeeDAO {

    void insert(Employee emp, Connection con) throws SQLException;
}
