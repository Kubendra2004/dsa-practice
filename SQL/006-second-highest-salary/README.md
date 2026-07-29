# SQL Problem 006: Second Highest Salary

## Problem Statement
Write a SQL query to find the second highest salary from the Employee table. If there is no second highest salary, return NULL.

## Concept
- **ORDER BY + LIMIT** — sort descending and skip the top result
- **DISTINCT** — handle duplicate salary values
- **Subquery** — alternative approach using a subquery

## Difficulty
Easy

## Schema

### Table: `Employee`
| Column Name | Type    | Description    |
|-------------|---------|----------------|
| id          | INT     | Employee ID (PK) |
| name        | VARCHAR | Employee name  |
| salary      | INT     | Salary amount  |

## Sample Data

**Employee:**
```
id | name  | salary
---|-------|-------
1  | Joe   | 70000
2  | Henry | 80000
3  | Sam   | 60000
4  | Max   | 90000
5  | Ann   | 70000
```

## Expected Output

```
SecondHighestSalary
-------------------
80000
```

**Explanation:** The highest salary is 90000 (Max). The second highest distinct salary is 80000 (Henry). Ann and Joe both have 70000, which is the third highest.

## Constraints
- The Employee table has at most 25 rows
- Salary values are integers

## Hints (Don't peek unless stuck!)
1. Sort salaries in descending order using `ORDER BY salary DESC`.
2. Use `DISTINCT` to handle duplicate salaries.
3. Use `LIMIT 1 OFFSET 1` to skip the first and get the second.
4. Wrap in a subquery to handle the edge case where there's no second highest (returns NULL).

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 5/10