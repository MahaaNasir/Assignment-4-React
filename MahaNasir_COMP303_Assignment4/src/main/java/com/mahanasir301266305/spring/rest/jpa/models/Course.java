/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
    
    @Id
    @Column(name = "courseid")
    private int courseId;
    
    @Column(name = "coursecode", nullable = false)
    private String courseCode;
    
    @Column(name = "coursetitle", nullable = false)
    private String courseTitle;
    
    @Column(name = "coursehours", nullable = false)
    private int courseHours;
    
    @Column(name = "delivercompus", nullable = false)
    private String deliverCompus;
    
    @Column(name = "delivermethod", nullable = false)
    private String deliverMethod;
    
    @Column(name = "createdat", nullable = false)
    private String createdAt;
    
    @Column(name = "professor", nullable = false)
    private String professor;
    
   
    
	public Course() {
		super();
	}
	
	public Course(int courseId, String courseCode, String courseTitle, int courseHours, String deliverCompus, String deliverMethod, String createdAt, String professor) {
		super();
		this.courseId = courseId;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.courseHours = courseHours;
		this.deliverCompus = deliverCompus;
		this.deliverMethod = deliverMethod;
		this.createdAt = createdAt;
		this.professor = professor;
		
	}


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    public String getDeliverCompus() {
        return deliverCompus;
    }

    public void setDeliverCompus(String deliverCompus) {
        this.deliverCompus = deliverCompus;
    }

    public String getDeliverMethod() {
        return deliverMethod;
    }

    public void setDeliverMethod(String deliverMethod) {
        this.deliverMethod = deliverMethod;
    }
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}

