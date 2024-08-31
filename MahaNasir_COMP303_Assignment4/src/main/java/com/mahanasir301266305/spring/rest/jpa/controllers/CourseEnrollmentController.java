/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mahanasir301266305.spring.rest.jpa.models.CourseEnrollment;
import com.mahanasir301266305.spring.rest.jpa.services.CourseEnrollmentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseEnrollmentController {

    @Autowired
    private CourseEnrollmentService courseEnrollmentService;

    // Get all course enrollments
    @GetMapping("/courseenrollments")
    public List<CourseEnrollment> getAllCourseEnrollments() {
        return courseEnrollmentService.getAllCourseEnrollments();
    }

    // Get course enrollment by ID
    @GetMapping("/courseenrollments/{id}")
    public Optional<CourseEnrollment> getCourseEnrollmentById(@PathVariable("id") int courseEnrollmentId) {
        return courseEnrollmentService.getCourseEnrollmentById(courseEnrollmentId);
    }

    // Add a new course enrollment
    @PostMapping("/courseenrollments")
    public CourseEnrollment addCourseEnrollment(@RequestBody CourseEnrollment courseEnrollment) {
        return courseEnrollmentService.addCourseEnrollment(courseEnrollment);
    }

    // Delete a course enrollment by ID
    @DeleteMapping("/courseenrollments/{id}")
    public void deleteCourseEnrollmentById(@PathVariable("id") int courseEnrollmentId) {
        courseEnrollmentService.deleteCourseEnrollmentById(courseEnrollmentId);
    }

    // Update a course enrollment by ID
    @PutMapping("/courseenrollments/{id}")
    public void updateCourseEnrollment(@PathVariable("id") int courseEnrollmentId, @RequestBody CourseEnrollment courseEnrollment) {
        courseEnrollmentService.updateCourseEnrollment(courseEnrollmentId, courseEnrollment);
    }

    // Partially update a course enrollment by ID
    @PatchMapping("/courseenrollments/{id}")
    public void patchCourseEnrollment(@PathVariable("id") int courseEnrollmentId, @RequestBody CourseEnrollment courseEnrollment) {
        courseEnrollmentService.patchCourseEnrollment(courseEnrollmentId, courseEnrollment);
    }
    
}
