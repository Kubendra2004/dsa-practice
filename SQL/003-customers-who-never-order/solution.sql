-- SQL Problem 003: Customers Who Never Order
-- Write your query here. The query should return customer names who never ordered.

SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o ON c.id = o.customerId
WHERE o.customerId IS NULL;