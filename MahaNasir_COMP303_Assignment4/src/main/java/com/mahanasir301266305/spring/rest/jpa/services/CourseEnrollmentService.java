/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.services;

import java.util.List;
import java.util.Optional;

import com.mahanasir301266305.spring.rest.jpa.models.CourseEnrollment;

public interface CourseEnrollmentService {
    List<CourseEnrollment> getAllCourseEnrollments();
    Optional<CourseEnrollment> getCourseEnrollmentById(int courseEnrollmentId);
    CourseEnrollment addCourseEnrollment(CourseEnrollment courseEnrollment); // Define addCourseEnrollment method
    void deleteCourseEnrollmentById(int courseEnrollmentId);
    void updateCourseEnrollment(int courseEnrollmentId, CourseEnrollment courseEnrollment);
    void patchCourseEnrollment(int courseEnrollmentId, CourseEnrollment courseEnrollment);
    CourseEnrollment save(CourseEnrollment courseEnrollment);
}
