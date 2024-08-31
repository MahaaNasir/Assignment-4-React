/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.services;

import java.util.List;
import java.util.Optional;

import com.mahanasir301266305.spring.rest.jpa.models.Course;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(int courseId);
    Course addCourse(Course course);
    void deleteCourseById(int courseId);
    void updateCourse(int courseId, Course course);
    void patchCourse(int courseId, Course course);

}