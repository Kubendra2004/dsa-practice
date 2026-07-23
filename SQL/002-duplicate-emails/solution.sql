-- SQL Problem 002: Find Duplicate Emails
-- Write your query below to find all duplicate emails

-- TODO: Write your SQL query here
-- Expected output:
-- email
-- ------------------
-- john@example.com
-- jane@example.com

SELECT 
    -- TODO: Select the email addresses that appear more than once
FROM 
    -- TODO: From the Person table
GROUP BY 
    -- TODO: Group by email
HAVING 
    -- TODO: Filter groups where email appears more than once
ORDER BY 
    -- TODO: Order by email alphabetically (optional)
