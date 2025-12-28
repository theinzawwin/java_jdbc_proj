package org.nov25.jdbc.model;

public class StudentCourseDTO {

    private String studentName;
    private String courseName;
    private double courseFee;

    public StudentCourseDTO(String studentName, String courseName, double courseFee) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
}
