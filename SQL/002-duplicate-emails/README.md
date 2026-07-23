# SQL Problem 002: Find Duplicate Emails

## Problem Statement
Write a SQL query to find all duplicate emails. Return the email addresses that appear **more than once** in the `Person` table.

## Concept
- **GROUP BY** — grouping by email
- **HAVING** — filtering groups with count > 1
- **SELECT DISTINCT** — optional, for cleaner output

## Difficulty
Easy

## Schema

### Table: `Person`
| Column Name | Type     | Description        |
|-------------|----------|--------------------|
| id          | INT      | Person ID (PK)     |
| email       | VARCHAR  | Email address      |

## Sample Data

**Person:**
```
id | email
---|------------------
1  | john@example.com
2  | jane@example.com
3  | john@example.com
4  | bob@example.com
5  | jane@example.com
6  | jane@example.com
```

## Expected Output

```
email
------------------
john@example.com
jane@example.com
```

**Explanation:**
- `john@example.com` appears 2 times (id: 1, 3)
- `jane@example.com` appears 3 times (id: 2, 5, 6)
- `bob@example.com` appears 1 time (only once, so excluded)

## Constraints
- Each row in the Person table has a unique id
- email can contain any valid email format

## Hints (Don't peek unless stuck!)
1. Use **GROUP BY** to group rows by email.
2. Use **COUNT()** to count how many times each email appears.
3. Use **HAVING** to filter groups where count > 1.
4. **ORDER BY** email alphabetically for cleaner output (optional).

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.
