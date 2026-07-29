# SQL Problem 004: University Database - Basic SELECT/WHERE/ORDER BY

## Problem Statement
Write SQL queries to answer the following questions using the `Students`, `Courses`, and `Enrollments` tables.

## Algorithm Type

**SELECT + WHERE + ORDER BY** — basic filtering, condition matching, and result sorting.

## Solution Approach

1. **SELECT** the columns you need from the relevant table(s).
2. Use **WHERE** to filter rows based on conditions — use comparison operators (`=`, `>`, `<`, `>=`, `<=`) and logical operators (`AND`, `OR`).
3. Use **ORDER BY** to sort the result set — specify `ASC` (ascending, default) or `DESC` (descending).
4. Combine all clauses in a single query: `SELECT ... FROM ... WHERE ... ORDER BY ...`.

## Core Idea

Basic SQL querying is about three operations: selecting which columns to return, filtering which rows to include, and ordering the results. These three clauses form the foundation of all SQL queries.

## Pseudocode

```sql
-- Task 1: Filter by department
SELECT name, age, department
FROM Students
WHERE department = 'Computer Science';

-- Task 2: Filter by grade AND sort
SELECT student_id, course_id, grade
FROM Enrollments
WHERE grade = 'A'
ORDER BY student_id;

-- Task 3: Filter by credit count AND sort
SELECT course_name, credits
FROM Courses
WHERE credits = 3
ORDER BY course_name ASC;

-- Task 4: Filter by age condition AND sort descending
SELECT name, age, department
FROM Students
WHERE age > 20
ORDER BY age DESC;
```

## Complexity

- Time: `O(n)` for table scan (database-dependent with indexes)
- Space: `O(result_size)`

## Constraints
- All tables use INT as primary key type
- Grades are single characters: A, B, or C
- Students may have zero or multiple enrollments

## Hints (Don't peek unless stuck!)
1. Start each query with `SELECT` followed by the columns you need.
2. Use `WHERE` to add conditions — remember `>` for "older than", `=` for equality.
3. Use `ORDER BY column_name ASC` or `ORDER BY column_name DESC` for sorting.
4. Combine `WHERE` and `ORDER BY` in a single query — `WHERE` filters first, then `ORDER BY` sorts the result.

---

**Next Step:** Write your queries in `solution.sql` and verify them against the sample data.

**Interview Rating:** 5/10 (扣5分: 基础SELECT/WHERE/ORDER BY, 区分度低, 不足以区分候选人)