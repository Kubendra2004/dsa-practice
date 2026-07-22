# SQL Problem 001: Employees by Department

## Problem Statement
Write a SQL query to find the **department name**, **number of employees** in each department, and the **average salary** for each department. Only include departments that have **at least 2 employees**. Order the results by department name alphabetically.

## Concept
- **SELECT, WHERE, GROUP BY, HAVING** — filtering and aggregation
- **JOIN** — combining tables
- **Aggregation functions** — COUNT(), AVG()

## Difficulty
Easy

## Schema

### Table: `departments`
| Column Name | Type     | Description           |
|-------------|----------|-----------------------|
| dept_id     | INT      | Department ID (PK)    |
| dept_name   | VARCHAR  | Department name       |
| location    | VARCHAR  | Department location   |

### Table: `employees`
| Column Name | Type     | Description              |
|-------------|----------|--------------------------|
| emp_id      | INT      | Employee ID (PK)         |
| emp_name    | VARCHAR  | Employee name            |
| dept_id     | INT      | Department ID (FK)       |
| salary      | DECIMAL  | Employee salary          |
| hire_date   | DATE     | Hire date                |

## Sample Data

**departments:**
```
dept_id | dept_name  | location
--------|-----------|----------
1       | Sales     | New York
2       | IT        | San Francisco
3       | HR        | Chicago
4       | Finance   | Boston
5       | Marketing | Seattle
```

**employees:**
```
emp_id | emp_name   | dept_id | salary | hire_date
-------|----------|---------|---------|----------
1      | Alice      | 1      | 50000  | 2020-01-15
2      | Bob        | 1      | 55000  | 2019-03-20
3      | Charlie    | 2      | 75000  | 2018-06-01
4      | David      | 2      | 80000  | 2021-02-10
5      | Eve        | 2      | 70000  | 2020-11-05
6      | Frank      | 4      | 65000  | 2019-09-12
7      | Grace      | 4      | 68000  | 2020-07-08
```

## Expected Output

```
dept_name  | employee_count | avg_salary
-----------|----------------|------------
Finance    | 2              | 66500.00
IT         | 3              | 75000.00
Sales      | 2              | 52500.00
```

**Explanation:**
- HR and Marketing have only 1 employee each, so they are excluded (HAVING clause).
- Results are ordered alphabetically by department name.

## Constraints
- dept_id values are unique in departments table
- Each employee has a valid dept_id that references departments
- Salary values are positive decimals
- At least one department has >= 2 employees

## Hints (Don't peek unless stuck!)
1. You need to **JOIN** the two tables on dept_id.
2. Use **GROUP BY** to aggregate by department.
3. Use **HAVING** to filter groups with at least 2 employees.
4. Use **COUNT()** to count employees, **AVG()** to calculate average salary.
5. Use **ORDER BY** to sort alphabetically.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.
