/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahanasir301266305.spring.rest.jpa.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
