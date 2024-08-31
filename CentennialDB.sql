CREATE DATABASE CentennialDB;

USE centennialDB;
drop table student;
drop table Course;
drop table CourseEnrollment;
-- Table: Student
CREATE TABLE Student (
    StudentId INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    DOB DATE NOT NULL,
    Gender VARCHAR(10) NOT NULL,
    CountryWasBorn VARCHAR(50) NOT NULL,
    Address VARCHAR(255) NOT NULL,
    Phone VARCHAR(20) NOT NULL,
    Email VARCHAR(100) NOT NULL
);

-- Table: Course
CREATE TABLE Course (
    CourseId INT PRIMARY KEY AUTO_INCREMENT,
    CourseCode VARCHAR(20) NOT NULL,
    CourseTitle VARCHAR(100) NOT NULL,
    CourseHours INT NOT NULL,
    DeliverCompus VARCHAR(50) NOT NULL,
    DeliverMethod VARCHAR(50) NOT NULL,
    CreatedAt VARCHAR(100) NOT NULL,
    Professor VARCHAR(100) NOT NULL
);

-- Table: CourseEnrollment
CREATE TABLE CourseEnrollment (
    CourseEnrollmentId INT PRIMARY KEY AUTO_INCREMENT,
    StudentId INT ,
    CourseId INT ,
    Term VARCHAR(50) 
   
);

-- Samples

INSERT INTO Student (FirstName, LastName, DOB, Gender, CountryWasBorn, Address, Phone, Email)
VALUES ('John', 'Doe', '1990-05-15', 'Male', 'USA', '123 Main St, Anytown', '123-456-7890', 'john.doe@example.com');
INSERT INTO Student (FirstName, LastName, DOB, Gender, CountryWasBorn, Address, Phone, Email)
VALUES ('Jane', 'Smith', '1992-08-20', 'Female', 'Canada', '456 Maple Ave, Othertown', '987-654-3210', 'jane.smith@example.com');

INSERT INTO Course (CourseCode, CourseTitle, CourseHours, DeliverCompus, DeliverMethod, CreatedAt, Professor)
VALUES ('CS101', 'Introduction to Computer Science', 3, 'Main Campus', 'onsite', '8 March 2021',  'Dr. Smith');
INSERT INTO Course (CourseCode, CourseTitle, CourseHours, DeliverCompus, DeliverMethod, CreatedAt, Professor)
VALUES ('ENG202', 'Advanced English Literature', 4, 'Online', 'online', '5 September 2020','Prof. Johnson');

INSERT INTO CourseEnrollment (StudentId, CourseId, Term)
VALUES (1, 1, 'Fall 2024');
INSERT INTO CourseEnrollment (StudentId, CourseId, Term)
VALUES (2, 2, 'Spring 2025');


-- Show data

select * from Student;
select * from Course;
select * from CourseEnrollment;
