# SQL Problem 004: University Database - Basic SELECT/WHERE/ORDER BY

## Problem Statement
Write SQL queries to answer the following questions using the `Students`, `Courses`, and `Enrollments` tables.

## Concept
- **SELECT** — retrieve specific columns
- **WHERE** — filter rows based on conditions
- **ORDER BY** — sort results ascending or descending

## Difficulty
Easy

## Schema

### Table: `Students`
| Column Name  | Type      | Description             |
|--------------|-----------|-------------------------|
| id           | INT       | Student ID (PK)        |
| name         | VARCHAR   | Student name            |
| age          | INT       | Student age             |
| department   | VARCHAR   | Department name         |

### Table: `Courses`
| Column Name | Type     | Description            |
|-------------|----------|------------------------|
| id          | INT      | Course ID (PK)        |
| course_name | VARCHAR  | Name of the course     |
| credits     | INT      | Credit hours           |

### Table: `Enrollments`
| Column Name | Type | Description                              |
|-------------|------|------------------------------------------|
| id          | INT  | Enrollment ID (PK)                      |
| student_id  | INT  | Foreign key to Students.id              |
| course_id   | INT  | Foreign key to Courses.id               |
| grade       | VARCHAR | Grade received (A, B, C)             |

## Sample Data

**Students:**
```
id | name    | age | department
---|---------|-----|-------------------
1  | Alice   | 20  | Computer Science
2  | Bob     | 22  | Mathematics
3  | Charlie | 21  | Computer Science
4  | Diana   | 23  | Physics
5  | Eve     | 20  | Mathematics
```

**Courses:**
```
id  | course_name          | credits
----|----------------------|--------
101 | Intro to Programming | 3
102 | Data Structures      | 4
103 | Calculus I           | 4
104 | Quantum Mechanics    | 3
```

**Enrollments:**
```
id | student_id | course_id | grade
---|------------|-----------|------
1  | 1          | 101       | A
2  | 1          | 102       | B
3  | 2          | 103       | A
4  | 3          | 101       | B
5  | 3          | 104       | A
6  | 4          | 104       | C
7  | 5          | 103       | B
```

## Tasks

1. **List all students in the Computer Science department.**
   Use `SELECT` and `WHERE` to filter by department.

2. **Find all enrollments with an A grade, sorted by student_id.**
   Use `SELECT`, `WHERE`, and `ORDER BY`.

3. **List all courses with 3 credits, ordered by course name.**
   Use `SELECT`, `WHERE`, and `ORDER BY`.

4. **Find all students older than 20, ordered by age descending.**
   Use `SELECT`, `WHERE`, and `ORDER BY`.

## Expected Outputs

### Task 1
```
name    | age | department
--------|-----|-------------------
Alice   | 20  | Computer Science
Charlie | 21  | Computer Science
```

### Task 2
```
student_id | course_id | grade
-----------|-----------|------
1          | 101       | A
3          | 101       | B
3          | 104       | A
```

### Task 3
```
course_name          | credits
---------------------|--------
Intro to Programming | 3
Quantum Mechanics    | 3
```

### Task 4
```
name    | age | department
--------|-----|-------------------
Diana   | 23  | Physics
Bob     | 22  | Mathematics
Charlie | 21  | Computer Science
```

## Constraints
- All tables use INT as primary key type
- Grades are single characters: A, B, or C
- Students may have zero or multiple enrollments

## Hints (Don't peek unless stuck!)
1. Start each query with `SELECT` followed by the columns you need.
2. Use `WHERE` to add conditions — remember to use `>` for "older than", `=` for equality.
3. Use `ORDER BY column_name ASC` or `ORDER BY column_name DESC` for sorting.
4. Combine `WHERE` and `ORDER BY` in a single query — `WHERE` filters first, then `ORDER BY` sorts the result.

---

**Next Step:** Write your queries in `solution.sql` and verify them against the sample data.

**Interview Rating:** 5/10