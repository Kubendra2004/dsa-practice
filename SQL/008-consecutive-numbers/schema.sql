-- SQL Problem 008: Consecutive Numbers
-- Schema and Sample Data

-- Create Logs table
CREATE TABLE Logs (
    id INT PRIMARY KEY,
    num INT
);

-- Insert sample data
INSERT INTO Logs (id, num) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 1),
(6, 2),
(7, 2);

-- Verify data
SELECT * FROM Logs;