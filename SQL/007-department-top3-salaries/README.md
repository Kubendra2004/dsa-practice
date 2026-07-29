# SQL Problem 007: Department Top 3 Salaries

## Problem Statement
Write a SQL query to find employees who earn in the top 3 salaries of their department. Return department name, employee name, and salary.

## Concept
- **Window Functions** — RANK() or DENSE_RANK() to rank salaries within a department
- **CTE** — common table expression for cleaner structure
- **JOIN** — join ranked results with department table

## Difficulty
Hard

## Schema

### Table: `Employee`
| Column Name    | Type    | Description              |
|----------------|---------|--------------------------|
| id             | INT     | Employee ID (PK)       |
| name           | VARCHAR | Employee name            |
| salary         | INT     | Salary amount            |
| departmentId   | INT     | References Department.id |

### Table: `Department`
| Column Name | Type    | Description            |
|-------------|---------|------------------------|
| id          | INT     | Department ID (PK)    |
| name        | VARCHAR | Department name        |

## Sample Data

**Department:**
```
id | name
---|------
1  | IT
2  | Sales
```

**Employee:**
```
id | name    | salary | departmentId
---|---------|--------|-------------
1  | Joe     | 70000  | 1
2  | Henry   | 80000  | 2
3  | Sam     | 60000  | 2
4  | Max     | 90000  | 1
5  | Janet   | 69000  | 1
6  | Randy   | 85000  | 1
7  | Will    | 70000  | 2
```

## Expected Output

```
department | name  | salary
-----------|-------|-------
IT         | Max   | 90000
IT         | Randy | 85000
IT         | Joe   | 70000
IT         | Janet | 69000
Sales      | Henry | 80000
Sales      | Will  | 70000
Sales      | Sam   | 60000
```

## Constraints
- Each department has at least 3 employees
- Salaries are positive integers

## Hints (Don't peek unless stuck!)
1. Use **DENSE_RANK()** or **RANK()** partitioned by departmentId, ordered by salary DESC.
2. Filter for rank <= 3.
3. Join with the Department table to get department names.
4. A CTE (Common Table Expression) makes the query cleaner.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 8/10