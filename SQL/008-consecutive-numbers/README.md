# SQL Problem 008: Consecutive Numbers

## Problem Statement
Write a SQL query to find all numbers that appear at least three times consecutively in the Logs table. Return them in any order.

## Algorithm Type

**Self-Join** — join the table to itself to compare consecutive rows by id. Advanced alternative uses **LAG/LEAD** window functions.

## Solution Approach

1. Use a self-join: join `Logs l1` to `Logs l2` where `l1.id = l2.id - 1` (next row), and to `Logs l3` where `l1.id = l3.id - 2` (row after next).
2. Check if `l1.num = l2.num` AND `l1.num = l3.num` — all three consecutive rows have the same number.
3. Use DISTINCT to avoid duplicates.

Alternative approach:
- Use **LAG()** window function to look back one and two rows, then compare all three values.

## Core Idea

Consecutive rows can be compared by joining on sequential id values. Each row is joined with the two rows that follow it, forming a sliding window of three consecutive records.

## Pseudocode (SQL)

```sql
-- Primary approach: Self-Join
SELECT DISTINCT l1.num AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2 ON l1.id = l2.id - 1
JOIN Logs l3 ON l1.id = l3.id - 2
WHERE l1.num = l2.num
  AND l1.num = l3.num;

-- Alternative: Using LAG window function
WITH Nums AS (
    SELECT
        num,
        LAG(num, 1) OVER (ORDER BY id) AS prev1,
        LAG(num, 2) OVER (ORDER BY id) AS prev2
    FROM Logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM Nums
WHERE num = prev1 AND num = prev2;
```

## Complexity

- Time: `O(n)` for self-join or window function (database-dependent)
- Space: `O(n)` for the window function CTE

## Constraints
- The Logs table has at most 1000 rows
- 1 <= id <= 10^6 (sequential, no gaps)
- -10^9 <= num <= 10^9

## Hints (Don't peek unless stuck!)
1. Use a **self-join** to compare consecutive rows: join `Logs l1` to `Logs l2` where `l1.id = l2.id - 1` and to `Logs l3` where `l1.id = l3.id - 2`.
2. Check if `l1.num = l2.num = l3.num`.
3. Alternatively, use **LAG()** or **LEAD()** window functions to look ahead/behind.
4. Use **DISTINCT** to avoid duplicate results.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 8/10 (扣2分: Consecutive number detection is niche; self-join approach is standard but LAG/LEAD alternative shows deeper SQL knowledge)