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
    d.dept_name,
    COUNT(e.emp_id) AS employee_count,
    AVG(e.salary) AS avg_salary
FROM 
    departments d
    INNER JOIN employees e ON d.dept_id = e.dept_id
GROUP BY 
    d.dept_name
HAVING 
    COUNT(e.emp_id) >= 2
ORDER BY 
    d.dept_name ASC;
