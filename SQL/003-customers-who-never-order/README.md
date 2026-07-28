# SQL Problem 003: Customers Who Never Order

## Problem Statement
Write a SQL query to find all customers who never ordered anything. Return the customer names.

## Concept
- **LEFT JOIN** — join customers with orders, keeping all customers
- **IS NULL** — filter for customers with no matching order row
- **Subquery alternative** — `NOT IN` or `NOT EXISTS` with a subquery

## Difficulty
Easy

## Schema

### Table: `Customers`
| Column Name | Type      | Description      |
|-------------|-----------|------------------|
| id          | INT       | Customer ID (PK) |
| name        | VARCHAR   | Customer name    |

### Table: `Orders`
| Column Name | Type | Description     |
|-------------|------|-----------------|
| id          | INT  | Order ID (PK)   |
| customerId  | INT  | Foreign key to Customers.id |

## Sample Data

**Customers:**
```
id | name
---|---------
1  | Joe
2  | Henry
3  | Sam
4  | Max
```

**Orders:**
```
id | customerId
---|-----------
1  | 3
2  | 1
```

## Expected Output

```
name
------
Henry
Max
```

**Explanation:**
- Joe (id: 1) has order id 2 — excluded
- Henry (id: 2) has no orders — included
- Sam (id: 3) has order id 1 — excluded
- Max (id: 4) has no orders — included

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

**Interview Rating:** 7/10