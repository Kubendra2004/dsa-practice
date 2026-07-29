# SQL Problem 007: Department Top 3 Salaries

## Problem Statement
Write a SQL query to find employees who earn in the top 3 salaries of their department. Return department name, employee name, and salary.

## Algorithm Type

**Window Functions (RANK/DENSE_RANK) + CTE** — rank salaries within each department, then filter for top 3.

## Solution Approach

1. Use a CTE (Common Table Expression) to rank employees by salary within each department.
2. Use **DENSE_RANK()** (or RANK()) partitioned by `departmentId` and ordered by `salary DESC`.
3. Filter for rank <= 3 to get top 3 earners per department.
4. JOIN with the Department table to get department names.

## Core Idea

Window functions allow ranking within partitions without collapsing rows. DENSE_RANK ensures no gaps in ranking (important when salaries tie). The CTE makes the query readable and modular.

## Pseudocode (SQL)

```sql
-- Primary approach: DENSE_RANK window function + CTE
WITH RankedSalaries AS (
    SELECT
        e.name AS EmployeeName,
        e.salary,
        e.departmentId,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS salary_rank
    FROM Employee e
)
SELECT d.name AS Department, r.EmployeeName, r.salary
FROM RankedSalaries r
JOIN Department d ON r.departmentId = d.id
WHERE r.salary_rank <= 3
ORDER BY d.name, r.salary DESC;
```

## Complexity

- Time: `O(n log n)` for window function sorting
- Space: `O(n)` for the CTE result

## Constraints
- Each department has at least 3 employees
- Salaries are positive integers

## Hints (Don't peek unless stuck!)
1. Use **DENSE_RANK()** partitioned by departmentId, ordered by salary DESC.
2. Filter for rank <= 3.
3. Join with the Department table to get department names.
4. A CTE (Common Table Expression) makes the query cleaner.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 8/10 (扣2分: Window functions are advanced SQL, but problem structure follows a standard CTE + RANK pattern)