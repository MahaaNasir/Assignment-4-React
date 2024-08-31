/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mahanasir301266305.spring.rest.jpa.models.Student;
import com.mahanasir301266305.spring.rest.jpa.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    
    // delete the enrollment as well if delete student
    @Override
    public void deleteStudentById(int studentId) {
        Optional<Student> studentOptional = studentRepository.findById(studentId);
        
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();       
            studentRepository.delete(student);
        } else {

        }
    }
    
    @Override
    public void updateStudent(int studentId, Student student) {
        studentRepository.findById(studentId).ifPresent(dbStud -> {
            dbStud.setStudentId(student.getStudentId());
            dbStud.setFirstName(student.getFirstName());
            dbStud.setLastName(student.getLastName());
            dbStud.setDob(student.getDob());
            dbStud.setGender(student.getGender());
            dbStud.setCountryWasBorn(student.getCountryWasBorn());
            dbStud.setAddress(student.getAddress());
            dbStud.setPhone(student.getPhone());
            dbStud.setEmail(student.getEmail());

            studentRepository.save(dbStud);
        });
    }

    @Override
    public void patchStudent(int studentId, Student student) {
        studentRepository.findById(studentId).ifPresent(dbStud -> {
            if (student.getFirstName() != null) {
                dbStud.setFirstName(student.getFirstName());
            }
            if (student.getLastName() != null) {
                dbStud.setLastName(student.getLastName());
            }
            if (student.getDob() != null) {
                dbStud.setDob(student.getDob());
            }
            if (student.getGender() != null) {
                dbStud.setGender(student.getGender());
            }
            if (student.getCountryWasBorn() != null) {
                dbStud.setCountryWasBorn(student.getCountryWasBorn());
            }
            if (student.getAddress() != null) {
                dbStud.setAddress(student.getAddress());
            }
            if (student.getPhone() != null) {
                dbStud.setPhone(student.getPhone());
            }
            if (student.getEmail() != null) {
                dbStud.setEmail(student.getEmail());
            }

            studentRepository.save(dbStud);
        });
    }

}
