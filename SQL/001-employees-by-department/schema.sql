-- SQL Problem 001: Employees by Department
-- Schema and Sample Data

-- Create departments table
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL
);

-- Create employees table
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100) NOT NULL,
    dept_id INT NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    hire_date DATE NOT NULL,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);

-- Insert sample data into departments
INSERT INTO departments (dept_id, dept_name, location) VALUES
(1, 'Sales', 'New York'),
(2, 'IT', 'San Francisco'),
(3, 'HR', 'Chicago'),
(4, 'Finance', 'Boston'),
(5, 'Marketing', 'Seattle');

-- Insert sample data into employees
INSERT INTO employees (emp_id, emp_name, dept_id, salary, hire_date) VALUES
(1, 'Alice', 1, 50000.00, '2020-01-15'),
(2, 'Bob', 1, 55000.00, '2019-03-20'),
(3, 'Charlie', 2, 75000.00, '2018-06-01'),
(4, 'David', 2, 80000.00, '2021-02-10'),
(5, 'Eve', 2, 70000.00, '2020-11-05'),
(6, 'Frank', 4, 65000.00, '2019-09-12'),
(7, 'Grace', 4, 68000.00, '2020-07-08');

-- Verify data
SELECT * FROM departments;
SELECT * FROM employees;
