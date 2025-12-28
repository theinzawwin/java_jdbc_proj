package org.nov25.jdbc.dao;

import org.nov25.jdbc.model.Course;

import java.util.List;

public interface CourseDAO {

    void addCourse(Course course);
    List<Course> getAllCourses();
}
