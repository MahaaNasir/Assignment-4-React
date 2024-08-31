/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mahanasir301266305.spring.rest.jpa.models.Course;
import com.mahanasir301266305.spring.rest.jpa.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;
    
    
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(int courseId) {
        return courseRepository.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourseById(int courseId) {
    Optional<Course> courseOptional = courseRepository.findById(courseId);
        
        if (courseOptional.isPresent()) {
        	Course course = courseOptional.get();       
            courseRepository.delete(course);
        } else {

        }    }
    
    @Override
    public void updateCourse(int courseId, Course course) {
        courseRepository.findById(courseId).ifPresent(dbCourse -> {
            dbCourse.setCourseId(course.getCourseId());
            dbCourse.setCourseCode(course.getCourseCode());
            dbCourse.setCourseTitle(course.getCourseTitle());
            dbCourse.setCourseHours(course.getCourseHours());
            dbCourse.setDeliverCompus(course.getDeliverCompus());
            dbCourse.setDeliverMethod(course.getDeliverMethod());
            dbCourse.setCreatedAt(course.getCreatedAt());
            dbCourse.setProfessor(course.getProfessor());

            courseRepository.save(dbCourse);
        });
    }

    @Override
    public void patchCourse(int courseId, Course course) {
        courseRepository.findById(courseId).ifPresent(dbCourse -> {
            if (course.getCourseCode() != null) {
                dbCourse.setCourseCode(course.getCourseCode());
            }
            if (course.getCourseTitle() != null) {
                dbCourse.setCourseTitle(course.getCourseTitle());
            }
            if (course.getCourseHours() != 0) {
                dbCourse.setCourseHours(course.getCourseHours());
            }
            if (course.getDeliverCompus() != null) {
                dbCourse.setDeliverCompus(course.getDeliverCompus());
            }
            if (course.getDeliverMethod() != null) {
                dbCourse.setDeliverMethod(course.getDeliverMethod());
            }
            if (course.getCreatedAt() != null) {
                dbCourse.setCreatedAt(course.getCreatedAt());
            }
            if (course.getProfessor() != null) {
                dbCourse.setProfessor(course.getProfessor());
            }

            courseRepository.save(dbCourse);
        });
    }

}
