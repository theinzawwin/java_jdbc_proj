package org.nov25.jdbc.dao;

import org.nov25.jdbc.model.Enrollment;
import org.nov25.jdbc.model.StudentCourseDTO;
import org.nov25.jdbc.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentDAOImpl implements EnrollmentDAO {

    @Override
    public void enrollStudent(Enrollment enrollment) {
        String sql =
                "INSERT INTO enrollment(student_id, course_id, enroll_date) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, enrollment.getStudentId());
            ps.setInt(2, enrollment.getCourseId());
            ps.setDate(3, Date.valueOf(enrollment.getEnrollDate()));

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // JOIN QUERY
    @Override
    public List<StudentCourseDTO> getStudentCourseDetails() {

        List<StudentCourseDTO> list = new ArrayList<>();

        String sql = """
            SELECT s.name AS student_name,
                   c.name AS course_name,
                   c.fee  AS course_fee
            FROM student s
            JOIN enrollment e ON s.id = e.student_id
            JOIN course c ON e.course_id = c.id
            """;

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new StudentCourseDTO(
                        rs.getString("student_name"),
                        rs.getString("course_name"),
                        rs.getDouble("course_fee")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}