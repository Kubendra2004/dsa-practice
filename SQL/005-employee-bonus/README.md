# SQL Problem 005: Employee Bonus

## Problem Statement
Write a SQL query to find all employees whose bonus is less than 1000. Return their name and bonus amount (NULL if they have no bonus record).

## Algorithm Type

**LEFT JOIN + IS NULL** — keep all employees and include those without bonus records, then filter.

## Solution Approach

1. Use **LEFT JOIN** from `Employee` to `Bonus` on `Employee.id = Bonus.id`.
2. LEFT JOIN preserves all employee rows even when there's no matching bonus entry.
3. Filter with `WHERE b.amount < 1000 OR b.amount IS NULL` to include both low bonuses and missing bonus records.
4. Alternatively, use `COALESCE(b.amount, 0) < 1000` to treat NULL as 0.

## Core Idea

A LEFT JOIN keeps all rows from the left table. When an employee has no bonus entry, the bonus columns are NULL. The `IS NULL` check combined with the `< 1000` condition captures both explicit low bonuses and missing bonus records.

## Pseudocode (SQL)

```sql
-- Primary approach: LEFT JOIN + IS NULL
SELECT e.name, b.amount
FROM Employee e
LEFT JOIN Bonus b ON e.id = b.id
WHERE b.amount < 1000 OR b.amount IS NULL
ORDER BY e.name;

-- Alternative: Using COALESCE
SELECT e.name, b.amount
FROM Employee e
LEFT JOIN Bonus b ON e.id = b.id
WHERE COALESCE(b.amount, 0) < 1000
ORDER BY e.name;
```

## Complexity

- Time: `O(n + m)` — hash join or merge join depending on DB engine
- Space: Depends on query optimizer

## Constraints
- Employee id is the primary key
- Bonus id references Employee id
- Bonus amount can be NULL (no bonus record)

## Hints (Don't peek unless stuck!)
1. Use a **LEFT JOIN** from Employee to Bonus on `Employee.id = Bonus.id`. This keeps all employees even if they have no bonus record.
2. Use `IS NULL` to check for missing bonus records.
3. Use `OR` to combine the condition `amount < 1000` with `amount IS NULL`.
4. Alternatively, use `COALESCE(b.amount, 0) < 1000` to treat NULL as 0.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 5/10 (扣5分: LEFT JOIN + NULL handling is a fundamental skill, but this problem has limited variation and no complex aggregation)