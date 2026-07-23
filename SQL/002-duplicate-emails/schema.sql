-- SQL Problem 002: Find Duplicate Emails
-- Schema and Sample Data

-- Create Person table
CREATE TABLE Person (
    id INT PRIMARY KEY,
    email VARCHAR(255) NOT NULL
);

-- Insert sample data
INSERT INTO Person (id, email) VALUES
(1, 'john@example.com'),
(2, 'jane@example.com'),
(3, 'john@example.com'),
(4, 'bob@example.com'),
(5, 'jane@example.com'),
(6, 'jane@example.com');

-- Verify data
SELECT * FROM Person;
