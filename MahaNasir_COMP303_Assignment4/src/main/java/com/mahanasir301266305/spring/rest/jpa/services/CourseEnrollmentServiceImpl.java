/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahanasir301266305.spring.rest.jpa.models.CourseEnrollment;
import com.mahanasir301266305.spring.rest.jpa.repository.CourseEnrollmentRepository;

@Service
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

    @Autowired
    private CourseEnrollmentRepository courseEnrollmentRepository;

    @Override
    public List<CourseEnrollment> getAllCourseEnrollments() {
        return courseEnrollmentRepository.findAll();
    }

    @Override
    public Optional<CourseEnrollment> getCourseEnrollmentById(int courseEnrollmentId) {
        return courseEnrollmentRepository.findById(courseEnrollmentId);
    }


    public CourseEnrollment addCourseEnrollment(CourseEnrollment courseEnrollment) {
       
        return courseEnrollmentRepository.save(courseEnrollment);
    }


    @Override
    public void deleteCourseEnrollmentById(int courseEnrollmentId) {
        courseEnrollmentRepository.deleteById(courseEnrollmentId);
    }

    @Override
    public void updateCourseEnrollment(int courseEnrollmentId, CourseEnrollment courseEnrollment) {
        courseEnrollmentRepository.findById(courseEnrollmentId).ifPresent(dbCourseEnrollment ->{
            dbCourseEnrollment.setCourseEnrollmentId(courseEnrollment.getCourseEnrollmentId());
            dbCourseEnrollment.setStudentId(courseEnrollment.getStudentId()); // Update studentId
            dbCourseEnrollment.setCourseId(courseEnrollment.getCourseId());
            dbCourseEnrollment.setTerm(courseEnrollment.getTerm());

            courseEnrollmentRepository.save(dbCourseEnrollment);
        });
    }
    
    @Override
    public void patchCourseEnrollment(int courseEnrollmentId, CourseEnrollment courseEnrollment) {
        courseEnrollmentRepository.findById(courseEnrollmentId).ifPresent(dbCourseEnrollment ->{
            if (courseEnrollment.getStudentId() != 0) {
                dbCourseEnrollment.setStudentId(courseEnrollment.getStudentId());
            }
            if (courseEnrollment.getCourseId() != 0) {
                dbCourseEnrollment.setCourseId(courseEnrollment.getCourseId());
            }
            if (courseEnrollment.getTerm() != null) {
                dbCourseEnrollment.setTerm(courseEnrollment.getTerm());
            }

            courseEnrollmentRepository.save(dbCourseEnrollment);
        });
    }

	@Override
	public CourseEnrollment save(CourseEnrollment courseEnrollment) {
        return courseEnrollmentRepository.save(courseEnrollment);

	}

}
