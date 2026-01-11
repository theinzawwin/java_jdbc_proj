package org.nov25.trans;

import org.nov25.trans.model.Employee;
import org.nov25.trans.service.EmployeeTransactionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransMain {

    public static void main(String[] args){
        // Using Collections to store initial data
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Alice", 60000));
        list.add(new Employee(102, "Bob", 30000));
        list.add(new Employee(103, "Charlie", 75000));

        // Using Stream API to filter high-salary employees
        List<Employee> highEarners = list.stream()
                .filter(emp -> emp.getSalary() > 20000)
                .collect(Collectors.toList());

        // Using Multi-threading to run the database transaction
        Thread transactionThread = new Thread(new EmployeeTransactionService(highEarners));
        transactionThread.start();
    }
}
