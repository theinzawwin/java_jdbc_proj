package org.nov25.jdbc.dao;

import org.nov25.jdbc.model.Enrollment;
import org.nov25.jdbc.model.EnrollmentSummary;
import org.nov25.jdbc.model.StudentCourseDTO;

import java.util.List;

public interface EnrollmentDAO {

    void enrollStudent(Enrollment enrollment);
    List<StudentCourseDTO> getStudentCourseDetails();

    EnrollmentSummary getEnrollmentSummary();
}
