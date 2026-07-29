-- SQL Problem 005: Employee Bonus
-- Schema and Sample Data

-- Create Employee table
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    managerId INT
);

-- Create Bonus table
CREATE TABLE Bonus (
    id INT PRIMARY KEY,
    amount INT
);

-- Insert sample employee data
INSERT INTO Employee (id, name, managerId) VALUES
(1, 'John', NULL),
(2, 'Dan', 1),
(3, 'Mike', 1),
(4, 'Ralph', NULL),
(5, 'Tom', 1);

-- Insert sample bonus data
INSERT INTO Bonus (id, amount) VALUES
(2, 500),
(4, 2000);

-- Verify data
SELECT * FROM Employee;
SELECT * FROM Bonus;