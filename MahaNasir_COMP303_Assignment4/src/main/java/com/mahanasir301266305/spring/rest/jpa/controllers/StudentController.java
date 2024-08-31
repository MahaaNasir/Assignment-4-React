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

import com.mahanasir301266305.spring.rest.jpa.models.Student;
import com.mahanasir301266305.spring.rest.jpa.services.StudentService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/students/{id}")
    public Optional<Student> getStudId(@PathVariable("id") int studentId) {
        return studentService.getStudentById(studentId);
    }

    // Add a new student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Delete an student by ID
    @DeleteMapping("/students/{id}")
    void deleteStudById(@PathVariable("id") int studentId) {
        studentService.deleteStudentById(studentId);
    }

    // Update an student by ID
    @PutMapping("/students/{id}")
    public void updateStud(@PathVariable("id") int studentId, @RequestBody Student student) {
        studentService.updateStudent(studentId, student);
    }
    // Partially update an student by ID
    @PatchMapping("/students/{id}")
    public void patchStud(@PathVariable("id") int studentId, @RequestBody Student student) {
        studentService.patchStudent(studentId, student);
    }
}
