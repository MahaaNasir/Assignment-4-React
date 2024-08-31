/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="student")
public class Student {
    
    @Id
    @Column(name="studentid")
    private int studentId;
    
    @Column(name="Firstname")
    private String firstName;
    
    @Column(name="Lastname")
    private String lastName;
    
    @Column(name="dob")
    private Date dob;
    
    @Column(name="gender")
    private String gender;
    
    @Column(name="countrywasborn")
    private String countryWasBorn;
    
    @Column(name="address")
    private String address;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="email")
    private String email;
    
    
    public Student() {
        super();
    }
    
    public Student(int studentId, String firstName, String lastName, Date dob, String gender, String countryWasBorn, String address, String phone, String email ) {
        super();
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.countryWasBorn = countryWasBorn;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getCountryWasBorn() {
        return countryWasBorn;
    }
    
    public void setCountryWasBorn(String countryWasBorn) {
        this.countryWasBorn = countryWasBorn;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
