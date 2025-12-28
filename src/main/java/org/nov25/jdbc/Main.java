package org.nov25.jdbc;

import org.nov25.jdbc.dao.EnrollmentDAO;
import org.nov25.jdbc.dao.EnrollmentDAOImpl;
import org.nov25.jdbc.dao.StudentDAO;
import org.nov25.jdbc.dao.StudentDAOImpl;
import org.nov25.jdbc.model.Student;

public class Main {
    public static void main(String[] args) {

       /* StudentDAO dao = new StudentDAOImpl();

        // CREATE
        dao.addStudent(new Student("Moe Moe",
                "moemoe@gmail.com", 22));

        // READ ALL
        dao.getAllStudents().forEach(s ->
                System.out.println(
                        s.getId() + " " + s.getName() + " " + s.getEmail()
                )
        );

        // READ ONE
        Student s = dao.getStudentById(1);
        System.out.println("Found: " + s.getName());

        // UPDATE
        s.setAge(22);
        dao.updateStudent(s);

        // DELETE
        dao.deleteStudent(2);
        */
        EnrollmentDAO enrollmentDAO = new EnrollmentDAOImpl();

        enrollmentDAO.getStudentCourseDetails().forEach(dto ->
                System.out.println(
                        dto.getStudentName() + " enrolled in " +
                                dto.getCourseName() + " (Fee: " + dto.getCourseFee() + ")"
                )
        );


    }

}