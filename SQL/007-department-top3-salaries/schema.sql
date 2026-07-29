-- SQL Problem 007: Department Top 3 Salaries
-- Schema and Sample Data

-- Create Employee table
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    salary INT,
    departmentId INT
);

-- Create Department table
CREATE TABLE Department (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Insert sample department data
INSERT INTO Department (id, name) VALUES
(1, 'IT'),
(2, 'Sales');

-- Insert sample employee data
INSERT INTO Employee (id, name, salary, departmentId) VALUES
(1, 'Joe', 70000, 1),
(2, 'Henry', 80000, 2),
(3, 'Sam', 60000, 2),
(4, 'Max', 90000, 1),
(5, 'Janet', 69000, 1),
(6, 'Randy', 85000, 1),
(7, 'Will', 70000, 2);

-- Verify data
SELECT * FROM Employee;
SELECT * FROM Department;