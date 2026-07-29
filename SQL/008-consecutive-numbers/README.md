# SQL Problem 008: Consecutive Numbers

## Problem Statement
Write a SQL query to find all numbers that appear at least three times consecutively in the Logs table. Return them in any order.

## Concept
- **Self-Join** — join the table to itself to compare consecutive rows
- **Advanced** — window functions or LAG/LEAD for consecutive detection

## Difficulty
Hard

## Schema

### Table: `Logs`
| Column Name | Type | Description       |
|-------------|------|-------------------|
| id          | INT  | Log ID (PK)       |
| num         | INT  | The logged number |

## Sample Data

**Logs:**
```
id | num
---|-----
1  | 1
2  | 1
3  | 1
4  | 2
5  | 1
6  | 2
7  | 2
```

## Expected Output

```
ConsecutiveNums
---------------
1
```

**Explanation:** 1 is the only number that appears three times in a row (id 1, 2, 3).

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

**Interview Rating:** 8/10