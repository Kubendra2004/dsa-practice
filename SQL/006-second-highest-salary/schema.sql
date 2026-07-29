-- SQL Problem 006: Second Highest Salary
-- Schema and Sample Data

-- Create Employee table
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    salary INT
);

-- Insert sample data
INSERT INTO Employee (id, name, salary) VALUES
(1, 'Joe', 70000),
(2, 'Henry', 80000),
(3, 'Sam', 60000),
(4, 'Max', 90000),
(5, 'Ann', 70000);

-- Verify data
SELECT * FROM Employee;