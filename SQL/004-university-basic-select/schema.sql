-- SQL Problem 004: University Database - Basic SELECT/WHERE/ORDER BY
-- Schema and Sample Data

-- Create Students table
CREATE TABLE Students (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT,
    department VARCHAR(100)
);

-- Create Courses table
CREATE TABLE Courses (
    id INT PRIMARY KEY,
    course_name VARCHAR(255) NOT NULL,
    credits INT
);

-- Create Enrollments table
CREATE TABLE Enrollments (
    id INT PRIMARY KEY,
    student_id INT NOT NULL,
    course_id INT NOT NULL,
    grade VARCHAR(2),
    FOREIGN KEY (student_id) REFERENCES Students(id),
    FOREIGN KEY (course_id) REFERENCES Courses(id)
);

-- Insert sample student data
INSERT INTO Students (id, name, age, department) VALUES
(1, 'Alice', 20, 'Computer Science'),
(2, 'Bob', 22, 'Mathematics'),
(3, 'Charlie', 21, 'Computer Science'),
(4, 'Diana', 23, 'Physics'),
(5, 'Eve', 20, 'Mathematics');

-- Insert sample course data
INSERT INTO Courses (id, course_name, credits) VALUES
(101, 'Intro to Programming', 3),
(102, 'Data Structures', 4),
(103, 'Calculus I', 4),
(104, 'Quantum Mechanics', 3);

-- Insert sample enrollment data
INSERT INTO Enrollments (id, student_id, course_id, grade) VALUES
(1, 1, 101, 'A'),
(2, 1, 102, 'B'),
(3, 2, 103, 'A'),
(4, 3, 101, 'B'),
(5, 3, 104, 'A'),
(6, 4, 104, 'C'),
(7, 5, 103, 'B');

-- Verify data
SELECT * FROM Students;
SELECT * FROM Courses;
SELECT * FROM Enrollments;