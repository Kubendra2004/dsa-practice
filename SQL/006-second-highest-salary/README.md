# SQL Problem 006: Second Highest Salary

## Problem Statement
Write a SQL query to find the second highest salary from the Employee table. If there is no second highest salary, return NULL.

## Algorithm Type

**ORDER BY + LIMIT/OFFSET** — sort descending, skip the top result, take the next one. Subquery handles the edge case of no result.

## Solution Approach

1. Select distinct salary values from the Employee table.
2. Sort in descending order.
3. Skip the first (highest) result using OFFSET 1.
4. Take just the next result using LIMIT 1.
5. Wrap in a subquery to return NULL when no second highest exists.

## Core Idea

Sorting by salary descending and skipping the first row gives the second highest. Wrapping in a subquery ensures NULL is returned instead of an empty result set when no second highest exists.

## Pseudocode (SQL)

```sql
-- Primary approach: ORDER BY + LIMIT + OFFSET wrapped in subquery
SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;

-- Alternative: Using a subquery to exclude the maximum
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
```

## Complexity

- Time: `O(n log n)` for sorting (database-dependent)
- Space: Depends on query optimizer

## Constraints
- The Employee table has at most 25 rows
- Salary values are integers

## Hints (Don't peek unless stuck!)
1. Sort salaries in descending order using `ORDER BY salary DESC`.
2. Use `DISTINCT` to handle duplicate salary values.
3. Use `LIMIT 1 OFFSET 1` to skip the first and get the second.
4. Wrap in a subquery to handle the edge case where there's no second highest (returns NULL).

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 5/10 (扣5分: ORDER BY + LIMIT/OFFSET is a basic SQL pattern, low differentiation between candidates)