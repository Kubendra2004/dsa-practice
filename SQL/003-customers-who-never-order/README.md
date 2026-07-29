# SQL Problem 003: Customers Who Never Order

## Problem Statement
Write a SQL query to find all customers who never ordered anything. Return the customer names.

## Algorithm Type

**LEFT JOIN + IS NULL** — keep all customers, join orders, and filter for unmatched rows.

## Solution Approach

1. Start with the `Customers` table as the primary (left) table.
2. **LEFT JOIN** the `Orders` table on `Customers.id = Orders.customerId`.
3. Rows where `Orders.id` is NULL indicate customers with no matching order.
4. SELECT the customer name from these unmatched rows.

Alternative approaches:
- `WHERE Customers.id NOT IN (SELECT customerId FROM Orders)`
- `WHERE NOT EXISTS (SELECT 1 FROM Orders WHERE Orders.customerId = Customers.id)`

## Core Idea

A LEFT JOIN preserves all rows from the left table. When there's no matching row in the right table, the right table columns are NULL. Filtering for NULL in the right table's key column identifies unmatched rows.

## Pseudocode (SQL)

```sql
-- Approach 1: LEFT JOIN + IS NULL (recommended)
SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o ON c.id = o.customerId
WHERE o.customerId IS NULL;

-- Approach 2: NOT IN subquery
SELECT c.name AS Customers
FROM Customers c
WHERE c.id NOT IN (
    SELECT customerId FROM Orders
);

-- Approach 3: NOT EXISTS
SELECT c.name AS Customers
FROM Customers c
WHERE NOT EXISTS (
    SELECT 1 FROM Orders o WHERE o.customerId = c.id
);
```

## Complexity

- Time: `O(n * m)` for nested loop join / `O(n + m)` with hash join depending on the DB engine
- Space: Depends on the query optimizer

## Constraints
- Each customer has a unique id
- Orders table may be empty
- A customer id in Orders is guaranteed to exist in Customers

## Hints (Don't peek unless stuck!)
1. Use a **LEFT JOIN** from Customers to Orders on `Customers.id = Orders.customerId`.
2. Rows where `Orders.id` is NULL are customers with no orders.
3. Alternatively, use `WHERE Customers.id NOT IN (SELECT customerId FROM Orders)`.
4. Alternatively, use `WHERE NOT EXISTS (SELECT 1 FROM Orders WHERE Orders.customerId = Customers.id)`.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 7/10 (扣3分: LEFT JOIN + IS NULL 是经典套路, 但 NOT EXISTS 写法在高级面试中更受青睐)