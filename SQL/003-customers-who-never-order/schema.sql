-- SQL Problem 003: Customers Who Never Order
-- Schema and Sample Data

-- Create Customers table
CREATE TABLE Customers (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create Orders table
CREATE TABLE Orders (
    id INT PRIMARY KEY,
    customerId INT NOT NULL,
    FOREIGN KEY (customerId) REFERENCES Customers(id)
);

-- Insert sample customer data
INSERT INTO Customers (id, name) VALUES
(1, 'Joe'),
(2, 'Henry'),
(3, 'Sam'),
(4, 'Max');

-- Insert sample order data
INSERT INTO Orders (id, customerId) VALUES
(1, 3),
(2, 1);

-- Verify data
SELECT * FROM Customers;
SELECT * FROM Orders;