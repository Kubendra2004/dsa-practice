-- SQL Problem 001: Employees by Department
-- Write your query below to find department name, employee count, and average salary

-- TODO: Write your SQL query here
-- Expected output:
-- dept_name  | employee_count | avg_salary
-- -----------|----------------|------------
-- Finance    | 2              | 66500.00
-- IT         | 3              | 75000.00
-- Sales      | 2              | 52500.00

SELECT 
    -- TODO: Select department name, count of employees, and average salary
FROM 
    -- TODO: Join departments and employees tables
WHERE
    -- TODO: Optional: add WHERE conditions if needed
GROUP BY
    -- TODO: Group by department
HAVING
    -- TODO: Filter groups with at least 2 employees
ORDER BY
    -- TODO: Order by department name alphabetically
