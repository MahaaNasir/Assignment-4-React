/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Courseenrollment")
public class CourseEnrollment {
    
    @Id
    @Column(name = "Courseenrollmentid")
    private int courseEnrollmentId;
    
    @Column(name = "studentid") // Adjust the column name as per your database schema
    private int studentId;
    
    @Column(name = "courseid") // Adjust the column name as per your database schema
    private int courseId;
    
    @Column(name = "term")
    private String term;
    
    public CourseEnrollment() {
        super();
    }
    
    public CourseEnrollment(int courseEnrollmentId, int studentId, int courseId, String term) {
        super();
        this.courseEnrollmentId = courseEnrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.term = term;
    }

    public int getCourseEnrollmentId() {
        return courseEnrollmentId;
    }

    public void setCourseEnrollmentId(int courseEnrollmentId) {
        this.courseEnrollmentId = courseEnrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
