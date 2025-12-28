package org.nov25.jdbc.dao;

import org.nov25.jdbc.model.Student;

import java.util.List;

public interface StudentDAO {

    void addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    void updateStudent(Student student);

    void deleteStudent(int id);

    List<Student> getStudentListByCourse(int courseId);
}