-- SQL Problem 002: Find Duplicate Emails
-- Write your query below to find all duplicate emails

-- Expected output:
-- email
-- ------------------
-- john@example.com
-- jane@example.com

SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;
