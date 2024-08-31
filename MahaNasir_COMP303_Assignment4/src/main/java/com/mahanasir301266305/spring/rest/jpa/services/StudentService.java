/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.services;

import java.util.List;
import java.util.Optional;

import com.mahanasir301266305.spring.rest.jpa.models.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(int studentId);
    Student addStudent(Student student);
    void deleteStudentById(int studentId);
    void updateStudent(int studentId, Student student);
    void patchStudent(int studentId, Student student);

}
