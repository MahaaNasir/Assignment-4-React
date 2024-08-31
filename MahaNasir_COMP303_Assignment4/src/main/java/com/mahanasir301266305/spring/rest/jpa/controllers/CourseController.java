/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahanasir301266305.spring.rest.jpa.models.Course;
import com.mahanasir301266305.spring.rest.jpa.services.CourseService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get all courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get course by ID
    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable("id") int courseId) {
        return courseService.getCourseById(courseId);
    }

    // Add a new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Delete a course by ID
    @DeleteMapping("/courses/{id}")
     void deleteCourseById(@PathVariable("id") int courseId) {
        courseService.deleteCourseById(courseId);
    }

    
   
    // Update a course by ID
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable("id") int courseId, @RequestBody Course course) {
        courseService.updateCourse(courseId, course);
    }


    // Partially update a course by ID
    @PatchMapping("/courses/{id}")
    public void patchCourse(@PathVariable("id") int courseId, @RequestBody Course course) {
        courseService.patchCourse(courseId, course);
    }
}
